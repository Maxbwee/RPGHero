package heroes.type;

import heroes.Hero;
import heroes.HeroAttribute;
import items.armour.Armour;
import items.armour.ArmourType;
import items.weapons.Weapon;
import items.weapons.WeaponType;

import java.util.ArrayList;
import java.util.Arrays;

public class Mage extends Hero{


    public Mage(String name, int level) {
        super(name, level);
        HeroAttribute levelAttributes = new HeroAttribute(1, 1, 8);
        validWeaponTypes.add(WeaponType.WAND);
        validWeaponTypes.add(WeaponType.STAFF);
        validArmourTypes.add(ArmourType.CLOTH);
    }

    @Override
    public void levelUp() {
        // Add something how to levelup attributes (1, 1, 5) for mage
        super.levelUp();
    }


}
