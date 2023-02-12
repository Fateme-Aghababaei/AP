package Main;

public class Soil extends Hero {
    public Soil(Team team, int row, int column, boolean reversed) {
        super(team, 10, 60, 1, row, column, reversed);
    }

    public Soil (Team team, int row, int column) {
        this (team, row, column, false);
    }
}
