package module_two.soccer_exercise.entities;

import javax.swing.JOptionPane;

public class Player {
    
    String name;
    int shirtNumber;
    public int goalsQuantity;

    void register() {

        name = JOptionPane.showInputDialog("Player number: ");
        shirtNumber = Integer.parseInt(JOptionPane.showInputDialog("Shirt number: "));
        goalsQuantity = Integer.parseInt(JOptionPane.showInputDialog("Goals: "));
    }

    @Override
    public String toString() {
        return name + "(" + shirtNumber + ") - Goals: " + goalsQuantity + "\n";
    }
}
