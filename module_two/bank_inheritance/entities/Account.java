package module_two.bank_inheritance.entities;

import module_two.bank_inheritance.entities.Agency;
import module_two.bank_inheritance.entities.Client;
import javax.swing.*;
import java.text.DecimalFormat;

public class Account {

    private static final DecimalFormat df = new DecimalFormat("#,###.00");

    protected int number;
    protected double balance;
    protected Agency agency;
    protected Client client;

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("----- Account ").append(this.getNumber()).append("-----\n");
        sb.append("Number: ").append(this.getNumber());
        sb.append(" | Balance: ").append(df.format(this.getBalance()));
        sb.append(" | Agency: ").append(this.getAgency().getNumber());
        sb.append(" | Client: ").append(this.getClient().getName()).append("\n");

        return sb.toString();
    }

    public Account() {
        this.number = Integer.parseInt(JOptionPane.showInputDialog("Account number: "));
        this.balance = Double.parseDouble(JOptionPane.showInputDialog("Account balance: "));
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {

        if (this.getBalance() >= amount) {
            balance -= amount;
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient balance!");
        }
    }

    public void transfer(double amountSent, Account receivingAccount) {

        if (this.getNumber() == receivingAccount.getNumber()) {
                this.withdraw(amountSent);
                receivingAccount.deposit(amountSent);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
