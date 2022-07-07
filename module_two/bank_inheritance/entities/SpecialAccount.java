package module_two.bank_inheritance.entities;

import javax.swing.*;

public class SpecialAccount extends Account {

    private double limit;

    public SpecialAccount() {
        super();
        this.limit = Double.parseDouble(JOptionPane.showInputDialog("Account balance: "));
    }

    public void withdraw(double amount) {

        if (this.getBalance() >= amount) {

            balance -= amount;

        } else if (this.getBalance() + limit >= amount) {

            amount -= this.getBalance();
            this.withdraw(this.getBalance());
            this.withdrawLimit(amount);

        } else {

            JOptionPane.showMessageDialog(null, "Insufficient balance!");
        }
    }

    private void withdrawLimit(double amount) {
        this.limit -= amount;
    }

    public double getLimit() {
        return limit;
    }
}
