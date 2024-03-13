package com.mericaltikardes.learnspringaop.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Only wok in methods for
@Target(ElementType.METHOD)
//Only works in runtime for
@Retention(RetentionPolicy.RUNTIME)
public @interface TrackTime { }
