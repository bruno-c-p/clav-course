package module_two.simplebank_exercise.entities;

import javax.swing.JOptionPane;

public class Client {
    
    String name;
    char sex;
    String birthDate;

    public void register() {

        name = JOptionPane.showInputDialog("Name: ");
        sex = JOptionPane.showInputDialog("Sex: (M/W)").toUpperCase().charAt(0);
        birthDate = JOptionPane.showInputDialog("Birth date: ");
    }
}
