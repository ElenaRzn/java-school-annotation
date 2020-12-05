package ru.rzn.sbt.javaschool.runtime;

import java.lang.reflect.Field;
import java.util.Arrays;

public class ToStrings {
    //TODO Создание обработчика собственной аннотации в runtime
//    public static String toString(Object obj) {
//        return null;
//    }

    public static String toString(Object obj) {
        if(obj == null) return "null";

        Class clazz = obj.getClass();
        ToString annotation = (ToString) clazz.getAnnotation(ToString.class);
        if(annotation == null && Arrays.stream(clazz.getDeclaredFields()).allMatch(x -> x.getAnnotation(ToString.class) == null)) {
            return obj.toString();
        }

        StringBuilder result = new StringBuilder();
        if(annotation != null && annotation.includeName()) {
            result.append(clazz.getName());
        }
        result.append("[");
        boolean first = true;

        for (Field field: clazz.getDeclaredFields()) {
            ToString fieldAnnotation = field.getAnnotation(ToString.class);
            if(fieldAnnotation != null) {
                if(first) {
                    first = false;
                } else {
                    result.append(", ");
                }
                field.setAccessible(true);
                if(fieldAnnotation.includeName()) {
                    result.append(field.getName()).append(" = ");
                }
                try {
                    result.append(ToStrings.toString(field.get(obj)));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
        }

        return result.append("]").toString();
    }

//    public static String toString(Object obj) {
//        if (obj == null) return "null";
//        Class clazz = obj.getClass();
//        ToString annotation = (ToString) clazz.getAnnotation(ToString.class);
//        // Аннотации нет ни над самим классом, ни над его полями
//        if (annotation == null && Arrays.stream(clazz.getDeclaredFields()).allMatch(x -> x.getAnnotation(ToString.class) == null)) {
//            return obj.toString();
//        }
//
//        // все таки что-то надо делать - заводим переменную для ответа
//        StringBuilder result = new StringBuilder();
//        if (annotation != null && annotation.includeName()) {
//            result.append(clazz.getName());
//        }
//        result.append("[");
//
//        Arrays.stream(clazz.getDeclaredFields())
//                .filter(x -> x.getAnnotation(ToString.class) != null)
//                .map(x -> itemToString(x, obj))
//                .forEach(result::append);
//
//        return result.substring(0, result.lastIndexOf(",") != -1 ? result.lastIndexOf(",") : result.length()) + "]";
//    }
//
//
//    private static String itemToString(Field x, Object obj) {
//        x.setAccessible(true);
//        String result = (x.getAnnotation(ToString.class).includeName() ? x.getName() + " = " : "");
//        try {
//            result += (ToStrings.toString(x.get(obj)));
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        return result += ", ";
//    }

}

