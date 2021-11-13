package lesson3;

import java.util.Scanner;

public class ThirdLessonRunner {
    public static void main(String[] arg) {

        double a, b, c;
        double D;

        System.out.println("Вычисление корней квадратного уравнения (a*x^+b*x+c=0)");
        System.out.println("Введите а, b, c");

        Scanner in = new Scanner(System.in);

        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        D = b * b - 4 * a * c;

        if (a==0)
            System.out.println("Первый коэффициент не может быть 0");

        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);

        } else {
            System.out.println("Нет действительных решений уравнения");

        }
    }
}