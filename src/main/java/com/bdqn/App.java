package com.bdqn;

import com.bdqn.jedis.RedisUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
//        System.out.println( "Hello World!" );
      /*  Jedis jedis = new Jedis("localhost",6379);
        jedis.auth("root");*/
//        RedisUtils redisUtils = new RedisUtils();
//        System.out.println(redisUtils.jsonStringToJson("{\"id\":\"100078\",\"userCode\":\"myusercode\",\"userPassword\":\"78ujsdlkfjoiiewe98r3ejrf\",\"userType\":\"1\",\"flatID\":\"10008989\"}"));

       /* Jedis jedis   = redisUtils.getJedis();
        System.out.println(jedis.ping());*/
//        {"id":"29","userCode":"itrip@163.com","userName":"桃子","activated":"1","userPassword":"e10adc3949ba59abbe56e057f20f883e","userType":"0","flatID":"31","createdBy":"null","creationDate":"null"}
//        redisUtils.setJsonString("1qaz2wsx",redisUtils.jsonStringToJson("  {\"id\":\"29\",\"userCode\":\"itrip@163.com\",\"userName\":\"桃子\",\"activated\":\"1\",\"userPassword\":\"e10adc3949ba59abbe56e057f20f883e\",\"userType\":\"0\",\"flatID\":\"31\",\"createdBy\":\"null\",\"creationDate\":\"null\"}"));
    }
}
