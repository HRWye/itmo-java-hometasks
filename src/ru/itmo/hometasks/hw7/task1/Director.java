package ru.itmo.hometasks.hw7.task1;

import ru.itmo.hometasks.hw7.task1.base.Human;

public class Director extends Human {

    public Director(String name, int age) {
        super(name, age);
        this.name=name;
    }

    public void setStartOfTheLessons() {
        System.out.println("Директор "+getName()+" объявляет начало занятий!");
    }

    public void setEndOfTheLessons() {
        System.out.println("Директор "+getName()+ " объявляет конец занятий!");
    }




}
