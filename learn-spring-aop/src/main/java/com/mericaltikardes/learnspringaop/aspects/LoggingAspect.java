package com.mericaltikardes.learnspringaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
    private Logger logger= LoggerFactory.getLogger(getClass());

    //Pointcut- When?
    //execution(/PACKAGE.*.*(..)))->Where
    //@Before("execution(* com.mericaltikardes.learnspringaop.*.*.*(..))")
    //Bu şekilde pointcut configuration yapılabilir. Daha clean code
    @Before("com.mericaltikardes.learnspringaop.aspects.CommonPointcutConfig.businessAndDataPackageConfig()")
    public void logMethodCallBeforeExecution(JoinPoint joinPoint){
        logger.info("Before Aspects - Method is called -> {} with arguments {}",joinPoint,joinPoint.getArgs());
    }

    @After("execution(* com.mericaltikardes.learnspringaop.*.*.*(..))")
    public void logMethodCallAfterExecution(JoinPoint joinPoint){
        logger.info("After Aspects - has executed -> {}",joinPoint);
    }

    @AfterThrowing(value = "execution(* com.mericaltikardes.learnspringaop.*.*.*(..))",
    throwing = "exception")
    public void logMethodCallAfterException(JoinPoint joinPoint,Exception exception){
        logger.info("AfterThrowing Aspects -{} has thrown an exception ->  {}",joinPoint,exception);
    }

    @AfterReturning(value = "execution(* com.mericaltikardes.learnspringaop.*.*.*(..))",
            returning = "resultValue")
    public void logMethodCallAfterSuccessfulException(JoinPoint joinPoint,Object resultValue){
        logger.info("AfterThrowing Aspects -{} has returned ->  {}",joinPoint,resultValue);
    }
}
