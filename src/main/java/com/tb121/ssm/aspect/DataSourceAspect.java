package com.tb121.ssm.aspect;


import org.aspectj.lang.JoinPoint;

public class DataSourceAspect {
    public void before(JoinPoint joinPoint){
        String method=joinPoint.getSignature().getName();
        System.out.println("method:"+method);
    }
}
