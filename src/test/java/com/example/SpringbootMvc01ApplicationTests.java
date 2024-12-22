package com.example;

import com.example.mapper.SpStudentMapper;
import com.example.pojo.SpStudent;
import com.example.service.SpStudentService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringbootMvc01ApplicationTests {
    @Resource
    private SpStudentMapper mapper;
    //private SpStudentService service;

    @Test
    void contextLoads() {
        //service.list().forEach(System.out::println);
        SpStudent byId = mapper.selectById(1L);
        System.out.println(byId);
    }

}
