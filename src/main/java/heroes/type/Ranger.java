package heroes.type;

import heroes.Hero;
import heroes.HeroAttribute;
import items.armour.ArmourType;
import items.weapons.WeaponType;

public class Ranger extends Hero {
    public Ranger(String name, int level) {
        super(name, level);
        HeroAttribute levelAttributes = new HeroAttribute(1,7,1);
        validWeaponTypes.add(WeaponType.BOW);
        validArmourTypes.add(ArmourType.LEATHER);
        validArmourTypes.add(ArmourType.MAIL);
    }


    @Override
    public void levelUp() {
        // Add something how to access levelAttributes (1,5,1) increase for rangers
        super.levelUp();
    }

}
