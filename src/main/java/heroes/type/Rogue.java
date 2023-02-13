package heroes.type;

import heroes.Hero;
import heroes.HeroAttribute;
import items.armour.ArmourType;
import items.weapons.WeaponType;

public class Rogue extends Hero {
    public Rogue(String name, int level) {
        super(name, level);
        levelAttributes = new HeroAttribute(2,6,1);
        validWeaponTypes.add(WeaponType.DAGGER);
        validWeaponTypes.add(WeaponType.SWORD);
        validArmourTypes.add(ArmourType.LEATHER);
        validArmourTypes.add(ArmourType.MAIL);
    }

    @Override
    public void levelUp() {
        // Add something to leve up Rogue ( 1 , 4, 1) upgrade for Rogue
        levelAttributes.IncreaseHeroAttribute(1,4,1);
        super.levelUp();
    }
}
