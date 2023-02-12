package Main;

public class Battle {
    public static Battle battle = new Battle();
    public static final boolean REVERSE_INDEX = true;

    public Field field;
    public Team team1;
    public Team team2;

    public void setField(int rows, int columns) {
        this.field = new Field(rows, columns);
    }

    public void setTeam1(int castleRow, int castleColumn) {
        this.team1 = new Team(castleRow - 1, castleColumn - 1);
    }

    public void setTeam2(int castleRow, int castleColumn) {
        this.team2 = new Team(castleRow - 1, castleColumn - 1, Battle.REVERSE_INDEX);
    }

    public static int reverseIndex (int index) {
        return battle.field.rows - index - 1;
    }
}