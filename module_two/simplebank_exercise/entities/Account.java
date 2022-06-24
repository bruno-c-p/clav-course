package module_two.simplebank_exercise.entities;

public class Account {
    
    int number;
    double balance;
    Agency agency;
    Client client; 

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
