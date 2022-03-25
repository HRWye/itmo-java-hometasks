package ru.itmo.hometasks.hw6.task3;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
       Mouse mouse1 = new Mouse(15);
       Mouse mouse2 = new Mouse(20);
       Mouse mouse3 = new Mouse(50);
       Mouse mouse4 = new Mouse(10);

       Cat cat1 = new Cat("Васька", 55, 10);
       Cat cat2 = new Cat("Мурзик", 55, 50);

       cat1.trapThisMouse(mouse1,mouse2,mouse4,mouse3);
       cat2.trapThisMouse(mouse3,mouse4);

       cat1.catFightsCat(cat2);
    }
}
