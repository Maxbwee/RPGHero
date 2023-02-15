package items;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    Item testItem;
    @BeforeEach
    void setUp() {
        testItem = new Item("Common Dagger", Slot.WEAPON, 1 );
    }

    @Test
    void getItemName() {
        String expected = "Common Dagger";
        String actual = testItem.getItemName();

        assertEquals(expected,actual);
    }

    @Test
    void getRequiredLevel() {
        Integer expected = 1;
        Integer actual = testItem.getRequiredLevel();

        assertEquals(expected,actual);
    }

    @Test
    void getSlot() {
        Slot expected = Slot.WEAPON;
        Slot actual = testItem.getSlot();

        assertEquals(expected,actual);
    }
}