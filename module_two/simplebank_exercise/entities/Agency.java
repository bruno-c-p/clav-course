package module_two.simplebank_exercise.entities;

import javax.swing.JOptionPane;

public class Agency {

    int number;
    String city;
    String district;

    public void register() {

        number = Integer.parseInt(JOptionPane.showInputDialog("Number: "));
        city = JOptionPane.showInputDialog("City: ");
        district = JOptionPane.showInputDialog("District: ");
    }
}
