package ru.itmo.hometasks.hw7;

public class Worker extends Human{
    private String lesson;
    private int levelOfKnowledge;

    public String getLesson() {
        return lesson;
    }
    public void setLesson(String lesson) {
        if (lesson==null||lesson.length()<=2){throw new IllegalArgumentException("Название предмета должно состоять более чем из 2 букв");}
        this.lesson = lesson;
    }

    public int getLevelOfKnowledge() {
        return levelOfKnowledge;
    }
    public void setLevelOfKnowledge(int levelOfKnowledge) {
        if (levelOfKnowledge<0){throw new IllegalArgumentException("Уровень знаний должен быть положительным числом");}
        this.levelOfKnowledge = levelOfKnowledge;
    }

    public Worker(String name, int age, String lesson, int levelOfKnowledge) {
        super(name, age);
        setLesson(lesson);
        setLevelOfKnowledge(levelOfKnowledge);
    }
}
