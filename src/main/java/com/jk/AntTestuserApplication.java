package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-provider.xml"})
@MapperScan("com.jk.dao")
public class AntTestuserApplication {

	public static void main(String[] args) {
		SpringApplication.run(AntTestuserApplication.class, args);
	}


}
