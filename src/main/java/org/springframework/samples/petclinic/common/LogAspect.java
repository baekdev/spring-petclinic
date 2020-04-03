package org.springframework.samples.petclinic.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 * @author baekdev
 * @since 2020-04-03
 * https://baek.dev
 */
@Component // Bean으로 등록
@Aspect    // TODO.
public class LogAspect {

    Logger logger = LoggerFactory.getLogger(LogAspect.class);

    // Around를 사용하면 JoinPoint를 Param으로 받을 수 있고
    // JoinPoint는 @LogExecutionTime 이 붙은 메서드 대상
    @Around("@annotation(LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object proceed = joinPoint.proceed();

        stopWatch.stop();
        logger.info(stopWatch.prettyPrint());

        return proceed;
    }

}
