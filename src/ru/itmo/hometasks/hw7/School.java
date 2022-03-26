package ru.itmo.hometasks.hw7;

public class School {
    private final String title;
    private Director director;
    private Teacher[] teachers = new Teacher[2];
    private Student[] students = new Student[4];

    public String getTitle() {
        return title;
    }

    public School(String title, Director director) {
        if (title==null||title.length()<=2){throw new IllegalArgumentException("Название школы должно состоять более чем из 2 символов");}
        this.title = title;
        this.director = director;
    }

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

    public void newDayAtSchool(){
        System.out.println("Начинается новый день в школе");
        director.setStartOfTheLessons();
        for (Teacher teacher: teachers){
            if (teacher!=null){
            for (Student student:students){
                if (student!=null){
                teacher.teaching(student);
                    System.out.println("У ученика "+student.getName()+"  уровень знаний стал равен "+student.getLevelOfKnowledge()+" (учитель: "+teacher.getName()+")");
                }
            }
            }
        }
        director.setEndOfTheLessons();
        System.out.println("Закончился день в школе");
        }
}
