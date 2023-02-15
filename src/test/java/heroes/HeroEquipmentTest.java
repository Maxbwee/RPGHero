package heroes;

import exceptions.InvalidArmourException;
import exceptions.InvalidWeaponException;
import heroes.type.Ranger;
import items.Slot;
import items.armour.Armour;
import items.armour.ArmourType;
import items.weapons.Weapon;
import items.weapons.WeaponType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroEquipmentTest {


    Ranger randyRanger;
    Weapon validBow, invalidBow;
    Armour validCloth, invalidLeather;
    @BeforeEach
    void setUp() {
        randyRanger = new Ranger("Randy Ranger", 1);
    }

    @Test
    void heroWeaponEquipTestInvalidWeaponTooHighLevel() throws InvalidWeaponException {
        invalidBow = new Weapon("Common Bow", Slot.WEAPON, 2, WeaponType.BOW, 2);
        String expected = "Weapon level too high. Level up first";

        Exception e = assertThrows(InvalidWeaponException.class, () -> randyRanger.equip(invalidBow));

        String actual = e.getMessage();

        assertEquals(expected,actual);

    }

    @Test
    void heroWeaponEquipTestInvalidWeaponType() throws InvalidWeaponException {
        invalidBow = new Weapon("Common Bow", Slot.WEAPON, 1, WeaponType.DAGGER, 2);

        String expected = "Wrong type of weapon. Try another one";

        Exception e = assertThrows(InvalidWeaponException.class, () -> randyRanger.equip(invalidBow));

        String actual = e.getMessage();

        assertEquals(expected,actual);

    }

    @Test
    void heroArmourEquipTestArmourTooHighLevel() throws InvalidArmourException {
        invalidLeather = new Armour("Common Cloth Armour", Slot.BODY, 2,
                new HeroAttribute(0,1,0), ArmourType.LEATHER);

        String expected = "Armour level too high. Level up first!";

        Exception e = assertThrows(InvalidArmourException.class, () -> randyRanger.equip(invalidLeather));

        String actual = e.getMessage();

        assertEquals(expected, actual);
    }

    @Test
    void heroArmourEquipTestArmourWrongType() throws InvalidArmourException{
        invalidLeather = new Armour("Common Plate Armour", Slot.BODY, 1,
        new HeroAttribute(2,1,0), ArmourType.PLATE);

        String expected = "Wrong type of armour. Try another one!";

        Exception e = assertThrows(InvalidArmourException.class, () -> randyRanger.equip(invalidLeather));

        String actual = e.getMessage();

        assertEquals(expected, actual);

    }
}