package day7;


import java.awt.event.WindowFocusListener;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {

        Player player1 = new Player(68);
        Player player2 = new Player(67);
        Player player3 = new Player(45);
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();

        // Почему если применить цикл "for (int i = 0; i < player1.getStamina(); i++)"?
        for (int i = 0; i < 70; i++) {
            player1.run();
            System.out.println("Выносливость " + player1.getStamina());
            System.out.println("Мест " + Player.getCountPlayers());
            Player.info();
            System.out.println();

        }
    }
}
