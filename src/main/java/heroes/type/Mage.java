package heroes.type;

import heroes.Hero;
import heroes.HeroAttribute;

public class Mage extends Hero{


    public Mage(String name, int level) {
        super(name, level);
       HeroAttribute heroAttribute = new HeroAttribute(1, 1, 8);
    }

    public void levelUp(){

    }


}
