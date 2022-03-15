package hw5;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
/*
Задача 3.
Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.
 */
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String sent= sc.nextLine();
        String[] sentArr=sent.split(" ");
        int[] length = new int[sentArr.length];
        char[] firstWord=sentArr[0].toCharArray();
        int firstWordL= firstWord.length;
        String maxWord = null;
        for (int i=1;i<sentArr.length;i++){
            char[] letters=sentArr[i].toCharArray();
            length[i]= letters.length;
            if (length[i]>firstWordL){maxWord=sentArr[i];firstWordL=length[i];}
        }
        System.out.println("Самое длинное слово: "+maxWord);
    }
}
