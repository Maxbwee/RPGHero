package heroes;

import heroes.type.Warrior;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    Hero hero;

    @BeforeEach
    void setUp() {
        hero = new Warrior("Willy Warrior", 1);
    }

    @Test
    void getCorrectHeroName() {
        String expected = "Willy Warrior";
        String actual = hero.getName();

        assertEquals(expected,actual);
    }

    @Test
    void getCorrectHeroLevel() {
        Integer expected = 1;
        Integer actual = hero.getLevel();

        assertEquals(expected,actual);
    }
    @Test
    void getCorrectHeroLevelUp() {
        Integer expected = 1+1;
        hero.levelUp();
        Integer actual = hero.getLevel();

        assertEquals(expected,actual);
    }

    @Test
    void getCorrectHeroDamage() {
        Double expectedDamage = (1d + 5d / 100d);
        Double actualDamage = hero.getDamage();

        assertEquals(expectedDamage,actualDamage);

    }


}