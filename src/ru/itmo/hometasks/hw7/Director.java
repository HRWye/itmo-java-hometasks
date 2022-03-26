package ru.itmo.hometasks.hw7;

public class Director extends Human{
    public Director(String name, int age) {
        super(name, age);
    }

    public void setStartOfTheLessons(){
        System.out.println(getName()+" объявляет начало занятий");
    }


    public void setEndOfTheLessons(){
        System.out.println(getName()+" объявляет конец занятий");
    }
}
