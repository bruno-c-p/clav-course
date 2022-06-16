package variables_data_types;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CircleArea {

    /*
     * The area of ​​a circle is measured by the following formula:
     * 
     * area = PI * (R*R)
     * 
     * Knowing this, make a program that takes for the user
     * enter the value of the radius (R), and after,
     * calculate and show it on the screen the area of ​​the circle.
     * Note: Assume that the value of Pl is equal to 3.1415.
     */

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");

        double PI = 3.1415;

        double radius = Double.parseDouble(JOptionPane.showInputDialog("Radius: "));

        double area = PI * (Math.pow(radius, 2));

        JOptionPane.showMessageDialog(null, "Circle area: " + df.format(area));
    }
}
