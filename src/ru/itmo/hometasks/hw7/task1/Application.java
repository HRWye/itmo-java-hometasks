package ru.itmo.hometasks.hw7.task1;

import ru.itmo.hometasks.hw7.task1.base.School;

public class Application {
    public static void main(String[] args) {
        School school = new School("Школа №5",new Director("Петр Иванович",54));

        Teacher teacher1 = new Teacher("Ирина Витальевна", 50, 70,"Математика");
        Teacher teacher2 = new Teacher("Петр Евгеньевич", 35, 100,"Информатика");

        Student student1 = new Student("Вася", 14,2,"Математика", teacher1);
        Student student2 = new Student("Петя", 14,20,"Математика", teacher1);
        Student student3 = new Student("Коля", 14,30,"Информатика", teacher2);
        Student student4 = new Student("Наташа", 14,25,"Информатика", teacher2);

        school.addTeacher(teacher1, teacher2);
        school.addStudent(student1, student2, student3, student4);

        school.newDayAtSchool();
    }
}
