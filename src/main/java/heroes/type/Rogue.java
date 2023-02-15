package heroes.type;

import heroes.Hero;
import heroes.HeroAttribute;
import items.armour.ArmourType;
import items.weapons.WeaponType;

import java.util.List;

public class Rogue extends Hero {
    public Rogue(String name, int level) {
        super(name, level);
        levelAttributes = new HeroAttribute(2,6,1);
        validWeaponTypes = List.of(WeaponType.DAGGER, WeaponType.SWORD);
        validArmourTypes = List.of(ArmourType.LEATHER, ArmourType.MAIL);
    }

    @Override
    public void levelUp() {
        // Add something to leve up Rogue ( 1 , 4, 1) upgrade for Rogue
        levelAttributes.IncreaseHeroAttribute(1,4,1);
        super.levelUp();
    }
    @Override
    public int increaseDamageByAttribute(HeroAttribute totalAttributes){
        return totalAttributes.getDexterity();
    }
}
