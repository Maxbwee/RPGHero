package heroes.type;

import heroes.Hero;
import heroes.HeroAttribute;

public class Rogue extends Hero {
    public Rogue(String name, int level) {
        super(name, level);
        HeroAttribute levelAttributes = new HeroAttribute(2,6,1);
    }

    @Override
    public void levelUp() {
        // Add something to leve up Rogue ( 1 , 4, 1) upgrade for Rogue
        super.levelUp();
    }
}
