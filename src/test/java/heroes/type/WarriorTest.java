package heroes.type;

import heroes.Hero;
import heroes.HeroAttribute;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    Hero warrior;
    @BeforeEach
    void setUp() {
        warrior = new Warrior("Willy", 1);
    }

    @Test
    void heroHasCorrectAttributes() {
        HeroAttribute expected = new HeroAttribute(5,2,1);
        HeroAttribute actual = warrior.totalAttributes();

        assertEquals(expected,actual);
    }

    @Test
    void heroLevelUpAttributes(){
        HeroAttribute expected = new HeroAttribute(5+3, 2+2, 1+1);
        warrior.levelUp();
        HeroAttribute actual = warrior.totalAttributes();
    }
}