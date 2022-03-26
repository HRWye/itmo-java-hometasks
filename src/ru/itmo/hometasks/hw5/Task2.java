package ru.itmo.hometasks.hw5;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
/*
Задача 2.
Заменить все буквы в слове на строчные, а первую букву на заглавную. Например, дано hello, получаем Hello / дано HeLLO, получаем Hello.
 */
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = sc.nextLine();
        char[] letters=word.toCharArray();
        String firstletter= String.valueOf(letters[0]);
        StringBuilder newword=new StringBuilder(firstletter.toUpperCase());
        for (int i=1;i< letters.length;i++){
            String anotherletter= String.valueOf(letters[i]);
            newword.append(anotherletter.toLowerCase());
        }
        System.out.println("Полученный результат: "+newword);
    }
}
