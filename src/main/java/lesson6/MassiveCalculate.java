package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class MassiveCalculate {

    public static void main(String[] args) {
        System.out.println("Укажите длину массива");
        int arrayLength = getArrayLength();
        int[] array = findArray(arrayLength);
        System.out.println(Arrays.toString(array));
        int max = getMaxValue(array);
        System.out.println("Max в массиве: " + max);
        int min = getMinValue(array);
        System.out.println("Min в массиве: " + min);
        double avg = getAvg(array);
        System.out.println("Среднее арифметическое в массиве: " + avg);
    }

    private static double getAvg(int[] array) {
        double avg = 0;
        for (int digit : array) {
            avg += digit;
        }
        avg /= array.length;
        return avg;
    }


    private static int getMaxValue(int[] array) {
        int max = array[0];
        for (int digit: array) {
            if (digit > max) {
                max = digit;


            }
        }
        return max;
    }

    private static int getMinValue(int[] array) {
        int min = array[array.length - 1];
        for (int index = array.length - 2; index >= 0; index --) {
            int digit = array[index];
            if (digit < min) {
                min = digit;

            }
        }
        return min;
    }

    private static int[] findArray(int arrayLength) {
        int [] digits = new int [arrayLength];
        for (int index = 0; index < arrayLength; index++) {
            digits[index] = Math.round((float) Math.random() * 1000);
        }
        return digits;
    }

    private static int getArrayLength() {
        Scanner scanner = new Scanner (System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Ввод значения подразумевает целое число");
            scanner.next();
        }
        return scanner.nextInt();
    }
}



