package hw5;
import java.util.Arrays;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
/*
Задача 1.
Задать массив на N слов. В цикле считывать с консоли слова (scanner.nextLine()), и добавлять их в массив (добавлять новое слово в массив можно только,
если в нем его еще нет).
В итоге в массиве будут только уникальные слова.
Выход их программы по слову exit (слово 'exit' в массив не добавлять)
или если массив заполнен Перед завершением программы, вывести получившийся массив в консоль
 */
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = sc.nextInt();
        String word;
        String[] words = new String[n];
        for (int i=0;i<n;i++){
            System.out.print("Введите "+(i+1)+" слово: ");
            word= sc.nextLine();
            if (word.equalsIgnoreCase("exit"))break;
            words[i]=word;
            for (int k=(i-1);k>=0;k--){
            if (word.equalsIgnoreCase(words[k])) {System.out.println("Такое слово уже есть.");i--;break;}}
        }
        System.out.println("Получившийся массив: "+Arrays.toString(words));
    }
}
