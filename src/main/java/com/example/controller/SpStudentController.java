package com.example.controller;

import com.example.pojo.SpStudent;
import com.example.service.SpStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

//@RestController
@Controller
@RequestMapping("/student")
public class SpStudentController {
    @Resource
    private SpStudentService studentService;

    @GetMapping("/studentList")
    public String studentList(Model model){
        List<SpStudent> studentList = studentService.list();
        model.addAttribute("stuList",studentList);
        return "student/stuList";
    }

    //跳转到修改页面  显示要修改的内容
    @GetMapping("/toUpdate")
    public String toUpdate(Model model){
        //查询要修改的内容
        SpStudent student = studentService.getById(1L);
        model.addAttribute("student",student);
        //将查到的内容显示在修改页面上
        return "student/update";
    }

    //执行修改
    @PostMapping("/update")
    public String update(SpStudent student,Model model){
        //执行修改
        studentService.updateById(student);
        //再次根据id查询修改成功的学生
        model.addAttribute("student",studentService.getById(student.getUid()));
        return "student/show";
    }

    //根据id查询
    @GetMapping("/findById/{id}")
    public SpStudent findById(@PathVariable("id") Long uid){
        return studentService.getById(uid);
    }
}
