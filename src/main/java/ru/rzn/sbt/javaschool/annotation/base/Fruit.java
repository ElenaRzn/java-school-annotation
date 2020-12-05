package ru.rzn.sbt.javaschool.annotation.base;

/**
 * Пример аннотации, присутствуют два поля.
 */
public @interface Fruit {

    String color() default "green";

    int count();
}
