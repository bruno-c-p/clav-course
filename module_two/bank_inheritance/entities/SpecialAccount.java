package module_two.bank_inheritance.entities;

import javax.swing.*;

public class SpecialAccount extends Account {

    private double limit;

    public SpecialAccount(double limit) {
        super();
        this.limit = Double.parseDouble(JOptionPane.showInputDialog("Account balance: "));
    }
}
