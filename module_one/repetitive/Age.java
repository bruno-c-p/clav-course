package module_one.repetitive;

import javax.swing.JOptionPane;

public class Age {

    /*
     * Write a program in which the user enters N names and ages of people,
     * then displays the name and age of the oldest person.
     */

    public static void main(String[] args) {

        int n = Integer.parseInt("Quantity of names:");
        String olderName = "";
        int olderAge = 0;

        for (int i = 0; i < n; i++) {

            String name = JOptionPane.showInputDialog("Name " + (i + 1));
            int age = Integer.parseInt("Age of " + name + ":" + (i + 1));

            if (age > olderAge) {
                olderName = name;
                olderAge = age;
            }
        }

        JOptionPane.showMessageDialog(null, olderName + ": " + olderAge + " years old.");
    }
}
