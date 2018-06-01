package com.jk.mysql;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * Spring AOP对注解的拦截
 */
@Aspect
@Component
public class ReadOnlyConnectionInterceptor implements Ordered {

    public static final Logger logger = LoggerFactory.getLogger(ReadOnlyConnectionInterceptor.class);

    /**
     * 切换到从库
     *
     * @param proceedingJoinPoint
     * @param readOnlyConnection
     * @return
     * @throws Throwable
     */
    @Around("@annotation(readOnlyConnection)")
    public Object proceed(ProceedingJoinPoint proceedingJoinPoint, ReadOnlyConnection readOnlyConnection) throws Throwable {
        try {
//            logger.info("设置只读数据库");
            DbContextHolder.setDbType(DbContextHolder.DbType.SLAVE);
            Object result = proceedingJoinPoint.proceed();
            return result;
        } finally {
            DbContextHolder.clearDbType();
            logger.info("restore database connection==========================从==========================================================================");
        }
    }


    @Override
    public int getOrder() {
        return 0;
    }
}
