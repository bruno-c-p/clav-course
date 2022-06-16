package variables_data_types;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Employee {

    /*
     * A company has for a certain employee a form containing the name,
     * number of hours worked and the number of dependents of an employee.
     * Whereas the company pays 12 dollars per hour, 40 dollars per dependent
     * and on salary, discounts of 8.5% are made for 0 INSS and 5% for IR,
     * read the name, the number of hours worked and the number of dependents
     * an employee. After reading, write the name, gross salary, the amounts
     * discounted for each type of tax and finally what is the net salary.
     */

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");

        String nome = JOptionPane.showInputDialog("Employee name: ");

        int hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Hours of work: "));

        int dependentsNumber = Integer.parseInt(JOptionPane.showInputDialog("Dependents quantity: "));

        double grossSalary = (hoursWorked * 12) + (dependentsNumber * 40);

        double IrDiscount = grossSalary * (5.0 / 100);

        double InssDiscount = grossSalary * (8.5 / 100);

        double netSalary = grossSalary - (InssDiscount + IrDiscount);

        JOptionPane.showMessageDialog(null, "Employee name: " + nome
                + "\nGross salary: _ $ " + df.format(grossSalary)
                + "\nINSS discount: _ $ " + df.format(InssDiscount)
                + "\nIR discount: _ $ " + df.format(IrDiscount)
                + "\nNet salary: _ $ " + df.format(netSalary));
    }
}
