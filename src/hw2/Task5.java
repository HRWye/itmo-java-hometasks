package hw2;
public class Task5 {
    public static void main(String[] args) {
    /*Задача по решению на уроке.
    Сократить условия в блоках if;
    int month = 5;
    if (month > 0 && month < 3 || month == 12) {
        System.out.println("Зима");
    } else if (month > 2 && month < 6) {
        System.out.println("Весна");
    } else if (month > 5 && month < 9){
        System.out.println("Лето");
    } else if (month > 8 && month < 11) {
        System.out.println("Осень");
    } else {
        System.out.println("Ошибка");
    }
    */
        int month = 5;
        if (month>12||month<1) System.out.println("Ошибка");
        else if (month>11)System.out.println("Зима");
        else if (month>8)System.out.println("Осень");
        else if (month>5)System.out.println("Лето");
        else if (month>1)System.out.println("Весна");
        else System.out.println("Зима");}}