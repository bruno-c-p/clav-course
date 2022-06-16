package variables_data_types;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Salary {

    /*
     * Ask the user to type name, number of hours worked, the amount paid
     * per hour of work and the percentage of any employee discount. Later,
     * show in the name typed, gross salary and the net salary.
     */

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");

        String name = JOptionPane.showInputDialog("Employee name: ");

        int hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Hours of work: "));

        double amountPaidPerHour = Double.parseDouble(JOptionPane.showInputDialog("Amount paid per hour: "));

        double discount = Integer.parseInt(JOptionPane.showInputDialog("Discount percentage: "));

        double grossSalary = hoursWorked * amountPaidPerHour;

        discount = (grossSalary * discount) / 100;

        double netSalary = grossSalary - discount;

        JOptionPane.showMessageDialog(null, "Name: " + name
                + "\nGross salary: $" + df.format(grossSalary)
                + "\nNet salary: $" + df.format(netSalary));
    }
}
