package ru.itmo.hometasks.hw7.task1;

import ru.itmo.hometasks.hw7.task1.base.Human;

public class Teacher extends Human {
    private Student student;


    public  Teacher(String name, int age,int level, String lesson){
        super(name, age, level, lesson);
        this.level=level;
        this.lesson=lesson;
    }

}
