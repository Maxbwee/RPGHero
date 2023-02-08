package heroes.type;

import heroes.Hero;
import heroes.HeroAttribute;

public class Warrior extends Hero {
    public Warrior(String name, int level) {
        super(name, level);
        HeroAttribute levelAttributes = new HeroAttribute(5,2,1);

    }

    @Override
    public void levelUp() {
        // Add something to level up warrior (3 , 2 , 1) for warrior
        super.levelUp();
    }
}
