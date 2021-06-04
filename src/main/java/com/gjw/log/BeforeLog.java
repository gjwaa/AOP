package com.gjw.log;

import org.aspectj.lang.annotation.Before;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
/**
 * @version 1.0
 * @author: gjw
 * @date: 2021/6/1 14:46
 * @desc:
 */
public class BeforeLog implements MethodBeforeAdvice {

    @Before("execution(* com.gjw.service.impl.UserServiceImpl.*(..))")
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("before执行了"+target.getClass().getName()+"方法名为："+method.getName());
    }
}
