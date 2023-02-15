package heroes.type;

import heroes.Hero;
import heroes.HeroAttribute;
import items.armour.ArmourType;
import items.weapons.WeaponType;

import java.util.List;

public class Mage extends Hero{


    public Mage(String name, int level) {
        super(name, level);
        levelAttributes = new HeroAttribute(1,1,8);
        validWeaponTypes = List.of(WeaponType.WAND, WeaponType.STAFF);
        validArmourTypes = List.of(ArmourType.CLOTH);
    }

    @Override
    public void levelUp() {

        // Add something how to levelup attributes (1, 1, 5) for mage
        levelAttributes.IncreaseHeroAttribute(1,1,5);
        super.levelUp();
    }
    @Override
    public int increaseDamageByAttribute(HeroAttribute totalAttributes) {
        return totalAttributes.getIntelligence();
    }


}
