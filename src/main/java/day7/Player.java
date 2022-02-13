package day7;


import java.util.Random;

public class Player {
    private int stamina;
    private static int countPlayers;
    private static final int MIN_STAMINA = 0;
    private static final int MAX_STAMINA = 100;

    // Constructor
    public Player (){
        Random random = new Random();
        int randomStamina = random.nextInt(11)+90;
        this.stamina = randomStamina;

        if (countPlayers < 6 ) {
            countPlayers++;
        }
    }
    public Player (int stamina){
        this.stamina = stamina;

        if (countPlayers < 6 ) {
            countPlayers++;
        }
    }

    // geters and setrers
    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    // Methods
    public void run(){
        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == MIN_STAMINA) {
                countPlayers--;
                System.out.println("Игроку нужен отдых и он уходит с поля");
            }
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест.");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
