package com.gjw.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @author: gjw
 * @date: 2021/6/1 16:16
 * @desc:
 */

@Aspect
@Component
public class AnnotationPointCut {

    @Before("execution(* com.gjw.service.impl.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("前置通知：方法执行前");
    }

    @After("execution(* com.gjw.service.impl.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("后置通知：方法执行后");
    }

    @Around("execution(* com.gjw.service.impl.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        System.out.println("签名："+joinPoint.getSignature());
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);

    }

}
