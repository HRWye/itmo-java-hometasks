package ru.itmo.hometasks.hw4;
import java.util.Arrays;
public class Task3 {
    public static void main(String[] args) {
/*
Задача 3.
Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив в консоль.
Определите какой элемент встречается в массиве чаще всего и выведите информацию об этом в консоль.
Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
 */
        int[] mas = new int[11];
        int count1=0, count2=0, count3=0;
        for (int i=0;i<11; i++){
            mas[i]= ((int)(Math.random()*3)-1);
            if (mas[i]==-1)count1++;
            else if (mas[i]==0)count2++;
            else count3++;
        }
        System.out.println("Массив: "+ Arrays.toString(mas));
        if (count1>count2&&count1>count3) System.out.println("Элемент -1 встречается чаще всего: "+count1+" раз");
        else if (count2>count1&&count2>count3) System.out.println("Элемент 0 встречается чаще всего: "+count2+" раз");
        else if (count3>count1&&count3>count2) System.out.println("Элемент 1 встречается чаще всего: "+count3+" раз");
    }
}
