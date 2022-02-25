package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    public Magician() {
        magicDef = 0.8;
        physAtt = 5;
        magicAtt = 20;
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
    public void magicalAttack(Hero hero) {
        if ((hero.health - (magicAtt - (magicAtt * hero.magicDef))) < MIN_HEALTH){
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= (magicAtt - (magicAtt * hero.magicDef));
        }
        hero.info();
    }

    @Override
    public String toString() {
        return "Magician {" + health + '}';
    }
}
