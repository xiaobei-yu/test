package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class HelloController {
    @GetMapping("/test1")
    public String test1(@PathVariable Integer id){
        return "链接表达式，传递路径参数为:"+id;
    }
    public String test2(Integer id,String name){
        return "链接表达式,传递的普通参数为: "+id+"..."+name;
    }
}
