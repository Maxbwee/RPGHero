package heroes.type;

import heroes.Hero;
import heroes.HeroAttribute;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RogueTest {

    Hero rogue;
    @BeforeEach
    void setUp() {
        rogue = new Rogue("Ricky", 1);
    }

    @Test
    void heroHasCorrectAttributes() {
        HeroAttribute expected = new HeroAttribute(2,6,1);
        HeroAttribute actual = rogue.totalAttributes();

        assertEquals(expected,actual);
    }

    @Test
    void heroLevelUpAttributes() {
        HeroAttribute expected = new HeroAttribute(2+1, 6+4, 1+1);
        rogue.levelUp();
        HeroAttribute actual = rogue.totalAttributes();

        assertEquals(expected,actual);
    }
}