package ru.itmo.hometasks.hw7;

public class Student extends Worker {

    public Student(String name, int age, int levelOfKnowledge, String lesson) {
        super(name, age, lesson, levelOfKnowledge);
    }

    public void learning(Teacher teacher){
        setLevelOfKnowledge(Math.min((int)(Math.random()*teacher.getLevelOfKnowledge()+getLevelOfKnowledge()),teacher.getLevelOfKnowledge()));
    }
}
