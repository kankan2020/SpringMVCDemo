package com.fencer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/app")
public class LoginController{
	 //注释
     @RequestMapping(value="/welcome")  //welcome要访问的url地址
        public  String  hello(){
            System.out.println("hello,springmvc");
            return "hello";  //hello是逻辑视图名,和后缀名组合一起构成视图名  /web-inf/view/hello.jsp,
        }
}
