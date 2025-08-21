package com.powernode.springboot.component;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // 记录日志的工具
    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    // 定义切入点，匹配所有以 "service" 结尾的包下的所有方法
    // 切入点表达式
    @Pointcut("execution(* com.powernode.springboot.service..*(..))")
    public void serviceMethods() {
    }

    // 在切入点的方法执行前执行此方法
    // 前置通知
    @Before("serviceMethods()")
    public void logBefore(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        logger.info("方法 [{}] 携带的 [{}] 被调用了.", methodName, args);
    }
}