package heroes.type;

import heroes.Hero;
import heroes.HeroAttribute;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    Hero mage;
    @BeforeEach
    void setUp() {
        mage = new Mage("Mike", 1);
    }

    @Test
    void heroHasCorrectAttributes() {

        HeroAttribute expected = new HeroAttribute(1,1,8);
        HeroAttribute actual = mage.totalAttributes();

        assertEquals(expected, actual);
    }

    @Test
    void heroLevelUpAttributes() {

        HeroAttribute expected = new HeroAttribute(1+1, 1+1, 8+5);
        mage.levelUp();
        HeroAttribute actual = mage.totalAttributes();

        assertEquals(expected, actual);
    }
}