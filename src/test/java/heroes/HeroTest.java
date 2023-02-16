package heroes;

import exceptions.InvalidArmourException;
import exceptions.InvalidWeaponException;
import heroes.type.Warrior;
import items.Slot;
import items.armour.Armour;
import items.armour.ArmourType;
import items.weapons.Weapon;
import items.weapons.WeaponType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    Hero hero;

    @BeforeEach
    void setUp() {
        hero = new Warrior("Willy Warrior", 1);
    }

    @Test
    void getCorrectHeroName() {
        String expected = "Willy Warrior";
        String actual = hero.getName();

        assertEquals(expected,actual);
    }

    @Test
    void getCorrectHeroLevel() {
        Integer expected = 1;
        Integer actual = hero.getLevel();

        assertEquals(expected,actual);
    }
    @Test
    void getCorrectHeroLevelUp() {
        Integer expected = 1+1;
        hero.levelUp();
        Integer actual = hero.getLevel();

        assertEquals(expected,actual);
    }

    @Test
    void totalAttributes(){
        HeroAttribute expected = new HeroAttribute(5,2,1);
        HeroAttribute actual = hero.totalAttributes();

        assertEquals(expected,actual);
    }

    @Test
    void totalAttributesWithArmour() throws InvalidArmourException {
        Armour testarmour = new Armour("Common plate", Slot.BODY, 1,
                new HeroAttribute(1,1,1), ArmourType.PLATE);

        hero.equip(testarmour);

        HeroAttribute expected = new HeroAttribute(6,3,2);
        HeroAttribute actual = hero.totalAttributes();

        assertEquals(expected,actual);
    }

    @Test
    void totalAttributesWithTwoArmour() throws InvalidArmourException {
        Armour testBody = new Armour("Common plate", Slot.BODY, 1,
                new HeroAttribute(1,1,1), ArmourType.PLATE);
        Armour testHead = new Armour("Legendary plate head", Slot.HEAD, 1,
                new HeroAttribute(10,2,2), ArmourType.PLATE);

        hero.equip(testBody);
        hero.equip(testHead);

        HeroAttribute expected = new HeroAttribute(16, 5, 4);
        HeroAttribute actual = hero.totalAttributes();

        assertEquals(expected,actual);
    }

    @Test
    void totalAttributesWithReplacedArmour() throws InvalidArmourException {
        Armour testLegs = new Armour("Common Mail Shoes", Slot.LEGS, 1,
                new HeroAttribute(1,1,1), ArmourType.MAIL);
        Armour testBetterLegs = new Armour("Rare Mail Shoes", Slot.LEGS, 1,
                new HeroAttribute(2,2,2), ArmourType.MAIL);

        hero.equip(testLegs);
        hero.equip(testBetterLegs);

        // Tested by replacing STR to 6. It gives error saying the value should be 7 with new boots added
        HeroAttribute expected = new HeroAttribute(7, 4, 3);
        HeroAttribute actual = hero.totalAttributes();

        assertEquals(expected, actual);

    }
    @Test
    void getCorrectHeroDamage() {
        Double expectedDamage = 1 * (1d + 5d / 100d);
        Double actualDamage = hero.getDamage();

        assertEquals(expectedDamage,actualDamage);

    }

    @Test
    void getCorrectHeroDamageWithWeapon() throws InvalidWeaponException {
        Weapon testWeapon = new Weapon("Common Axe", Slot.WEAPON, 1,
                WeaponType.AXE, 10d);

        hero.equip(testWeapon);

        Double expectedDamage =  10d * (1d +(5d/100d));
        Double actualDamage = hero.getDamage();

        assertEquals(expectedDamage, actualDamage);

    }

    @Test
    void getCorrectHeroDamageWithReplacedWeapon() throws InvalidWeaponException {
        Weapon commonAxe = new Weapon("Common Axe", Slot.WEAPON, 1,
                WeaponType.AXE, 10d);

        Weapon legendaryHammer = new Weapon("Legendary Hammer", Slot.WEAPON, 1,
                WeaponType.HAMMER, 20d);

        hero.equip(commonAxe);
        hero.equip(legendaryHammer);

        // I tested this by putting 10 damage and it gave an error. Works fine by replacing weapons.
        Double expectedDamage = 20d * (1d +(5d/100d));
        Double actualDamage = hero.getDamage();

        assertEquals(expectedDamage,actualDamage);

    }

    @Test
    void getDamageWeaponAndArmourEquipped() throws InvalidWeaponException, InvalidArmourException {
        Weapon commonAxe = new Weapon("Common Axe", Slot.WEAPON, 2,
                WeaponType.AXE, 5d);
        Armour commonPlate = new Armour("Common Plate Armour", Slot.BODY, 2,
                new HeroAttribute(2,0,0), ArmourType.PLATE);
        hero.levelUp();
        hero.equip(commonAxe);
        hero.equip(commonPlate);

        Double expected = 5d * (1d +(10d/100d));
        Double actual = hero.getDamage();

        assertEquals(expected,actual);
    }


    @Test
    void displayTestWarrior() {
        String display = hero.display();


        assertTrue(display.contains("Name: Willy Warrior"));
        assertTrue(display.contains("Level: 1"));
        assertTrue(display.contains("Total Strength: 5" ));
        assertTrue(display.contains("Total Dexterity: 2"));
        assertTrue(display.contains("Total Intelligence: 1"));
        assertTrue(display.contains("Damage 1.05"));
    }
}