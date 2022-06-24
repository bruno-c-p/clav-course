package module_two.soccer_exercise.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import module_two.soccer_exercise.entities.Player;
import module_two.soccer_exercise.entities.Team;

public class Program {

    public static void main(String[] args) {

        List<Team> teams = new ArrayList<>();

        int op = -1;

        do {

            op = menu();

            switch (op) {

                case 1:
                    registerTeam(teams);
                    break;
                case 2:
                    listPlayersTeam(teams);
                    break;
                case 3:
                    championshipStriker(teams);
                    break;
                case 4:
                    teamWithMoreGoals(teams);
                    break;
            }

        } while (op != 5);
    }

    public static int menu() {

        StringBuilder sb = new StringBuilder();
        sb.append("Menu:\n\n");
        sb.append("1 - Register teams\n");
        sb.append("2 - List of players from a team\n");
        sb.append("3 - Championship striker\n");
        sb.append("4 - Team with more goals\n");
        sb.append("5 - Exit\n\n");

        return Integer.parseInt(JOptionPane.showInputDialog(sb.toString()));
    }

    private static void registerTeam(List<Team> teams) {

        Team team = new Team();
        team.register();
        teams.add(team);
    }

    private static void listPlayersTeam(List<Team> teams) {

        String search = JOptionPane.showInputDialog("Team name to show the players: ");

        for (Team team : teams) {

            if (team.getName().contains(search)) {

                JOptionPane.showMessageDialog(null, team.toString());
            }
        }
    }

    private static void championshipStriker(List<Team> teams) {

        Player striker = new Player();

        for (Team team : teams) {

            if (team.striker().getGoalsQuantity() > striker.getGoalsQuantity()) {

                striker = team.striker();
            }
        }

        JOptionPane.showMessageDialog(null, striker.toString());
    }

    private static void teamWithMoreGoals(List<Team> teams) {

        Team moreGoals = new Team();

        for (Team team : teams) {

            if (team.sumTeamGoals() > moreGoals.sumTeamGoals()) {

                moreGoals = team;
            }
        }

        JOptionPane.showMessageDialog(null, "Team with more goals: " + moreGoals.getName());
    }
}
