package home12;

import home12.exeption.MyArrayDataExeption;
import home12.exeption.MyArraySizeExeption;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Matrix {

    public static final int ROWS = 4;

    public static final int COLUMNS = 4;

    private static final List<String> SYMBOLS = List.of("22", "10", "78", "22", "-7", "28", "17", "8", "12", "54",
            "31", "13", "55", "32", "-66");

    private List<List<String>> values;

    public Matrix(int n, int m) {
        if (n != ROWS || m != COLUMNS) {
            throw new MyArraySizeExeption(n, m, "Произошла ошибка во время инициализации матрицы");

        }
        this.values = new ArrayList<>(n);
        fillup(n, m);

    }

    public void fillup(int n, int m) {
        for (int i = 0; i < n; i++) {
            List<String> Lines = new ArrayList<>(m);
            this.values.add(Lines);
            for (int j = 0; j < n; j++) {
                int randomIndex = new Random().nextInt(SYMBOLS.size());
                Lines.add(SYMBOLS.get(randomIndex));
            }
        }
    }

    public int sum() {
        int result = 0;
        for (int i = 0; i < this.values.size(); i++) {
            List<String> row = this.values.get(i);
            for (int j = 0; j < row.size(); j++) {
                String value = row.get(j);
                if (!value.matches("^(-*(\\d)+)$")) {
                    throw new MyArrayDataExeption(i + 1, j + 1, "Некорректное значение в качестве элемента матрицы");
                }
                result += Integer.parseInt(value);
            }
        }
        return result;
    }

    public void print() {
        for (List<String> lines : this.values) {
            System.out.println(lines);
        }
    }
}