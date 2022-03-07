package hw2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
/*
Задача на if
Дана целочисленная переменная count - количество верных ответов.
В зависимости от значения этой переменной вывести в консоль оценку:
100 - 90 правильных ответов - отлично
89 - 60 правильных ответов - хорошо
59 - 40 правильных ответов - удовлетворительно
39 - 0 правильных ответов - попробуйте в следующий раз
*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество верных ответов: ");
        byte count = sc.nextByte();
        if (count<=100&&count>=90) System.out.println("Оценка: отлично");
        else if (count<90&&count>=60)System.out.println("Оценка: хорошо");
        else if (count<60&&count>=40)System.out.println("Оценка: удовлетворительно");
        else if (count<40&&count>=0)System.out.println("Попробуйте в следующий раз");
        else System.out.println("Введите количество своих верных ответов корректно");}}