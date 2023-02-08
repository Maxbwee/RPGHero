package heroes.type;

import heroes.Hero;
import heroes.HeroAttribute;

public class Mage extends Hero{


    public Mage(String name, int level) {
        super(name, level);
       HeroAttribute levelAttributes = new HeroAttribute(1, 1, 8);
    }

    @Override
    public void levelUp() {
        // Add something how to levelup attributes (1, 1, 5) for mage
        super.levelUp();
    }


}
