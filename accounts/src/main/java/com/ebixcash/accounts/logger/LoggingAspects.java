package com.ebixcash.accounts.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Aspect
@Slf4j
public class LoggingAspects {
    private static final Logger logger = LoggerFactory.getLogger(LoggingAspects.class);

    @Before("execution(* com.ebixcash.accounts.*.*(..))")
    public void logBeforeMethod(JoinPoint joinPoint) {
        logger.info("Executing method: " + joinPoint.getSignature().getName());
        logger.info("With arguments: ");
        for (Object arg : joinPoint.getArgs()) {
            logger.info("    " + arg);
        }
    }

}