package module_two.bank_inheritance.entities;

import javax.swing.*;

public class UniversityAccount extends Account {

    @Override
    public void deposit(double amount) {

        if (!(this.getBalance() + amount > 2000)) {
            balance += amount;
        } else {
            JOptionPane.showMessageDialog(null, "You cannot have a balance greater than R$ 2,000.00 ");
        }
    }
}
