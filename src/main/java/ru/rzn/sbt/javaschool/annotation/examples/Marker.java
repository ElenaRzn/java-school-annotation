package ru.rzn.sbt.javaschool.annotation.examples;

import java.lang.reflect.Method;

public class Marker {
    // аннотировать метод с помощью маркера
    // Обратите внимание на обязательность скобок ()
    @MyMarker
    public static void myMeth() {

        // Создать объект класса.
        Marker ob = new Marker();
        try {
            // Получить объект аннотированного метода
            Method m = ob.getClass().getMethod("myMeth");
            // определить наличие аннотации
            if (m.isAnnotationPresent(MyMarker.class)) {
                System.out.println("Aннoтaция-мapкep MyMarker присутствует.");
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void maiп(String args[]) {
        myMeth();
    }
}
