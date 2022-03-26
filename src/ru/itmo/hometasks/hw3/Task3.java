package ru.itmo.hometasks.hw3;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
/*
Задача на цикл.
1. Программа загадывает число в диапазоне [1;9]
2. Пользователь вводит число с клавиатуры
3. Программа в зависимости от введенного числа выводит в консоль следующее:
   a. "загаданное число больше"
   b. "загаданное число меньше"
   c. "Вы угадали" (программа завершает работу)
4. Если введен 0, вывести "выход из программы" (программа завершает работу)
 */
        int random = (int) (Math.random()*(10-1)+1);
        Scanner sc = new Scanner(System.in);
        System.out.print("Угадайте число от 1 до 9 (введите 0 для выхода из программы): ");
        byte num = sc.nextByte();
        do {
        if(num==0) {System.out.println("Вы вышли из программы"); break;}
        if (num>random) {System.out.print("Загаданное число меньше (введите заново): "); num = sc.nextByte();}
        else if(num<random) {System.out.print("Загаданное число больше (введите заново): "); num = sc.nextByte();}
        else if(num==random) {System.out.println("Вы угадали, это число "+random+"!");break;}} while (true);}}
