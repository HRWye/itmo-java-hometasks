package ru.itmo.hometasks.hw4;
import java.util.Arrays;
public class Task4 {
    public static void main(String[] args) {
/*
Задача 4.
Задан одномерный массив целых чисел.
Образуйте из него два отсортированных по возрастанию массива, содержащих четные и нечетные числа.
 */
        int n = (int) (Math.random()*50);
        int[] mas = new int[n];
        int i, j, k;
        int countp =0, counto =0;
        for (i=0;i<n;i++){mas[i]=((int)(Math.random()*200)-100); if (mas[i]%2==0)countp++;else counto++;}
        int[] masp = new int[countp];
        for (j=0,i=0;j<countp;j++,i++){if (mas[i]%2==0)masp[j]=mas[i];else j--;}
        Arrays.sort(masp);
        int[] maso = new int[counto];
        for (k=0, i=0;k<counto;k++,i++){if (mas[i]%2!=0)maso[k]=mas[i];else k--;}
        Arrays.sort(maso);
        System.out.println("Исходный массив: "+ Arrays.toString(mas)+"\nМассив четных чисел: "+Arrays.toString(masp)+"\nМассив нечетных чисел: "+Arrays.toString(maso));
        }
    }
