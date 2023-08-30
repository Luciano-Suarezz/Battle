package Characters;

import java.util.Date;

public class Orc extends Character{
    public Orc(String name, String nick, Date dob) {
        super(name, nick, dob);
        velocity = 2;
        skill = 4;
        strenght = 6;
        level = 1;
        armor = 9;
        health = 100;
    }
}
