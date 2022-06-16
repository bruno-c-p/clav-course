package arrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListMain {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> ages = new ArrayList<Integer>();
        ArrayList<Character> sex = new ArrayList<Character>();

        int op = 0;

        do {

            op = chooseMenu();

            switch (op) {

                case 1:
                    registerPerson(names, ages, sex);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Quantity of mens: " + checkQuantityByGender(ages, sex, 'M'));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Quantity of womens: " + checkQuantityByGender(ages, sex, 'F'));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,
                            "Older men: " + nomeMaisVelhoPorSexo(names, ages, sex, 'M'));
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,
                            "Older woman: " + nomeMaisVelhoPorSexo(names, ages, sex, 'F'));
                    break;

            }

        } while (op != 5);

    }

    private static int chooseMenu() {

        StringBuilder menu = new StringBuilder();
        menu.append("1 - Register Person\n");
        menu.append("2 - Number of mens\n");
        menu.append("3 - Number of womens\n");
        menu.append("4 - Older man\n");
        menu.append("5 - Older woman\n\n");
        menu.append("6 - Exit\n");

        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    private static void registerPerson(ArrayList<String> names, ArrayList<Integer> ages, ArrayList<Character> sex) {

        names.add(JOptionPane.showInputDialog("Name: "));
        ages.add(Integer.parseInt(JOptionPane.showInputDialog("Age: ")));
        sex.add(JOptionPane.showInputDialog("Sex: ").toUpperCase().charAt(0));
    }

    private static int checkQuantityByGender(ArrayList<Integer> ages, ArrayList<Character> sex, char sexo) {

        int quantity = 0;

        for (int i = 0; i < sex.size(); i++) {

            if (sex.get(i) == sexo) {

                quantity++;
            }
        }

        return quantity;
    }

    private static String nomeMaisVelhoPorSexo(ArrayList<String> names, ArrayList<Integer> ages,
            ArrayList<Character> sex, char charSex) {

        String oldestPersonName = "";
        int oldestPersonAge = 0;

        for (int i = 0; i < names.size(); i++) {

            if (charSex == sex.get(i) && ages.get(i) > oldestPersonAge) {

                oldestPersonName = names.get(i);
                oldestPersonAge = ages.get(i);
            }
        }

        return oldestPersonName;
    }
}
