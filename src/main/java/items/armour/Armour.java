package items.armour;

import heroes.HeroAttribute;
import items.Item;
import items.Slot;

public class Armour extends Item {

    private HeroAttribute armourAttribute;
    private ArmourType armourType;

    public Armour(String itemName, Slot slot, int requiredLevel, HeroAttribute armourAttribute, ArmourType armourType) {
        super(itemName, slot, requiredLevel);
        this.armourAttribute = armourAttribute;
        this.armourType = armourType;
    }

    public HeroAttribute getArmourAttribute() {

        return armourAttribute;
    }

    public ArmourType getArmourType() {
        return armourType;
    }
}
