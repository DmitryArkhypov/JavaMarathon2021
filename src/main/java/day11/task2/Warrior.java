package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        physAtt = 30;
        physDef = 0.8;
    }

    @Override
    public void physicalAttack(Hero hero) {
        if ((hero.health - (physAtt - (physAtt * hero.physDef))) < MIN_HEALTH){
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= (physAtt - (physAtt * hero.physDef));
        }
        hero.info();
    }

    @Override
    public String toString() {
        return "Warrior {" + health + '}';
    }
}
