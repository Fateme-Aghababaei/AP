package Main;

import java.util.ArrayList;

public class Cell {
    int row;
    int column;
    ArrayList<Hero> heroes;

    Cell (int row, int column) {
        this.row = row;
        this.column = column;
        heroes = new ArrayList<>();
    }

}
