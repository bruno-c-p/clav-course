package conditional;

import javax.swing.JOptionPane;

public class Triangle {

    /*
     * Given three values ​​X, Y, Z, check if they can be the lengths of the sides
     * of a triangle, and if they will check whether it is an equilateral,
     * isosceles, or scalene triangle. If they don't form a triangle,
     * write a message. Before of the elaboration of the program, it becomes
     * necessary to review some properties and definitions.
     * 
     * a) The length of each side of a triangle is less than the sum of the lengths
     * of the other two sides;
     * 
     * b) An equilateral triangle is one that has the same lengths of three sides;
     * 
     * c) An isesceles triangle is one that has the lengths of two equal sides;
     * 
     * d) A scalene triangle is one that has the lengths of the three sides
     * different;
     */

    public static void main(String[] args) {

        int side1 = Integer.parseInt(JOptionPane.showInputDialog("Side 1: "));
        int side2 = Integer.parseInt(JOptionPane.showInputDialog("Side 2: "));
        int side3 = Integer.parseInt(JOptionPane.showInputDialog("Side 3: "));

        if (side1 > (side2 + side3) || side2 > (side1 + side3) || side3 > (side1 + side2)) {

            JOptionPane.showMessageDialog(null, "Not a triangle.");

        } else if (side1 == side2 && side2 == side3) {

            JOptionPane.showMessageDialog(null, "Equilateral triangle!");

        } else if (side1 != side2 && side2 != side3) {

            JOptionPane.showMessageDialog(null, "Scalene triangle!");

        } else {

            JOptionPane.showMessageDialog(null, "Isosceles triangle!");
        }
    }
}
