package com.ma.aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by mh on 2018/7/16.
 */
@Aspect
@Component
public class StudentAspect {
//    @Before("execution(public * com.ma.web.StudentController.*(..))")
//    public void log(){
//        System.out.println("1111111111111111111111111111");
//    }
    Logger logger = LoggerFactory.getLogger(StudentAspect.class);

    @Pointcut("execution(public * com.ma.web.StudentController.*(..))")
    public void log(){
    }

    @Before("log()")
    public void doBefore(){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest httpRequest = attributes.getRequest();
        logger.info("url={}",httpRequest.getRequestURL());
        logger.info("method={}",httpRequest.getMethod());
        logger.info("id={}",httpRequest.getRemoteAddr());
    }

    @After("log()")
    public void doAfter(){
        logger.info("222222222222222222222222");
    }

}
