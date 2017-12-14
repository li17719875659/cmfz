package com.baizhi.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义切面
 *
 * @AUTHOR licy
 * @create 2017-12-13-14:09
 */
@Configuration
@Aspect
public class MyAdvice {

    @Before("execution(* com.baizhi.service.*.*(..))")
    public void before(JoinPoint joinPoint){
        System.out.println("进入前置切面");
    }
}
