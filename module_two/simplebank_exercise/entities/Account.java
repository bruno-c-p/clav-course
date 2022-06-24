package module_two.simplebank_exercise.entities;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Account {

    private static DecimalFormat df = new DecimalFormat(".00");

    private int number;
    private double balance;
    private Agency agency;
    private Client client;

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("====== Account info ======\n");
        sb.append("Number: " + this.getNumber());
        sb.append("\nBalance: " + df.format(this.getBalance()));
        sb.append("\nAgency: " + this.getAgency().getNumber());
        sb.append("\nClient: " + this.getClient().getName());

        return sb.toString();
    }

    public void register() {

        this.number = Integer.parseInt(JOptionPane.showInputDialog("Account number: "));
        this.balance = Double.parseDouble(JOptionPane.showInputDialog("Account balance: "));
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void transfer(double amountSended, Account receivingAccount) {

        if (this.getNumber() == receivingAccount.getNumber()) {

            if (!(this.getBalance() < amountSended)) {

                this.withdraw(amountSended);
                receivingAccount.deposit(amountSended);
            }
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
