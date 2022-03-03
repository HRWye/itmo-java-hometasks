package hw1;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
/*2. Задача на арифметические операторы.
Найти сумму цифр 2‑х значного числа.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите двухзначное число: ");
        byte x = sc.nextByte();
        int res2 = x % 10;
        x /= 10;
        res2 += x % 10;
        System.out.println("Сумма цифр этого числа: " + res2);}}