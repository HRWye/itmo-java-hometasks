package hw5;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
/*
Задача 4.
Определить, является ли строка полиндромом.
 */
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = sc.nextLine();
        int i;
        char[] letters;
        String strMain = null, strMainRev = null;
        if (str.contains(" ")){
        String[] strArr=str.split(" ");
        StringBuilder strNew= new StringBuilder(strArr[0]);
        for (i=1; i<strArr.length; i++) {strMain= String.valueOf(strNew.append(strArr[i]));}
        letters=strMain.toCharArray();}
        else{letters=str.toCharArray();strMain=str;}
        StringBuilder strMainRevB= new StringBuilder();
        for (i=(letters.length-1); i>=0; i--) {strMainRev= String.valueOf(strMainRevB.append(letters[i]));}
        if (strMain.equalsIgnoreCase(strMainRev)) System.out.println("Это полиндром");else System.out.println("Это не полиндром");
    }
}
