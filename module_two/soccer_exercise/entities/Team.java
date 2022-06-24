package module_two.soccer_exercise.entities;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Team {

    private String name;
    private List<Player> players = new ArrayList<>();

    public void register() {

        this.name = JOptionPane.showInputDialog("Nome do time: ");

        char more = 'x';

        do {

            Player player = new Player();
            player.register();
            this.addPlayer(player);
            more = JOptionPane.showInputDialog("Include more players? (Y/N)").toUpperCase().charAt(0);

        } while (more == 'Y');
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Team players of " + this.getName() + ":\n");

        for (Player player : players) {

            sb.append(player.toString());
        }

        return sb.toString();
    }

    public Player striker() {

        Player striker = new Player();

        for (Player player : players) {

            if (player.getGoalsQuantity() > striker.getGoalsQuantity()) {

                striker = player;
            }
        }

        return striker;
    }

    public int sumTeamGoals() {

        int sum = 0;

        for (Player player : players) {

            sum += player.getGoalsQuantity();
        }

        return sum;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
