package com.gjw.log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @version 1.0
 * @author: gjw
 * @date: 2021/6/1 14:52
 * @desc:
 */

public class AfterLog implements AfterReturningAdvice {

    @After("execution(* com.gjw.service.impl.UserServiceImpl.*(..))")
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("after执行了"+target.getClass().getName()+"方法名为："+method.getName()+"返回的参数值："+returnValue);
    }
}
