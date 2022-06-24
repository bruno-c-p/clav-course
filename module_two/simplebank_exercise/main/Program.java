package module_two.simplebank_exercise.main;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import module_two.simplebank_exercise.entities.Account;
import module_two.simplebank_exercise.entities.Agency;
import module_two.simplebank_exercise.entities.Client;

public class Program {

    public static void main(String[] args) {

        List<Agency> agencies = new ArrayList<>();
        List<Client> clients = new ArrayList<>();
        List<Account> accounts = new ArrayList<>();

        int op = -1;

        do {

            op = menu();

            switch (op) {

                case 1:
                    registerAgency(agencies);
                    break;
                case 2:
                    registerClient(clients);
                    break;
                case 3:
                    registerAccount(agencies, clients, accounts);
                    break;
                case 4:

                    int choosenOption = -1;

                    do {

                        choosenOption = transactionsMenu();

                        switch (choosenOption) {

                            case 1:
                                accountDeposit(accounts);
                                break;
                            case 2:
                                accountWithdraw(accounts);
                                break;
                            case 3:
                                moneyTransferBetweenAccounts(accounts);
                                break;
                        }

                    } while (choosenOption != 4);

                    break;
                case 5:
                    listAgencyAccounts(agencies, accounts);
                    break;
                case 6:
                    verifyBalanceOfClient(clients, accounts);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "You left!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Choose a valid option!");
            }

        } while (op != 7);
    }

    public static int menu() {

        StringBuilder sb = new StringBuilder();
        sb.append("Menu:\n\n");
        sb.append("1 - Register agency\n");
        sb.append("2 - Register client\n");
        sb.append("3 - Register account\n");
        sb.append("4 - Make transactions with the account\n");
        sb.append("5 - List agency accounts\n");
        sb.append("6 - Check balance of an account holder\n");
        sb.append("7 - Exit\n\n");

        return Integer.parseInt(JOptionPane.showInputDialog(sb.toString()));
    }

    private static void registerAgency(List<Agency> agencies) {
        Agency agency = new Agency();
        agency.register();
        agencies.add(agency);
    }

    private static void registerClient(List<Client> clients) {
        Client client = new Client();
        client.register();
        clients.add(client);
    }

    private static void registerAccount(List<Agency> agencies, List<Client> clients, List<Account> accounts) {

        Account account = new Account();

        int agency = Integer.parseInt(JOptionPane.showInputDialog("Choose an agency:\n" + agenciesList(agencies)));
        account.setAgency(agencies.get(agency - 1));

        int client = Integer.parseInt(JOptionPane.showInputDialog("Choose a client:\n" + clientsList(clients)));
        account.setClient(clients.get(client - 1));

        account.register();

        accounts.add(account);
    }

    public static int transactionsMenu() {

        StringBuilder sb = new StringBuilder();
        sb.append("Choose an option:\n\n");
        sb.append("1 - Deposit\n");
        sb.append("2 - Withdraw\n");
        sb.append("3 - Transfer\n\n");
        sb.append("4 - Exit\n");

        return Integer.parseInt(JOptionPane.showInputDialog(sb.toString()));
    }

    private static void accountDeposit(List<Account> accounts) {

        int selectedAccount = Integer
                .parseInt(JOptionPane.showInputDialog("Choose an account:\n" + accountsList(accounts)));

        double amount = Double
                .parseDouble(JOptionPane.showInputDialog("Amount to deposit:"));

        accounts.get(selectedAccount - 1).deposit(amount);
    }

    private static void accountWithdraw(List<Account> accounts) {

        int selectedAccount = Integer
                .parseInt(JOptionPane.showInputDialog("Choose an account:\n" + accountsList(accounts)));

        double amount = Double
                .parseDouble(JOptionPane.showInputDialog("Amount to withdraw:"));

        accounts.get(selectedAccount - 1).withdraw(amount);
    }

    private static void moneyTransferBetweenAccounts(List<Account> accounts) {

        int selectedAccount = Integer
                .parseInt(JOptionPane.showInputDialog("Choose the sender account:\n" + accountsList(accounts)));
        int receivingAccount = Integer
                .parseInt(JOptionPane.showInputDialog("Choose the receiver account:\n" + accountsList(accounts)));

        double amount = Integer.parseInt(JOptionPane.showInputDialog("Amount to send:\n"));

        accounts.get(selectedAccount - 1).transfer(amount, accounts.get(receivingAccount - 1));
    }

    private static void listAgencyAccounts(List<Agency> agencies, List<Account> accounts) {

        int agency = Integer.parseInt(JOptionPane.showInputDialog("Choose an agency:\n" + agenciesList(agencies)));

        StringBuilder resultList = new StringBuilder();

        for (Account account : accounts) {

            if (account.getAgency() == agencies.get(agency - 1)) {

                resultList.append(account.toString());
            }
        }

        JOptionPane.showMessageDialog(null, resultList);
    }

    private static void verifyBalanceOfClient(List<Client> clients, List<Account> accounts) {

        DecimalFormat df = new DecimalFormat(".00");

        int client = Integer.parseInt(JOptionPane.showInputDialog("Choose a client:\n" + clientsList(clients)));

        for (Account account : accounts) {

            if (account.getClient() == accounts.get(client - 1).getClient()) {

                JOptionPane.showMessageDialog(null, "Balance: $" + df.format(account.getBalance()));
            }
        }
    }

    private static String agenciesList(List<Agency> agencies) {

        StringBuilder list = new StringBuilder();

        for (Agency agency : agencies) {

            list.append((agencies.indexOf(agency) + 1) + agency.toString() + "\n");
        }

        return list.toString();
    }

    private static String clientsList(List<Client> clients) {

        StringBuilder list = new StringBuilder();

        for (Client client : clients) {

            list.append((clients.indexOf(client) + 1) + client.toString() + "\n");
        }

        return list.toString();
    }

    private static String accountsList(List<Account> accounts) {

        StringBuilder list = new StringBuilder();

        for (Account account : accounts) {

            list.append((accounts.indexOf(account) + 1) + account.toString() + "\n");
        }

        return list.toString();
    }
}
