package methods;

import javax.swing.JOptionPane;

public class MethodsMain {

    /*
     * A company that has several functional features that are the names, amount of
     * dependents and salaries of each. Write a program to calculate or readjust
     * salary and show name, old and new salary. The readjustment criteria are as
     * follows:
     * 
     * and Employees with a salary lower than 1,900.00 will have a 40% readjustment;
     * 
     * and Employees with a salary between 1,000 (inclusive) and 3,000.00
     * (inclusive) must have a 30% readjustment;
     * 
     * and Employees with a salary greater than 3,000.00 must have a 20%
     * readjustment.
     * 
     * and Dependent shutdown will be plus 1% readjustment.
     * 
     * Create a method to read the data, another to calculate the readjustment and
     * another to show the dialogs.
     * 
     * Feel free to define the input and return parameters of the function, but
     * always aiming at the least possible use of variables.
     */

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de funcionários?"));

        String[] names = new String[n];
        int[] dependents = new int[n];
        double[] oldSalaries = new double[n];
        double[] readjustedSalaries = new double[n];
        int pos = 0;
        int op = 0;

        do {

            op = chooseMenu();

            switch (op) {

                case 1:
                    if (pos < n) {

                        registerEmployee(names, dependents, oldSalaries, pos);
                        pos++;

                    } else {

                        JOptionPane.showMessageDialog(null, "Limite atingido");
                    }
                    break;
                case 2:
                    calculateReadjustment(dependents, oldSalaries, readjustedSalaries);
                    break;
                case 3:
                    showData(names, oldSalaries, readjustedSalaries);
                    break;
            }

        } while (op != 4);
    }

    private static int chooseMenu() {

        StringBuilder menu = new StringBuilder();
        menu.append("1 - Register employee\n");
        menu.append("2 - Calculate readjustment\n");
        menu.append("3 - Show data\n\n");
        menu.append("4 - Exit\n");

        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    private static void registerEmployee(String[] names, int[] dependents, double[] oldSalaries, int pos) {

        names[pos] = JOptionPane.showInputDialog("Name: ");

        dependents[pos] = Integer.parseInt(JOptionPane.showInputDialog("Number of dependents of " + names[pos]));

        oldSalaries[pos] = Double.parseDouble(JOptionPane.showInputDialog("Salary of " + names[pos]));
    }

    private static double calculateReadjustment(int[] dependents, double[] oldSalaries,
            double[] readjustedSalaries) {

        double newSalary = 0.0;

        for (int i = 0; i < oldSalaries.length; i++) {

            if (oldSalaries[i] < 1000.00) {

                newSalary = oldSalaries[i] * (0.4 + (0.01 * dependents[i]));
                readjustedSalaries[i] = newSalary + oldSalaries[i];

            }

            if (oldSalaries[i] >= 1000.00 && oldSalaries[i] <= 3000.00) {

                newSalary = oldSalaries[i] * (0.3 + (0.01 * dependents[i]));
                readjustedSalaries[i] = newSalary + oldSalaries[i];

            } 
            
            if (oldSalaries[i] > 3000.00) {

                newSalary = oldSalaries[i] * (0.2 + (0.01 * dependents[i]));
                readjustedSalaries[i] = newSalary + oldSalaries[i];
            }
        }

        return newSalary;
    }

    private static String showData(String[] names, double[] oldSalaries, double[] readjustedSalaries) {

        StringBuilder showEmployees = new StringBuilder();

        for (int i = 0; i < names.length; i++) {
            showEmployees.append("\n**************************\n");
            showEmployees.append("\nName: " + names[i]);
            showEmployees.append("\nOld salary: " + oldSalaries[i]);
            showEmployees.append("\nReadjusted salary: " + readjustedSalaries[i]);
        }

        return JOptionPane.showInputDialog(showEmployees);
    }

}