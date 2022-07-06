package module_two.bank_inheritance.entities;

import javax.swing.*;

public class Agency {

    private int number;
    private String city;
    private String district;

    public Agency() {
        this.number = Integer.parseInt(JOptionPane.showInputDialog("Number: "));
        this.city = JOptionPane.showInputDialog("City: ");
        this.district = JOptionPane.showInputDialog("District: ");
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("----- Agency ").append(this.getNumber()).append("-----\n");
        sb.append("Number: ").append(this.getNumber());
        sb.append(" | City: ").append(this.getCity());
        sb.append(" | District: ").append(this.getDistrict());

        return sb.toString();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
