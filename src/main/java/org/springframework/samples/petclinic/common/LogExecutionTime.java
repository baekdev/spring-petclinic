package org.springframework.samples.petclinic.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author baekdev
 * @since 2020-04-03
 * https://baek.dev
 */
@Target(ElementType.METHOD)         // 어디서 사용할지
@Retention(RetentionPolicy.RUNTIME) // 언제까지 실행될지
public @interface LogExecutionTime {
}
