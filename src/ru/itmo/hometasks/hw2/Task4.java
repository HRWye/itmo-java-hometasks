package ru.itmo.hometasks.hw2;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
/*
Задача на if
Даны переменные age и exp.
Если значение переменной age больше 100, вывести в консоль "Мы Вам перезвоним".
В противном случае перейти к проверке exp.
Если значение exp меньше 5, вывести в консоль "Вы подходите на должность стажера".
Если значение exp больше или равно 5, вывести в консоль "Вы подходите на должность разработчика".
 */
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите свой возраст: ");
        byte age = sc.nextByte();
        System.out.print("Введите свой опыт работы: ");
        byte exp = sc.nextByte();
        if (age>100) System.out.println("Мы Вам перезвоним");
        else if (exp<5) System.out.println("Вы подходите на должность стажера");
        else System.out.println("Вы подходите на должность разработчика");}}