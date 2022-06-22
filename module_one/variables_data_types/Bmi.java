package module_one.variables_data_types;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Bmi {

    /*
     * Make a program in which the user
     * enter the name, weight and height of a
     * person. At the end, display the name
     * and index of Body Mass (BMI) of the person.
     */

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");

        String name = JOptionPane.showInputDialog("Name: ");
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Weight: (ex: 75.5)"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Height: (ex: 1.75)"));

        double bmi = weight / (Math.pow(height, 2));

        JOptionPane.showMessageDialog(null,
                "Name: " + name + " | " + "Index of Body Mass: " + df.format(bmi));
    }
}
