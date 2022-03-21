package ru.itmo.hometasks.hw7.task1.base;

import ru.itmo.hometasks.hw7.task1.Director;
import ru.itmo.hometasks.hw7.task1.Student;
import ru.itmo.hometasks.hw7.task1.Teacher;

public class School {
    private final String  title;
    private Director directorOfSchool;

    private Teacher[] teachers = new Teacher[2];
    public void addTeacher(Teacher teacher){
    for (int i=0;i< teachers.length;i++){
        if (teachers[i]==null){
            teachers[i]=teacher;
            return;
        }
    }
        System.out.println("Учителей в школе максимальное число");
    }
    public void addTeacher(Teacher...teachers){
        for(Teacher teacher:teachers){
            addTeacher(teacher);
        }
    }

    private Student[] students = new Student[4];
    public void addStudent(Student student){
        for (int i=0;i< students.length;i++){
            if (students[i]==null){
                students[i]=student;
                return;
            }
        }
        System.out.println("Учеников в школе максимальное число");
    }
    public void addStudent(Student...students){
        for (Student student:students){
            addStudent(student);
        }
    }

    public void setTitle(String title) {
        if (title==null||title.length()<3){throw new IllegalArgumentException("Название состоять более чем из 2 символов");}
    }
    public School(String title, Director directorOfSchool) {
        setTitle(title);
        this.title = title;
        this.directorOfSchool=directorOfSchool;
    }

    public void newDayAtSchool(){
     directorOfSchool.setStartOfTheLessons();
            for (Teacher teacher: teachers){
                for (Student student:students){
                    if(teacher.getLesson().equals(student.getLesson())){
                    student.learning();
                    System.out.println("У ученика "+student.getName()+" к концу дня уровень знаний равен "+student.getLevel()+" (учитель: "+teacher.getName()+")");}
                }
            }
        directorOfSchool.setEndOfTheLessons();
    }
}
