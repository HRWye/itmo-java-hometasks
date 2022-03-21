package ru.itmo.hometasks.hw7.task1.base;

public class Human {
    protected String name;
    protected int age;
    protected int level;
    protected String lesson;

    public void setName(String name) {
        if (name==null||name.length()<3){throw new IllegalArgumentException("Имя должно состоять более чем из 2 символов");}
        this.name = name;
    }

    public void setAge(int age) {
        if (age<6){throw new IllegalArgumentException("Человеку в этой задаче должно быть больше 5 лет");}
        this.age = age;
    }

    public Human(String name, int age) {
        setName(name);
        this.name = name;
        setAge(age);
        this.age = age;
    }

    public Human(String name, int age, int level, String lesson) {
        setName(name);
        this.name = name;
        setAge(age);
        this.age = age;
        if (level<0||level>100){throw new IllegalArgumentException("Уровень знаний должен быть в диапазоне от 0 до 100");}
        this.level=level;
        if (lesson==null||lesson.length()<3){throw new IllegalArgumentException("Название предмета должно состоять более чем из 2 символов");}
        this.lesson=lesson;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getLevel() {
        return level;
    }

    public String getLesson() {
        return lesson;
    }
}
