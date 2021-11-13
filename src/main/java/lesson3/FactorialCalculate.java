package lesson3;

import java.util.Scanner;

public class FactorialCalculate {
    public static void main(String[] args) {
        System.out.println("Вычисление факториала числа n!");
        System.out.println("Введите число");

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}