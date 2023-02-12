package Main;

import java.util.ArrayList;

public class Team {
    Castle castle;
    ArrayList<Hero> heroes;
    int score;

    Team (int castleRow, int castleColumn, boolean reversed) {
        if (reversed) {
            castleRow = Battle.reverseIndex(castleRow);
        }
        this.castle = new Castle(250, castleRow, castleColumn);
        this.heroes = new ArrayList<>();
        this.score = 0;
    }

    Team (int castleRow, int castleColumn) {
        this(castleRow, castleColumn, false);
    }
}