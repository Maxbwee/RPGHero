package heroes.type;

import heroes.Hero;
import heroes.HeroAttribute;
import items.armour.ArmourType;
import items.weapons.WeaponType;

public class Warrior extends Hero {
    public Warrior(String name, int level) {
        super(name, level);
        levelAttributes = new HeroAttribute(5,2,1);
        validWeaponTypes.add(WeaponType.AXE);
        validWeaponTypes.add(WeaponType.HAMMER);
        validWeaponTypes.add(WeaponType.SWORD);
        validArmourTypes.add(ArmourType.MAIL);
        validArmourTypes.add(ArmourType.PLATE);

    }

    @Override
    public void levelUp() {
        // Add something to level up warrior (3 , 2 , 1) for warrior
        levelAttributes.IncreaseHeroAttribute(3,2,1);
        super.levelUp();
    }
}
