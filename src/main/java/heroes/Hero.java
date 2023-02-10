package heroes;

import exceptions.InvalidArmourException;
import exceptions.InvalidWeaponException;
import items.Item;
import items.Slot;
import items.armour.Armour;
import items.armour.ArmourType;
import items.weapons.Weapon;
import items.weapons.WeaponType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hero {

    public String name;
    public int level = 1;
    public int levelAtrributes;

    private Map<Slot, Item> equipment;

    protected ArrayList<WeaponType> validWeaponTypes; // Given in each class type
    protected ArrayList<ArmourType> validArmourTypes; // Given in each class type


    public Hero(String name,int level){
        this.name = name;
        this.level = level;
        initializeEquipment();
    }


    // levelUpAttribes??
    public void levelUp() {
        level++;
    }
    // Initialize an empty equipment array when Hero is created
    public void initializeEquipment() {
        equipment = new HashMap<>();
        equipment.put(Slot.HEAD, null);
        equipment.put(Slot.BODY, null);
        equipment.put(Slot.LEGS, null);
        equipment.put(Slot.WEAPON,null);
    }

    // Equipping a weapon on the hero
    // If the level is too high or the weapon type is wrong
    // throws custom error
    public void equip(Weapon weapon) throws InvalidWeaponException {
        if(weapon.getRequiredLevel() > level)
            throw new InvalidWeaponException("Weapon level too high. Level up first");
        if(!validWeaponTypes.contains(weapon.getWeaponType()))
            throw new InvalidWeaponException("Wrong type of weapon. Try another one");
        equipment.put(Slot.WEAPON, weapon);
    }

    // Equipping armour on the hero
    // if the level is too high or armour type is wrong
    // throws custom error




    public void equip(Armour armour) throws InvalidArmourException {
        if(armour.getRequiredLevel() > level)
            throw new InvalidArmourException("Armour level too high. Level up first!");
        if(!validArmourTypes.contains(armour.getArmourType()))
            throw new InvalidArmourException("Wrong type of armour. Try another one!");
        equipment.put(armour.getSlot(), armour);
    }




    public int getLevel() {

        return level;
    }

    public void setLevel(int level) {

        this.level = level;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
