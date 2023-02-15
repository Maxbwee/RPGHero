package items.armour;

import heroes.HeroAttribute;
import items.Slot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmourTest {

    Armour armourPlate;
    @BeforeEach
    void setUp() {
        armourPlate = new Armour("Common plate Chest", Slot.BODY,1,
                new HeroAttribute(2,1,0), ArmourType.PLATE
        );
    }

    @Test
    void armourGetExtraAttributes() {
        HeroAttribute expected = new HeroAttribute(2,1,0);
        HeroAttribute actual = armourPlate.getArmourAttribute();

        assertEquals(expected,actual);
    }

    @Test
    void armourGetArmourType() {
        ArmourType expected =  ArmourType.PLATE;
        ArmourType actual =  armourPlate.getArmourType();

        assertEquals(expected,actual);
    }
}