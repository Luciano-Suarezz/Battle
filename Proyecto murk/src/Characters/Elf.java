package Characters;

import java.util.Date;

public class Elf extends Character{
    public Elf(String name, String nick, Date dob) {
        super(name, nick, dob);
        velocity = 9;
        skill = 7;
        strenght = 2;
        level = 1;
        armor = 4;
        health = 100;
    }
}
