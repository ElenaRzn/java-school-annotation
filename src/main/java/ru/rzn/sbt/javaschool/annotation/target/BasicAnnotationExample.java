package ru.rzn.sbt.javaschool.annotation.target;

@UniversalAnnotation
public class BasicAnnotationExample {
    @UniversalAnnotation
    private String field = "This is String field";

    @UniversalAnnotation
    public BasicAnnotationExample() {
    }

    @UniversalAnnotation
    private void printText(@UniversalAnnotation String text) {
        @UniversalAnnotation String localVariable = "This is local String variable";
        System.out.println(text);
    }

    @UniversalAnnotation
    public static void main(@UniversalAnnotation String[] args) {
        System.out.println("Success");
    }
}
