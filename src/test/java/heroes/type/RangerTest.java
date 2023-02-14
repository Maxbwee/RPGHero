package heroes.type;

import heroes.Hero;
import heroes.HeroAttribute;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangerTest {

    Hero ranger;
    @BeforeEach
    void setUp() {
        ranger = new Ranger("Ronny", 1);
    }

    @Test
    void heroHasCorrectAttributes() {
        HeroAttribute expected = new HeroAttribute(1,7,1);
        HeroAttribute actual = ranger.totalAttributes();

        assertEquals(expected, actual);
    }

    @Test
    void heroLevelUpAttributes() {
        HeroAttribute expected = new HeroAttribute(1+1, 7+5, 1+1);
        ranger.levelUp();
        HeroAttribute actual = ranger.totalAttributes();
    }
}