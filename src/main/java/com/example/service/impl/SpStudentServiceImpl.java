package com.example.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mapper.SpStudentMapper;
import com.example.pojo.SpStudent;
import com.example.service.SpStudentService;
@Service
public class SpStudentServiceImpl extends ServiceImpl<SpStudentMapper, SpStudent> implements SpStudentService{

}
