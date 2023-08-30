package Characters;

import java.util.Date;

public class Human extends Character {
    public Human(String name, String nick, Date dob) {
        super(name, nick, dob);
        velocity = 5;
        skill = 6;
        strenght = 4;
        level = 1;
        armor = 5;
        health = 100;
    }
}
