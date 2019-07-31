package com.bdqn.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bdqn.pojo.ItripUser;
import com.bdqn.response.CommonReturnType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName: RedisController
 * @Description:Redis
 * @Author: amielhs
 * @Date 2019-07-31
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/test")
    public CommonReturnType test(){
        /*stringRedisTemplate.opsForValue().set("test","i love u");*/
        ItripUser itripUser = new ItripUser();
        itripUser.setActivated(1);
        itripUser.setId(29L);
        itripUser.setUserCode("itrip@163.com");
        itripUser.setUserName("桃子");
        itripUser.setFlatID(31L);
        itripUser.setUserPassword("e10adc3949ba59abbe56e057f20f883e");
        itripUser.setUserType(0);
        itripUser.setCreatedBy(0L);
        itripUser.setCreationDate(null);
//        stringRedisTemplate.opsForValue().set("token:1qaz2wsx", String.valueOf((JSONObject) JSON.toJSON(itripUser)));
        stringRedisTemplate.opsForValue().set("1qaz2wsx", String.valueOf((JSONObject) JSON.toJSON(itripUser)));
//        return CommonReturnType.create(stringRedisTemplate.opsForValue().get("test"));
//        return CommonReturnType.create(stringRedisTemplate.opsForValue().get("token:1qaz2wsx"));
        return CommonReturnType.create(stringRedisTemplate.opsForValue().get("1qaz2wsx"));
    }
}
