package com.vishuo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mac on 2017/12/22.
 */
@Controller  //注解使类生效
public class TestController {

    //指定请求和方法
    //@RequestMapping(value = "baseType.do",method = RequestMethod.GET)如果这样的话，只有get请求才能访问

    @RequestMapping(value = "baseType.do")
    @ResponseBody
    public String baseType(@RequestParam(value = "xage") int age){
        //RequestParam设置别名
        return "age:"+age;
    }
}
