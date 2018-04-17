package Exercises;

public class NumberHolder {
    private int anInt;
    private float aFloat;

    //default initialisation
    public NumberHolder() {
        anInt = 0;
        aFloat = 0;
    }

    public NumberHolder(int anInt, float aFloat) {
        this.anInt = anInt;
        this.aFloat = aFloat;
    }

    public int getAnInt() {
        return anInt;
    }

    public float getaFloat() {
        return aFloat;
    }
}