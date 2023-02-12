package Main;

public class Hero {
    int power;
    int health;
    int speed;
    int row;
    int column;
    Team team;

    Hero(Team team, int power, int health, int speed, int row, int column, boolean reversed) {
        if (reversed) {
            row = Battle.reverseIndex(row);
        }
        this.team = team;
        this.power = power;
        this.health = health;
        this.speed = speed;
        this.column = column;
        this.row = row;
        team.heroes.add(this);
    }

    Hero(Team team, int power, int health, int speed, int row, int column) {
        this(team, power, health, speed, row, column, false);
    }
}
