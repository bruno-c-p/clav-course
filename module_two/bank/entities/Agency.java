package module_two.bank.entities;

import javax.swing.JOptionPane;

public class Agency {

    private int number;
    private String city;
    private String district;

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("----- Agency " + this.getNumber() + "-----\n");
        sb.append("Number: " + this.getNumber());
        sb.append(" | City: " + this.getCity());
        sb.append(" | District: " + this.getDistrict());

        return sb.toString();
    }

    public void register() {

        this.number = Integer.parseInt(JOptionPane.showInputDialog("Number: "));
        this.city = JOptionPane.showInputDialog("City: ");
        this.district = JOptionPane.showInputDialog("District: ");
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
