package ru.itmo.hometasks.hw1;
public class Task4 {
    public static void main(String[] args) {
        //4. Объяснить причину ошибок.
       /*
        float a = 45.6; Необходимо явно задать переменную a типа float (можно просто поставить в конце букву f)
        long b = 60000;
        long c =a / b; Результатом деления будет число типа float, поэтому меняем тип переменной с на float
        если переменную с явно задать как long (long c = (long) (a/b)), то результатом всегда будет 0.
         */
        /*
         int x = 34;
         long y = 78;
         int z = x / y; как и в первом случае если переменную z явно задать как int, то всегда будет 0,
         если эту переменную задать как float или double, то тоже будет 0.0
         для адекватного отображения z необходимо переменную x и z задать как float
         */
        /*
        double n = 90.8;
        double m = -100.1;
        int max = n > m ? n : m; ошибка в том, что переменная max тоже должна быть double как и переменные которые сравниваются
         */
        /*
        byte code = 1;
        boolean isActive = (boolean) code; переменная типа boolean может иметь только логические значения true/false
        поэтому переменной isActive дать тип byte, но можно и short, int, long, double, float
         */
    }}
