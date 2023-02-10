package heroes;

import items.Item;
import items.Slot;
import items.armour.ArmourType;
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

    // Initialize an empty equipment array when Hero is created
    public void initializeEquipment() {
        equipment = new HashMap<>();
        equipment.put(Slot.HEAD, null);
        equipment.put(Slot.BODY, null);
        equipment.put(Slot.LEGS, null);
        equipment.put(Slot.WEAPON,null);
    }

    // levelUpAttribes??
    public void levelUp() {
        level++;
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
