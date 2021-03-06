package module_two.dvd_exercise.application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import module_two.dvd_exercise.entities.DVD;

public class Program {

    public static void main(String[] args) {

        List<DVD> dvds = new ArrayList<>();
        int op = -1;

        do {

            op = Integer.parseInt(JOptionPane.showInputDialog(menu()));

            switch (op) {

                case 1:
                    DVD dvd = new DVD();
                    dvd.register();
                    dvds.add(dvd);
                    break;
                case 2:
                    dvdList(dvds);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Dvds total value: " + sumValues(dvds));
                    break;
                case 4:
                    searchBooksByReleaseYearDate(dvds);
                    break;
                case 5:
                    searchBooksByTitle(dvds);
                    break;
            }

        } while (op != 6);
    }

    public static String menu() {

        StringBuilder sb = new StringBuilder();
        sb.append("Menu:\n\n");
        sb.append("1 - Register DVD\n");
        sb.append("2 - List of DVDs\n");
        sb.append("3 - Sum values\n");
        sb.append("4 - Search DVD by release year\n");
        sb.append("5 - Search DVD by title\n\n");
        sb.append("6 - Exit");

        return sb.toString();
    }

    public static void dvdList(List<DVD> dvds) {

        StringBuilder list = new StringBuilder();

        for (DVD dvd : dvds) {

            list.append(dvd.toString() + "\n==========================\n");
        }

        JOptionPane.showMessageDialog(null, list.toString());
    }

    public static double sumValues(List<DVD> dvds) {

        double sum = 0;

        for (DVD dvd : dvds) {

            sum += dvd.value;
        }

        return sum;
    }

    public static void searchBooksByReleaseYearDate(List<DVD> dvds) {

        String search = JOptionPane.showInputDialog("Book release year: ");
        StringBuilder sb = new StringBuilder();
        sb.append("Books list:\n\n");

        for (DVD dvd : dvds) {

            if (dvd.releaseYearDate.equals(search)) {

                sb.append(dvd.title + "\n");
            }
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public static void searchBooksByTitle(List<DVD> dvds) {

        String search = JOptionPane.showInputDialog("Book title: ");
        StringBuilder sb = new StringBuilder();
        sb.append("Books list:\n\n");

        for (DVD dvd : dvds) {

            if (dvd.title.startsWith(search)) {

                sb.append(dvd.title + "\n");
            }
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
