package com.springapp.mvc.advice;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * Created by abhay on 17/09/15.
 */


public class LoggingAdvice {



    public Object doLog(ProceedingJoinPoint proceedingJoinPoint)
    {

        Object[] args = proceedingJoinPoint.getArgs();
        Method annotatedMethod = ((MethodSignature)proceedingJoinPoint.getSignature()).getMethod();
        if( annotatedMethod.isAnnotationPresent(DetailedLogging.class))
        {

        }
        try {
            Logger LOG = Logger.getLogger(proceedingJoinPoint.getSignature().getDeclaringType());

            for(Object arg : args)
            {
                LOG.info("Arguments Passed : "+ arg.getClass().getSimpleName() +" : " +arg.getClass().cast(arg).toString());
            }

            Object returnedValue = proceedingJoinPoint.proceed();

            LOG.info("Returned Value : "+ ((null !=returnedValue) ? returnedValue.toString() : null));

            return returnedValue;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }


}
