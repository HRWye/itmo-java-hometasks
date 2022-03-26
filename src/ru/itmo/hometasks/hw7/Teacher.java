package ru.itmo.hometasks.hw7;

public class Teacher extends Worker {

    public Teacher(String name, int age, int levelOfKnowledge, String lesson) {
        super(name, age, lesson, levelOfKnowledge);
    }
    public void teaching(Student student){
        if (getLesson().equals(student.getLesson())){student.learning(this);}
    }
}
