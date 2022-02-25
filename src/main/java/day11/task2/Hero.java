package day11.task2;

public abstract class Hero {
    int health;
    int physAtt;
    int magicAtt;
    double physDef;
    double magicDef;
    final byte MAX_HEALTH = 100;
    final byte MIN_HEALTH = 0;


    public Hero() {
        health = 100;
    }

    public void info(){
        System.out.println(toString());
    }
}