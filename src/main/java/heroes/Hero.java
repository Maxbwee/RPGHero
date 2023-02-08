package heroes;

import java.util.ArrayList;

public class Hero {

    public String name;
    public int level = 1;
    public int levelAtrributes;
    ArrayList<String> equipment = new ArrayList<String>();
    ArrayList<String> validWeaponTypes = new ArrayList<String>();
    ArrayList<String> validArmourTypes = new ArrayList<String>();


    public Hero(String name,int level){
        this.name = name;
        this.level = level;
    }

    // levelUpAttribes??
    public void levelUp() {
        level++;
    }
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
