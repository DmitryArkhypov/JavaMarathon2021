package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    int healHims;
    int healTeam;
    int magicAtt;

    public Shaman() {
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
        magicAtt = 15;
        healHims = 50;
        healTeam = 30;
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
        if ((hero.health - (magicAtt - (magicAtt * hero.magicDef))) < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= (magicAtt - (magicAtt * hero.magicDef));
        }
        hero.info();
    }

    public void healHimself() {
        if ((health + healHims) > MAX_HEALTH) {
            health = MIN_HEALTH;
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
        return "Shaman {" + health + '}';
    }
}
