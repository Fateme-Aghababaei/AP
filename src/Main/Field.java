package Main;

public class Field {
    int rows;
    int columns;
    Cell[][] cells;

    Field (int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        cells = new Cell[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
}