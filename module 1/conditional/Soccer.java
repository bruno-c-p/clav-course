package conditional;

import javax.swing.JOptionPane;

public class Soccer {

    /*
     * Write a program to type the result information of a soccer match.
     * Ask the user for the name and number of goals of 2 teams that played the
     * match.
     * In the end show the name of the winning team.
     * In case of difference greater than 2 goals also inform that it was a thrash.
     * In case of a tie, ask the user for the result of the penalty charge
     * and show the name of the winning team.
     */

    public static void main(String[] args) {

        String team1 = JOptionPane.showInputDialog("Team 1 name: ");
        int goalsTeam1 = Integer.parseInt(JOptionPane.showInputDialog("Team 1 goals: "));

        String team2 = JOptionPane.showInputDialog("Team 2 name: ");
        int goalsTeam2 = Integer.parseInt(JOptionPane.showInputDialog("Team 2 goals: "));

        if ((goalsTeam1 - goalsTeam2) > 2) {

            JOptionPane.showMessageDialog(null, team2 + " thrashed by " + team1);

        } else if ((goalsTeam2 - goalsTeam1) > 2) {

            JOptionPane.showMessageDialog(null, team1 + " thrashed by " + team2);

        } else if (goalsTeam1 > goalsTeam2) {

            JOptionPane.showMessageDialog(null, "Winner: " + team1);

        } else if (goalsTeam2 > goalsTeam1) {

            JOptionPane.showMessageDialog(null, "Winner: " + team2);

        } else if (goalsTeam1 == goalsTeam2) {

            String draw = JOptionPane.showInputDialog(null,
                    "Draw. Penalty results: " + " (ex: 5x4) like team1 X team2:");

            int drawTeam1 = Integer.parseInt(draw.substring(0, draw.indexOf("X")));
            int drawTeam2 = Integer.parseInt(draw.substring(draw.lastIndexOf("X") + 1));

            if (drawTeam1 > drawTeam2) {

                JOptionPane.showMessageDialog(null, "Winner: " + team1);

            } else {

                JOptionPane.showMessageDialog(null, "Winner: " + team2);
            }
        }
    }
}
