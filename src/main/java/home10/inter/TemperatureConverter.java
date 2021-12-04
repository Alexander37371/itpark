package home10.inter;

import home10.newinter.Convertable;
import home10.newinter.Printable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureConverter implements Convertable, Printable {


    @Override
    public void convert() throws IOException {

        double a, b, g;
        System.out.println("Конвертер температур.");
        System.out.println("Если вы хотите узнать температуру в Фаренгейтах, нажмите кнопку 1, если в Цельсиях нажмите кнопку 2.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String d = reader.readLine();
        a = Float.parseFloat(d);

        if (a == 1) {
            System.out.println("Введите количество градусов в Цельсиях: ");
            String s = reader.readLine();
            b = Float.parseFloat(s);
            b = b * 1.8 + 32;
            System.out.println("Температура в Фаренгейтах равна: " + b + "F");
        } else if (a == 2) {
            System.out.println("Введите количество градусов в Фаренгейтах: ");
            String s = reader.readLine();
            g = Float.parseFloat(s);
            g = (g - 32) * 5 / 9;
            System.out.println("Температура в Цельсиях равна: " + g + "C");
        } else if (a >= 2 || a <= 0) {
            System.out.println("Ошибка! Нажмите кнопку 1 или 2");
        }
    }

    public void print() {
        System.out.println("Благодарим за использование нашего конвертера");
    }
}





