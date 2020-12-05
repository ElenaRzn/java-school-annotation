package ru.rzn.sbt.javaschool.annotation.base;

/**
 * Пример использования аннотации.
 */
public class FruitUse {
    @Fruit(count = 10)
    public static void getFruitsCount() {
        System.out.println("Программа выполнилась успешно");
    }

    public static void main(String[] args) {
        getFruitsCount();
    }
}
