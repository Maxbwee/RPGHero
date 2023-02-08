package heroes.type;

import heroes.Hero;
import heroes.HeroAttribute;

public class Ranger extends Hero {
    public Ranger(String name, int level) {
        super(name, level);
        HeroAttribute levelAttributes = new HeroAttribute(1,7,1);
    }


    @Override
    public void levelUp() {
        // Add something how to access levelAttributes (1,5,1) increase for rangers
        super.levelUp();
    }

}
