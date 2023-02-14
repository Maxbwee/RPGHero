package heroes;

public class HeroAttribute {
    private int strength;
    private int dexterity;
    private int intelligence;

    public HeroAttribute(int strength, int dexterity, int intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public void IncreaseHeroAttribute(int strength, int dexterity, int intelligence) {
        this.strength += strength;
        this.dexterity += dexterity;
        this.intelligence += intelligence;
    }
    public void IncreaseHeroAttribute(HeroAttribute attributes){
        this.strength += attributes.strength;
        this.dexterity += attributes.dexterity;
        this.intelligence += attributes.intelligence;


    }
   // public void IncreaseHeroAttribute(HeroAttribute armourAttribute) {
   //     this.strength += strength;
   //     this.dexterity += dexterity;
   //     this.intelligence += intelligence;
    //}
    public int getStrength() {
        return strength;
    }
    public int getDexterity() {
        return dexterity;
    }
    public int getIntelligence() {
        return intelligence;
    }


    // Allows me to compare two objects for the tests
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeroAttribute that = (HeroAttribute) o;
        return strength == that.strength && dexterity == that.dexterity && intelligence == that.intelligence;
    }

    @Override
    public String toString() {
        return "HeroAttribute{" +
                "strength=" + strength +
                ", dexterity=" + dexterity +
                ", intelligence=" + intelligence +
                "}";
    }


}
