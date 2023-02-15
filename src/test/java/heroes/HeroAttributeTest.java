package heroes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroAttributeTest {

    HeroAttribute heroAttributes;
    @BeforeEach
    void setUp() {
        heroAttributes = new HeroAttribute(1,5,1);
    }

    @Test
    void getStrength() {
        Integer expectedStr = 1;
        Integer actualStr = heroAttributes.getStrength();

        assertEquals(expectedStr, actualStr);
    }

    @Test
    void getDexterity() {
        Integer expectedDex = 5;
        Integer actualDex = heroAttributes.getDexterity();

        assertEquals(expectedDex, actualDex);
    }

    @Test
    void getIntelligence() {
        Integer expectedInt = 1;
        Integer actualInt = heroAttributes.getIntelligence();

        assertEquals(expectedInt, actualInt);
    }

    @Test
    void increaseStrengthAttributeTest() {
        Integer expected = 1+1;

        heroAttributes.IncreaseHeroAttribute(1,0,0);

        Integer actual = heroAttributes.getStrength();

        assertEquals(expected, actual);
    }

    @Test
    void increaseDexterityAttributeTest(){
        Integer expected = 5+2;

        heroAttributes.IncreaseHeroAttribute(0,2,0);

        Integer actual = heroAttributes.getDexterity();

        assertEquals(expected,actual);

    }

    @Test
    void increaseIntelligenceAttributeTest(){
        Integer expected = 1+3;

        heroAttributes.IncreaseHeroAttribute(0,0,3);

        Integer actual = heroAttributes.getIntelligence();

        assertEquals(expected,actual);

    }
}