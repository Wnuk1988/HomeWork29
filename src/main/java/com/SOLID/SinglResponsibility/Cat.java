package com.SOLID.SinglResponsibility;

import java.util.Scanner;

public class Cat {
    String name;
    int age;
    Scanner eat;
    int userFeed = 0;

    private int amountOfFood() {
        boolean isCorrect = false;
        while (!isCorrect) {
            System.out.println("Введите (целое число) количество корма, данное коту в граммах:");
            eat = new Scanner(System.in);
            if (eat.hasNextInt()) {
                userFeed = eat.nextInt();
                isCorrect = true;
            } else {
                System.out.println("Вы ввели не целое число.");
            }
        }
        return userFeed;
    }

    public void feeding() {
        amountOfFood();
        if (userFeed > 100) {
            System.out.println("Кот наелся.");
        } else {
            System.out.println("Кот не наелся!");
        }
    }

    public void displayInfo() {
        System.out.printf("Имя кота: %s\t Возраст: %d года\n", name, age);
    }
}
