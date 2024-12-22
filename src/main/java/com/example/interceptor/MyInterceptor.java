package com.example.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("前置方法: MyInterceptor.preHandle执行");
        return false;
    }
    @Override
    public void afterCompletion(HttpServletRequest request,HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("完成时方法: MyInterceptor.afterCompletion执行");
    }
    /*@Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, javax.servlet.ModelAndView modelAndView) throws Exception {
        System.out.println("后置方法: MyInterceptor.postHandle执行");
    }*/
}
