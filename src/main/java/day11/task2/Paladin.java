package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    int healHims;
    int healTeam;

    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
        healHims = 25;
        healTeam = 10;
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
    public void healHimself() {
        if ((health + healHims) > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += healHims;
        }
        info();
    }

    @Override
    public void healTeammate(Hero hero) {
        if ((hero.health + healTeam) > MAX_HEALTH){
            hero.health = MAX_HEALTH;
        } else {
            hero.health += healTeam;
        }
        hero.info();
    }

    @Override
    public String toString() {
        return "Paladin {" + health + '}';
    }
}

