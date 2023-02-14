package items.weapons;

import items.Slot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {

    Weapon weaponAxe;
    @BeforeEach
    void setUp() {
        weaponAxe = new Weapon("Common Axe", Slot.WEAPON,1, WeaponType.AXE, 1);

    }

    @Test
    void weaponGetWeaponDamage() {
        double damageExpected = 1;
        double damageActual = weaponAxe.getWeaponDamage();

        assertEquals(damageExpected,damageActual);
    }

    @Test
    void weaponGetWeaponType() {
        WeaponType expected = WeaponType.AXE;
        WeaponType actual = weaponAxe.getWeaponType();

        assertEquals(expected,actual);
    }
}