package Main;

public class Fire extends Hero {
    public Fire(Team team, int row, int column, boolean reversed) {
        super(team, 20, 40, 1, row, column, reversed);
    }

    public Fire(Team team, int row, int column) {
        this(team, row, column, false);
    }
}
