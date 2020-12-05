package ru.rzn.sbt.javaschool.lombok;

import lombok.Getter;
import lombok.Setter;

public class Problem1 {

    // Согласно спецификации JavaBeans, нам следует поля делать
    // private`ными, и писать для них getter`ы и setter`ы. Но почему мы обязаны это
    // писать?

    static class Example {
        @Getter
        @Setter
        private int x = 100500;
    }

//    public static void main(String[] args) {
//        System.out.println(new Example().getX());
//    }
}
