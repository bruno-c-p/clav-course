package module_two.soccer_exercise.entities;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Team {

    public String name;
    List<Player> players = new ArrayList<>();

    public void register() {

        name = JOptionPane.showInputDialog("Nome do time: ");

        char more = 'x';

        do {

            Player player = new Player();
            player.register();
            players.add(player);
            more = JOptionPane.showInputDialog("Include more players? (Y/N)").toUpperCase().charAt(0);

        } while (more == 'Y');
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Team players of " + name + ":\n");

        for (Player player : players) {

            sb.append(player.toString());
        }

        return sb.toString();
    }

    public Player striker() {

        Player striker = new Player();

        for (Player player : players) {

            if (player.goalsQuantity > striker.goalsQuantity) {

                striker = player;
            }
        }

        return striker;
    }

    public int sumTeamGoals() {

        int sum = 0;

        for (Player player : players) {

            sum += player.goalsQuantity;
        }

        return sum;
    }
}
