package array;

import javax.swing.JOptionPane;

public class Colors {

    /*
     * Create a Java program that reads N names of colors.
     * At the end, reverse the order entered.
     * 
     * For example:
     * 
     * User typed in order: blue — green — red — black
     * 
     * The system should show: black - red - green-blue
     */

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Colors quantity: "));

        String[] colors = new String[n];
        String invertedColors = "";

        for (int i = 0; i < colors.length; i++) {

            colors[i] = JOptionPane.showInputDialog("Color " + (i + 1) + ":");
        }

        for (int i = colors.length - 1; i >= 0; i--) {

            invertedColors += colors[i] + "\n";
        }

        System.out.println(invertedColors);

    }
}
