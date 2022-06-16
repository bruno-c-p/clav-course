package multidimensional_array;

import javax.swing.JOptionPane;

public class Marathon {

    /*
     * A running coach has N athletes.
     * In one year, the athletes participated in 8 marathons (m1, m2, m3, ... m8),
     * which were stored in a matrix the time that each athlete took to complete the
     * race. Create an algorithm that registers the names (in a vector) and times of
     * each athlete in a array (array order is up to you).
     * 
     * After registering, allow the user to choose a competition (m1 to m8) and the
     * program show the time and of each athlete.
     */

    public static void main(String[] args) {

        int quantityAthletes = Integer.parseInt(JOptionPane.showInputDialog("How many athletes: "));

        String[] marathons = new String[] { "m1", "m2", "m3", "m4", "m5", "m6", "m7", "m8" };

        String[] athletes = new String[quantityAthletes];
        String[][] times = new String[quantityAthletes][8];

        for (int i = 0; i < athletes.length; i++) {

            athletes[i] = JOptionPane.showInputDialog("Athlete " + (i + 1) + " name:");
        }

        for (int i = 0; i < athletes.length; i++) {

            for (int j = 0; j < marathons.length; j++) {

                times[i][j] = JOptionPane.showInputDialog(
                        "What is the athlete's race time?: " + athletes[i] + " in marathon " + marathons[j] + ": ");

            }
        }

        String menuMarathons = "CHOOSE A MARATHON: \n";

        for (int i = 0; i < marathons.length; i++) {

            menuMarathons += (i + 1) + " - " + marathons[i] + "\n";
        }

        int searchMarathon = Integer.parseInt(JOptionPane.showInputDialog(menuMarathons));

        String menuCompetition = "RACE: " + marathons[searchMarathon] + "\n";

        for (int i = 0; i < athletes.length; i++) {

            menuCompetition += athletes[i] + ": " + times[i][searchMarathon - 1] + "\n";
        }

        JOptionPane.showMessageDialog(null, menuCompetition);

    }
}
