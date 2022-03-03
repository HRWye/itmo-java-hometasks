package hw1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
/*1. Задача на тернарный оператор:
Дана переменная sum - сумма покупки.
Если сумма покупки больше 100000, то вывести в консоль сумму к оплате с учетом скидки в 10%,
в противном случае вывести в консоль сумму к оплате без скидки.*/
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите сумму покупки: ");
    double sum = sc.nextDouble();
    double res1 = sum > 100000 ? sum - sum * 10 / 100 : sum;
    System.out.println("Сумма с учетом скидки: " + res1);}}