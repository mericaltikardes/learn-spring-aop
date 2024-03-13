package com.mericaltikardes.learnspringaop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class PerformanceTrackingAspect {
    private Logger logger= LoggerFactory.getLogger(getClass());

    //@Around("execution(* com.mericaltikardes.learnspringaop.*.*.*(..))")
    @Around("com.mericaltikardes.learnspringaop.aspects.CommonPointcutConfig.trackTimeAnnotation()")
    public Object findExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //Start a timer
        long startTimeMillis=System.currentTimeMillis();
        //Execute the method
        Object returnValue=proceedingJoinPoint.proceed();
        //Stop the timer
        long stopTimeMilis=System.currentTimeMillis();

        long executionDuration=stopTimeMilis-startTimeMillis;

        logger.info("After Aspects {}- has executed -> {}",executionDuration,proceedingJoinPoint);

        return returnValue;

    }

}
