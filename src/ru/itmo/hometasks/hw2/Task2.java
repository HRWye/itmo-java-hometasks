package ru.itmo.hometasks.hw2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
/*
Задача на switch
Пользователь вводит 3 числа: первый операнд, второй операнд, оператор.
В зависимости от третьего введенного числа нужно вывести в консоль: сумму, разность, умножение, деления чисел, которые ввел пользователь.
Если третье введенное число: 3, нужно найти сумму, 5 - разность, 7 - результат умножения, 9 - результат деления.
*/
    Scanner sc =new Scanner(System.in);
        System.out.print("Введите первый операнд: ");
        double x1 = sc.nextDouble();
        System.out.print("Введите второй операнд: ");
        double x2 = sc.nextDouble();
        System.out.print("Введите оператор: ");
        byte x3 = sc.nextByte();
        if (x3!=3&&x3!=5&&x3!=7&&x3!=9) System.out.println("Попробуйте задать другой оператор");
    switch (x3){
        case 3:
            System.out.println("Сумма операндов: "+(x1+x2));
            break;
        case 5:
            System.out.println("Разность операндов: "+(x1-x2));
            break;
        case 7:
            System.out.println("Произведение операндов: "+(x1*x2));
            break;
        case 9:
            System.out.println("Деление операндов: "+(x1/x2));
            break;
    /*
    Как я понимаю можно было записать и так:
    switch (x3) {
            case 3 -> System.out.println("Сумма операндов: " + (x1 + x2));
            case 5 -> System.out.println("Разность операндов: " + (x1 - x2));
            case 7 -> System.out.println("Произведение операндов: " + (x1 * x2));
            case 9 -> System.out.println("Деление операндов: " + (x1 / x2));
     */
    }}}