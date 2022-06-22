package module_one.variables_data_types;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Fahrenheit {

    /*
     * Make a program where given a value in degrees
     * Fahrenheit convert it to degrees Celsius:
     */

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.0");

        double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Temperature ºF: "));

        double celsius = ((fahrenheit - 32) * 5) / 9;

        JOptionPane.showMessageDialog(null, "Temperature in ºC is: " + df.format(celsius) + " ºC.");
    }
}
