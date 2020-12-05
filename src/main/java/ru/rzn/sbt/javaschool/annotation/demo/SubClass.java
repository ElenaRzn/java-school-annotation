package ru.rzn.sbt.javaschool.annotation.demo;

public class SubClass extends SuperClass {
    @Override
    public void print() {
        System.out.println("Hello from SubClass");
    }

    public static void main(String[] args) {
        SubClass child = new SubClass();
        MyHierarchy annotation = child.getClass().getAnnotation(MyHierarchy.class);
        if(annotation != null) {
            System.out.println("Annotation present");
        }
    }

//    @Override
//    public String toString(int x) {
//        return super.toString();
//    }

//    @Override
//    public boolean equals(SubClass obj) {
//        return super.equals(obj);
//    }
}
