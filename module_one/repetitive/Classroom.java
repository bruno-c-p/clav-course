package module_one.repetitive;

import javax.swing.JOptionPane;

public class Classroom {

    /*
     * A classroom has N students, of which it is known:
     * Name, state where you live and age. Make a program that show:
     * 
     * a) The number of students residing in SC (State)
     * 
     * b) The number of students residing in RS (State)
     * 
     * c) The number of students who are under the age of 17.
     */

    public static void main(String[] args) {

        int quantityStudentsSC = 0;
        int quantityStudentsRS = 0;
        int age17 = 0;

        int students = Integer.parseInt(JOptionPane.showInputDialog("How many students? "));

        for (int i = 0; i < students; i++) {
            String name = JOptionPane.showInputDialog("Name: ");
            int age = Integer.parseInt(JOptionPane.showInputDialog("Age of" + name + ": "));
            String code = JOptionPane.showInputDialog("State code of " + name + ": ");

            String state = code.trim().toUpperCase();

            if (age <= 17) {
                age17++;
            }

            if (state.equals("SC")) {

                quantityStudentsSC++;

            } else if (state.equals("RS")) {

                quantityStudentsRS++;
            }
        }

        JOptionPane.showMessageDialog(null, "SC students quantity: " + quantityStudentsSC
                + "\nRS students quantity: " + quantityStudentsRS
                + "\nUnder 17 years old: " + age17);
    }
}
