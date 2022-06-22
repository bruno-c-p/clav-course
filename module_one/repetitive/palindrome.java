package module_one.repetitive;

import javax.swing.JOptionPane;

public class palindrome {

    /*
     * Make a program that reads any word informed by the user,
     * and informs if the typed word is palindrome or not.
     */

    public static void main(String[] args) {

        String word = JOptionPane.showInputDialog(null, "Word: ");
        String invertedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {

            invertedWord += word.charAt(i);
        }

        if (word.equalsIgnoreCase(invertedWord)) {

            JOptionPane.showMessageDialog(null, word + " is a palindrome word!");

        } else {

            JOptionPane.showMessageDialog(null, word + " is not a palindrome word!");
        }
    }
}
