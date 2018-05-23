package com.jk.dao;
import com.jk.model.Share;
import com.jk.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Testdao {
      List<User> query();



      List<Share> sharelist(@Param("qiandata")String qiandata,@Param("hodata") String  hodata);

}
