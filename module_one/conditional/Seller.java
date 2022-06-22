package module_one.conditional;

import javax.swing.JOptionPane;

public class Seller {

    /*
     * A seller earns his salary according to the following rule:
     * A fixed salary of X dollars and a commission in relative to total sales.
     * This commission is made as follows: 20% if sales exceed R$20,000.00, or
     * otherwise, 10%.
     * Write a program that asks the user to enter the salesperson's fixed salary
     * and
     * the total of sales made during the month. After reading,
     * show on the screen the total that the seller should earn.
     */

    public static void main(String[] args) {

        double salary = Double.parseDouble(JOptionPane.showInputDialog("Seller salary: "));

        double sales = Integer.parseInt(JOptionPane.showInputDialog("Total sales in the month: "));

        if (sales > 20000) {

            double comissao = (salary * 20) / 100;
            salary += comissao;

        } else {
            
            double comissao = (salary * 10) / 100;
            salary += comissao;
        }

        JOptionPane.showMessageDialog(null, "The seller will receive: " + salary);

    }
}
