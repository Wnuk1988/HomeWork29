package com.SOLID.InterfaceSegregation;

public class Book implements Printable {
    String name;
    String surname;
    int year;
    Book(String name, String surname, int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.printf("Книга: %s\t Автор: %s\t Год издания: %d\n",name,surname,year);
    }
}
