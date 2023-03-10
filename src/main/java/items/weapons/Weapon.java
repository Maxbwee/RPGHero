package items.weapons;

import items.Item;
import items.Slot;

public class Weapon extends Item {

    private  double weaponDamage;
    private WeaponType weaponType;

    public Weapon(String itemName, Slot slot, int requiredLevel, WeaponType weaponType, double weaponDamage) {
        super(itemName, slot, requiredLevel);
        this.weaponDamage = weaponDamage;
        this.weaponType = weaponType;
    }

    public double getWeaponDamage() {
        return weaponDamage;
    }


    public WeaponType getWeaponType() {
        return weaponType;
    }

}
