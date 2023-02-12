package Main;

public class Wind extends Hero {
    public Wind(Team team, int row, int column, boolean reversed) {
        super(team, 5, 40, 2, row, column, reversed);
    }

    public Wind(Team team, int row, int column) {
        super(team, 5, 40, 2, row, column, false);
    }
}
