package heroes;

import exceptions.InvalidArmourException;
import exceptions.InvalidWeaponException;
import items.Item;
import items.Slot;
import items.armour.Armour;
import items.armour.ArmourType;
import items.weapons.Weapon;
import items.weapons.WeaponType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Hero {

    public String name;
    public int level = 1;
    public HeroAttribute levelAttributes;

    private Map<Slot, Item> equipment;

    protected List<WeaponType> validWeaponTypes; // Given in each class type
    protected List<ArmourType> validArmourTypes; // Given in each class type


    public Hero(String name,int level){
        this.name = name;
        this.level = level;
        initializeEquipment();
    }


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

    public HeroAttribute totalAttributes() {

        HeroAttribute total = levelAttributes;

        for(Map.Entry<Slot,Item> set : equipment.entrySet()){
            if(set.getKey() == Slot.WEAPON || set.getValue() == null)
                continue;
            total.IncreaseHeroAttribute(((Armour) set.getValue()).getArmourAttribute());
        }
        return total;
    }

    public double getDamage() {
        double weaponDamage = 1;

        if(equipment.get(Slot.WEAPON) == null){
            weaponDamage = weaponDamage * (1 + increaseDamageByAttribute(totalAttributes())/100d);
        } else if(equipment.get(Slot.WEAPON) != null) {
            weaponDamage = ((Weapon)equipment.get(Slot.WEAPON)).getWeaponDamage();
        }

        return weaponDamage;
    }

    public String display() {
        HeroAttribute total = totalAttributes();
        return "Name: " + name + "\n" +
                "Level: " + level +"\n" +
                "Total Strength: " + total.getStrength() + "\n" +
                "Total Dexterity: " + total.getDexterity() + "\n" +
                "Total Intelligence " + total.getIntelligence() + "\n" +
                "Damage" + getDamage();
     }

    public abstract int increaseDamageByAttribute(HeroAttribute totalAttributes);
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
