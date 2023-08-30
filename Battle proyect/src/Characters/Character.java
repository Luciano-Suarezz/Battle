package Characters;

import java.util.Date;

public abstract class Character {
    protected String name;
    protected String nick;
    protected Date dob;
    protected int velocity, skill, strenght, level, armor, health;

    public Character(String name, String nick, Date dob) {
        this.name = name;
        this.nick = nick;
        this.dob = dob;
    }
}