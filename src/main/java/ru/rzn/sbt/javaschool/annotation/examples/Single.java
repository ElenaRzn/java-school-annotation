package ru.rzn.sbt.javaschool.annotation.examples;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
    int value();
}

public class Single {
    @MySingle(100100)
    public static void myMeth() {
        Single ob = new Single();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            MySingle anno = m.getAnnotation (MySingle.class);
            System.out.println(anno.value());
        } catch (NoSuchMethodException e) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String args[]) {
        myMeth();
    }

    // TODO перепешите аннотацию и вывод таким образом, чтобы выводилось 100 100
}
