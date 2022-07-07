package module_three.writing_reading_files;

import javax.swing.*;
import java.io.*;

public class ReadingWriting {

    public static void main(String[] args) {

        int op = 0;

        do {

            op = menu();

            switch (op) {
                case 1:
                    writeInFile();
                    break;
                case 2:
                    readFile();
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Choose a valid option!");
            }

        } while (op != 3);
    }

    public static void readFile() {

        StringBuilder sb = new StringBuilder();
        String path = JOptionPane.showInputDialog("File path: ");
        File file = new File(path);

        if (file.exists() && file.isFile()) {

            try {

                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                String line = "";

                do {

                    line = br.readLine();

                    if (line != null) {
                        sb.append(line).append("\n");
                    }

                } while (line != null);

                JOptionPane.showMessageDialog(null, sb.toString());

                br.close();
                fr.close();

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static void writeInFile() {

        String path = JOptionPane.showInputDialog("File path: ");
        File file = new File(path);

        if (file.exists() && file.isFile()) {

            try {

                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);

                String text = JOptionPane.showInputDialog("Write: ") + "\n";
                bw.append(text);
                bw.close();
                fw.close();

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static int menu() {

        StringBuilder menu = new StringBuilder();
        menu.append("1 - Write in file\n");
        menu.append("1 - Write in file\n");
        menu.append("1 - Write in file\n");

        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
}
