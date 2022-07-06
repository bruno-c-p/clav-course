package module_two.bank_inheritance.entities;

import javax.swing.*;

public class Client {

    private String name;
    private char sex;
    private String birthDate;

    public Client() {
        this.name = JOptionPane.showInputDialog("Name: ");
        this.sex = JOptionPane.showInputDialog("Sex: (M/W)").toUpperCase().charAt(0);
        this.birthDate = JOptionPane.showInputDialog("Birth date: ");
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("----- Client info -----\n");
        sb.append("Name: ").append(this.getName());
        sb.append(" | Sex: ").append(this.getSex());
        sb.append(" | Birth Date: ").append(this.getBirthDate());

        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
