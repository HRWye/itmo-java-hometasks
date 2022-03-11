package hw3;
public class Task1 {
    public static void main(String[] args) {
/*
Задача на for.
Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
 */
        System.out.println("Выводим последовательность: ");
        for(int start=1, count=1;count<=55;start+=2, count++){System.out.println(count+". "+start);}}}
