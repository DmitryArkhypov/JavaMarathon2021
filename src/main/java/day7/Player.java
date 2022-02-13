package day7;



public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    // Constructor
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
        if (Player.this.stamina > MIN_STAMINA) {
            Player.this.stamina -= 1;
            if (Player.this.stamina == MIN_STAMINA) {
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
