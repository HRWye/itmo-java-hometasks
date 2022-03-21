package ru.itmo.hometasks.hw7.task1;

import ru.itmo.hometasks.hw7.task1.base.Human;

public class Student extends Human {
    private  String lessonOfTeacher;
    private int levelOfTeacher;

    public  Student(String name, int age, int level, String lesson, Teacher levelOfTeacher){
        super(name, age, level, lesson);
        if (level>levelOfTeacher.getLevel()){throw new IllegalArgumentException("Уровень ученика должен быть меньше уровня учителя!");}
        this.level=level;
        this.lesson=lesson;
        this.levelOfTeacher=levelOfTeacher.getLevel();
        this.lessonOfTeacher=levelOfTeacher.getLesson();
    }

    public void learning(){
        level= (int) Math.min(levelOfTeacher,level+Math.random()*(levelOfTeacher+1));
    }


}
