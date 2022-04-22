package com.example.aspects;

import java.time.Instant;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect

@Component
public class LoggerAspect {

	 private Logger logger = Logger.getLogger(LoggerAspect.class.getName());

     @Around("execution(* com.example.aspectexample.*.*(..))")
     public void log(ProceedingJoinPoint joinPoint) throws Throwable
     {
    	 logger.info(joinPoint.getSignature().toString());
        // Instant start = Instant.now();
         joinPoint.proceed();
        // Instant finish = Instant.now();
         logger.info("finished aop for this method");
     }

}
