package Main;

public class Ice extends Hero {
    public Ice(Team team, int row, int column) {
        this(team, row, column, false);
    }

    public Ice(Team team, int row, int column, boolean reverseIndex) {
        super(team,5, 100, 1, row, column, reverseIndex);
    }
}
