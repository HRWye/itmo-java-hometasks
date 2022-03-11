package hw3;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
/*
Задача на while.
Для введённого пользователем с клавиатуры целого положительного числа посчитайте сумму всех его цифр.
 */
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int num = sc.nextInt();
        if (num<0){System.out.println("Введите корректное число!");
            System.out.print("Введите еще раз: ");
            num = sc.nextInt();}
        int res = num%10;;
        while (num>0){num/=10;res+=num%10;}
        System.out.println("Сумма цифр этого числа: " + res);}}
