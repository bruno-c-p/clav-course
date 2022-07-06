package module_two.book_exercise.entities;

import javax.swing.*;

public class Author {

    private String name;
    private char sex;
    private int age;

    public Author() {

        this.name = JOptionPane.showInputDialog("Full name: ");

        System.out.println(this.name.split(" ").length);

        while (this.name.split(" ").length <= 1) {
            this.name = JOptionPane.showInputDialog("Name and surname needed!! Full name: ");
        }

        this.sex = JOptionPane.showInputDialog("Sex (M/W): ").toUpperCase().charAt(0);

        while (this.sex != 'M' && this.sex != 'W') {
            this.sex = JOptionPane.showInputDialog("Only M or W are accepted. Sex (M/W): ").toUpperCase().charAt(0);
        }

        this.age = Integer.parseInt(JOptionPane.showInputDialog("Age: "));

        while (this.age <= 0) {
            this.age = Integer.parseInt(JOptionPane.showInputDialog("Age needs to be above 0. Age: "));
        }
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " | Sex: " + this.getSex() + " | " + this.getAge();
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
