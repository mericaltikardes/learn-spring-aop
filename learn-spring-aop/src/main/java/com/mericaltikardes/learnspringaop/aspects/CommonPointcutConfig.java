package com.mericaltikardes.learnspringaop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {

    @Pointcut("execution(* com.mericaltikardes.learnspringaop.*.*.*(..))")
    public void businessAndDataPackageConfig(){}

    @Pointcut("execution(* com.mericaltikardes.learnspringaop.service.*.*(..))")
    public void businessPackageConfig(){}
    @Pointcut("execution(* com.mericaltikardes.learnspringaop.repository.*.*(..))")
    public void dataPackageConfig(){}

    @Pointcut("bean(*Service*)")//Tüm service classları
    public void serviceBeanConfigPackageWithBean(){}

    @Pointcut("@annotation(com.mericaltikardes.learnspringaop.annotations.TrackTime)")
    public void trackTimeAnnotation(){}
}
