package module_two.dvd_exercise.entities;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class DVD {

    public String title;
    public String releaseYearDate;
    public Double value;

    @Override
    public String toString() {
        return "Title: " + title
                + "\nRelease Year: " + releaseYearDate
                + "\nValue: $" + value;
    }

    public void register() {

        title = JOptionPane.showInputDialog("DVD title: ");
        releaseYearDate = JOptionPane.showInputDialog("DVD release year: ");
        value = Double.parseDouble(JOptionPane.showInputDialog("DVD value: "));
    }
}
