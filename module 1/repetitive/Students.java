package repetitive;

import javax.swing.JOptionPane;

public class Students {

    /*
     * Write a program that reads a list of N students, each having the same Q
     * number of grades. The program must have the following menu:
     * 
     * 1 - Register Student
     * 2 - List the name and average of the students
     * 3 - Show the number of approved students (average for approval: >= 7.0)
     * 4 - Show the number of students who failed (average for failure: < 2.0)
     * 5 - Show the number of students in recovery.
     * 6 - Exit
     */

    public static void main(String[] args) {

        int aprovedQuantity = 0;
        int recoveryQuantity = 0;
        int reprovedQuantity = 0;

        int op = -1;

        String menu = "1 - Register Student\n"
                + "2 - List the name and average of the students\n"
                + "3 - Show the number of approved students (average for approval: >= 7.0)\n"
                + "4 - Show the number of students who failed (average for failure: < 2.0)\n"
                + "5 - Show the number of students in recovery.\n\n"
                + "6 - Exit";

        String studentsList = "******** STUDENTS NAMES AND AVERAGES ********\n";

        int q = Integer.parseInt(JOptionPane.showInputDialog("Number of tests: "));

        do {

            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (op) {

                case 1:

                    String name = JOptionPane.showInputDialog("Student name: ");
                    double sum = 0;

                    for (int i = 0; i < q; i++) {

                        double n = Double.parseDouble(JOptionPane.showInputDialog("Grade of " + (i + 1) + "° test: "));

                        sum += n;
                    }

                    double average = sum / q;

                    studentsList += name + " - " + average + "\n";

                    if (average >= 7) {

                        aprovedQuantity++;

                    } else if (average < 7 && average >= 3) {

                        recoveryQuantity++;

                    } else {

                        reprovedQuantity++;
                    }

                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, studentsList);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, aprovedQuantity);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, reprovedQuantity);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, recoveryQuantity);
                    break;
            }

        } while (op != 6);
    }
}
