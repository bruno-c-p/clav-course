package module_two.soccer_exercise.entities;

import javax.swing.JOptionPane;

public class Player {

    private String name;
    private int shirtNumber;
    private int goalsQuantity;

    void register() {

        this.name = JOptionPane.showInputDialog("Player number: ");
        this.shirtNumber = Integer.parseInt(JOptionPane.showInputDialog("Shirt number: "));
        this.goalsQuantity = Integer.parseInt(JOptionPane.showInputDialog("Goals: "));
    }

    @Override
    public String toString() {
        return this.getName() + "(" + this.getShirtNumber() + ") - Goals: " + this.getGoalsQuantity() + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public int getGoalsQuantity() {
        return goalsQuantity;
    }

    public void setGoalsQuantity(int goalsQuantity) {
        this.goalsQuantity = goalsQuantity;
    }

}
