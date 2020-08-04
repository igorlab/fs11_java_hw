package hw_6;

public enum Species {

    CAT(false, 4, true),
    DOG(false, 4, true),
    FISH(false, 0, false);

    private final boolean canFly;
    private final int numberOfLegs;
    private final boolean hasFur;

    Species(boolean canFly, int numberOfLegs, boolean hasFur){
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }
    public boolean getCanFly(){ return this.canFly;}
    public int getNumberOfLegs(){ return this.numberOfLegs;}
    public boolean getHasFur(){ return this.hasFur;}

}

