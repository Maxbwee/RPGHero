package heroes.type;

import heroes.Hero;
import heroes.HeroAttribute;
import items.armour.ArmourType;
import items.weapons.WeaponType;

import java.util.List;

public class Ranger extends Hero {
    public Ranger(String name, int level) {
        super(name, level);
        levelAttributes = new HeroAttribute(1,7,1);
        validWeaponTypes = List.of(WeaponType.BOW);
        validArmourTypes = List.of(ArmourType.MAIL, ArmourType.LEATHER);
    }


    @Override
    public void levelUp() {
        // Add something how to access levelAttributes (1,5,1) increase for rangers
        levelAttributes.IncreaseHeroAttribute(1,5,1);
        super.levelUp();
    }
    @Override
    public int increaseDamageByAttribute(HeroAttribute totalAttributes) {
        return totalAttributes.getDexterity();
    }

}
