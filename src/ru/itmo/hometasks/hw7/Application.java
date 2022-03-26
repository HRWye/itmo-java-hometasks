package ru.itmo.hometasks.hw7;

public class Application {
    public static void main(String[] args) {
        School school = new School("Школа №5",new Director("Петр Иванович",54));

        Teacher teacher1 = new Teacher("Леокадия Александровна", 50, 70,"Математика");
        Teacher teacher2 = new Teacher("Петр Евгеньевич", 35, 100,"Информатика");

        Student student1 = new Student("Богдан", 14,2,"Математика");
        Student student2 = new Student("Саша", 14,20,"Математика");
        Student student3 = new Student("Андрей", 14,30,"Информатика");
        Student student4 = new Student("Слава", 14,25,"Информатика");

        school.addTeacher(teacher1);
        school.addStudent(student1, student2, student3);

        school.newDayAtSchool();
    }

}
