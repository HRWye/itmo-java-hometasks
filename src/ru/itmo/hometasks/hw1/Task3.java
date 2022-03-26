package ru.itmo.hometasks.hw1;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
/*3. Задача на арифметические операторы
Даны длина, ширина и высота прямоугольного параллелепипеда. Найти и вывести в консоль его площадь.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину прямоугольного параллелепипеда: ");
        double a = sc.nextDouble();
        System.out.print("Введите ширину прямоугольного параллелепипеда: ");
        double b = sc.nextDouble();
        System.out.print("Введите высоту прямоугольного параллелепипеда: ");
        double c = sc.nextDouble();
        System.out.println("Площадь равна: " + 2 * (a * b + b * c + a * c));}}