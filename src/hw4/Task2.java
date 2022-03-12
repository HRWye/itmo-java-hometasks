package hw4;
import java.util.Arrays;
import java.util.Collections;
public class Task2 {
    public static void main(String[] args) {
/*
Задача 2.
Создайте массив из чётных чисел [2;20] и выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2).
 */
//1 Способ
        int[] mas1 = new int[20 / 2];
        for (int i=0; i< mas1.length;i++){if (i==0)mas1[i]=2; else mas1[i]= (2+mas1[i-1]);}
        System.out.println("Первый способ.\nОригинальный массив: "+ Arrays.toString(mas1));
        for (int i=0; i< mas1.length;i++)mas1[i]*=-1;
        Arrays.sort(mas1);
        for (int i=0; i< mas1.length;i++)mas1[i]*=-1;
        System.out.println("Отсортированный массив: "+ Arrays.toString(mas1));
//2 Способ
        Integer[] mas2 = new Integer[20 / 2];
        for (int i=0; i< mas2.length;i++){if (i==0)mas2[i]=2; else mas2[i]= (2+mas2[i-1]);}
        System.out.println("Второй способ.\nОригинальный массив: "+ Arrays.toString(mas2));
        Arrays.parallelSort(mas2, Collections.reverseOrder());
        System.out.println("Отсортированный массив: "+ Arrays.toString(mas2));
    }
}
