package com.gjw.diy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @author: gjw
 * @date: 2021/6/1 16:54
 * @desc:
 */

//@Aspect
public class SystemLogAspect {

//    @Pointcut("execution(* com.gjw.service.impl.UserServiceImpl.*(..))")
    public void controllerAspect() {
        System.out.println("111");
    }

//    @Around("controllerAspect()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前..");
        System.out.println("签名："+joinPoint.getSignature());
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后..");
        System.out.println(proceed);
        System.out.println(joinPoint.getArgs()[0]+",,,"+joinPoint.getArgs()[1]);

    }
}
