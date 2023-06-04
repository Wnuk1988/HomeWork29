package com.SOLID.SinglResponsibility;

import java.util.Scanner;

public class Cat {
    String name;
    int age;
    Scanner eat;
    boolean isCorrect = false;
    int userFeed = 0;

    private int amountOfFood(){
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
    public void feeding(){
        displayInfo();
        amountOfFood();
        if (userFeed > 100){
            System.out.println("Кот наелся.");
        }else {
            System.out.println("Кот не наелся!");
        }
    }
    private void displayInfo(){
        System.out.printf("Имя кота: %s\t Возраст: %d года\n", name, age);
    }
}
