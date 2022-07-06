package module_two.bank_inheritance.entities;

import javax.swing.*;

public class UniversityAccount extends Account {

    @Override
    public void withdraw(double amount) {

        if (this.getBalance() >= amount) {
            balance -= amount;
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient balance!");
        }
    }

    @Override
    public void transfer(double amountSent, Account receivingAccount) {

        if (this.getNumber() == receivingAccount.getNumber()) {
            this.withdraw(amountSent);
            receivingAccount.deposit(amountSent);
        }
    }
}
