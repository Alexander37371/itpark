package home12.exeption;

public class MyArrayDataExeption extends NumberFormatException {

    private final int wrongRow;
    private final int wrongColumn;

    public MyArrayDataExeption(int row, int column, String message) {
        super(String.format("%s. Ошибка произошла на строке %d и в столбце %d", message, row, column));
        this.wrongRow = row;
        this.wrongColumn = column;
    }
}
