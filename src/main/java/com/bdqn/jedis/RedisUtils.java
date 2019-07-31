package com.bdqn.jedis;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: RedisUtils
 * @Description:Redis工具类
 * @Author: amielhs
 * @Date 2019-07-31
 */
public class RedisUtils {

   /* public void setJsonString(String key, Object object) {
        Jedis jedis = getJedis();
        jedis.rpush(key, JSONObject.toJSONString(object));
        jedis.close();
    }*/


   /* public Jedis getJedis() {
        Jedis jedis = new Jedis("localhost", 6379);
        jedis.auth("root");
        return jedis;
    }*/

   /* public Object getJsonObject(String key, Class clazz, int start, int end) {
        Jedis jedis = getJedis();
        List<String> value = jedis.lrange("uaList", start, end);
        jedis.close();
        List<Object> list = new ArrayList<>();
        for (String va : value) {
            Object obj = JSON.parseObject(va, clazz);
            list.add(obj);
        }
        return list;

    }*/

    /*public Object jsonStringToJson(String jsonStr){
        return JSON.toJSON(jsonStr);
    }*/

}
