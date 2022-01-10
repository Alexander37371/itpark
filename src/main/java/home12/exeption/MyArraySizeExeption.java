package home12.exeption;

import static home12.Matrix.*;

public class MyArraySizeExeption extends RuntimeException {

    private final int wrongRows;
    private final int wrongColumns;

    public MyArraySizeExeption(int wrongRows, int wrongColumns, String message) {
        super(String.format("%s. Количество строк в матрице ожидалось равным %d, а количество колонок, равным %d", message, ROWS, COLUMNS));
        this.wrongRows = wrongRows;
        this.wrongColumns = wrongColumns;
    }

    public int getWrongRows() {
        return wrongRows;
    }

    public int getWrongColumns() {
        return wrongColumns;
    }
}
