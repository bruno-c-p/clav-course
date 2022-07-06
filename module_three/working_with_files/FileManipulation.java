package module_three.working_with_files;

import javax.swing.*;
import java.io.File;

public class FileManipulation {

    private static File[] files;

    public static void main(String[] args) {

        int op = 0;

        do {

            op = menu();

            switch (op) {

                case 1:
                    JOptionPane.showMessageDialog(null, fileList());
                    break;
                case 2:
                    removeFile();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "You left!");
                default:
                    JOptionPane.showMessageDialog(null, "Choose a valid option!");
            }

        } while (op != 3);
    }

    private static int menu() {

        StringBuilder menu = new StringBuilder();
        menu.append("1 - List files\n");
        menu.append("2 - Delete file\n\n");
        menu.append("3 - Exit");
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    private static void removeFile() {

        String list = fileList();

        int chosenFile = Integer.parseInt(JOptionPane.showInputDialog(list));

        if (files != null && files.length > 0) {

            File file = files[chosenFile-1];
            file.delete();
            JOptionPane.showMessageDialog(null, "File deleted!");

        } else {

            JOptionPane.showMessageDialog(null, "Empty directory!");
        }
    }

    private static String fileList() {

        String path = JOptionPane.showInputDialog("Path: ");
        File directory = new File(path);

        StringBuilder list = new StringBuilder();

        if (directory.exists() && directory.isDirectory()) {

            files = directory.listFiles();

            for (int i = 0; i < files.length; i++) {
                File f = files[i];
                list.append(i + 1).append(" - ");
                list.append(f.getName()).append(" - ");
                list.append(f.length() / 1024).append("KB");
            }

            return list.toString();

        } else {
            return "Invalid path.";
        }

    }
}
