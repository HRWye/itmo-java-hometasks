package ru.itmo.hometasks.hw4;
import java.util.Arrays;
public class Task5 {
    public static void main(String[] args) {
/*
Задача 5.
Задать массив.
Отрицательные элементы массива перенести в новый массив.
Размер массива должен быть равен количеству отрицательных элементов.
 */
        int n = (int) (Math.random()*50);
        int[] mas = new int[n];
        int i, j;
        int count =0;
        for (i=0;i<n;i++){mas[i]=((int)(Math.random()*200)-100); if (mas[i]<0)count++;}
        int[] maso = new int[count];
        for (j=0,i=0;j<count;j++,i++){if (mas[i]<0)maso[j]=mas[i];else j--;}
        System.out.println("Исходный массив: "+ Arrays.toString(mas)+"\nМассив отрицательных чисел: "+Arrays.toString(maso));
    }
}
