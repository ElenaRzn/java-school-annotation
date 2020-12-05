package ru.rzn.sbt.javaschool.annotation.examples;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Аннотация-маркер
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {
}
