package day7;


import java.awt.event.WindowFocusListener;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt(11)+90);
        Player player2 = new Player(random.nextInt(11)+90);
        Player player3 = new Player(random.nextInt(11)+90);
        Player player4 = new Player(random.nextInt(11)+90);
        Player player5 = new Player(random.nextInt(11)+90);
        Player player6 = new Player(random.nextInt(11)+90);

        for (int i = 0; i < 100; i++) {
            player1.run();
            System.out.println("Выносливость " + player1.getStamina());
            System.out.println("Мест " + Player.getCountPlayers());
            Player.info();
            System.out.println();

            // Почему если применить цикл "for (int i = 0; i < player1.getStamina(); i++)"?
            // Зачем "MAX_STAMINA и MIN_STAMINA"?
        }
    }
}
