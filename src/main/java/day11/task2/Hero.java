package day11.task2;

public abstract class Hero {
    int health;
    int physAtt;
    double physDef;
    double magicDef;
    static final byte MAX_HEALTH = 100;
    static final byte MIN_HEALTH = 0;


    public Hero() {
        health = MAX_HEALTH;
    }

    public void info(){
        System.out.println(toString());
    }
}