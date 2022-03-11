package hw3;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
/*
Задача на цикл.
1. Пользователь загадывает число в диапазоне от [2 до 100]
2. Программа пытается его угадать (используйте метод бинарного поиска - деление отрезка на 2).
3. Программа может задавать пользователю вопросы: Число равно ...? / Число больше ...? / Число меньше ...? и в зависимоcти от ответа пользователя принимать решения.
4. Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА
 */
        System.out.printf("Загадайте число в диапазоне от [2 до 100]\nВ ответах на вопросы используйте числа 0 - НЕТ и 1 - ДА\n");
        Scanner sc = new Scanner(System.in);
       int n =50;
       int f = 0;
       while (true){
           System.out.print("Число равно "+n+"?: ");
           byte ans = sc.nextByte();
           if (ans==0){
               System.out.print("Число больше "+n+"?: ");
               ans = sc.nextByte();

               if (ans==0){ if (f==0)
                   {f=n-n/2;
                   if (f<2)f=2; else{
                   System.out.print("Число меньше "+f+"?: ");
                   ans = sc.nextByte();
                   if (ans==0){n=n-(n-f)/2;}
                   else if (ans==1){f=(f-2)/2;}}}

               else { n-=(f-n)/2;
                   if (f<2)f=2; else{
                       System.out.print("Число меньше "+f+"?: ");
                       ans = sc.nextByte();
                       if (ans==0){n=n-(n-f)/2;}
                       else if (ans==1){f=(f-2)/2;}}}}

               else if (ans==1){ if (f==0)
                   {f=n+n/2;if (f>100)f=100; else{
                       System.out.print("Число меньше "+f+"?: ");
                       ans = sc.nextByte();
                       if (ans==0){n=f+(100-f)/2;}
                       else if (ans==1){n=n+(f-n)/2;}}}

               else { n+=(f-n)/2;
                   if (f>100)f=100; else{
                   System.out.print("Число меньше "+n+"?: ");
                   ans = sc.nextByte();
                   if (ans==0){n+=(100-f)/2;}
                   else if (ans==1){n+=(n-f)/2;}}}}
           }
           else if (ans==1){System.out.println("Вы угадали!");break;}
       }
}}
