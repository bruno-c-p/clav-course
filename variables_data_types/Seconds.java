package variables_data_types;

import javax.swing.JOptionPane;

public class Seconds {

    /*
     * Make a program where given values ​​for hour, minute and second, 
     * transform all this information into seconds and 
     * show this result on the screen.
     */

    public static void main(String[] args) {

        String time = JOptionPane.showInputDialog("Informe um horário: (ex: 10:00:00)");
        String[] timeSplit = time.split(":");

        int hour = Integer.parseInt(timeSplit[0]);
        int minute = Integer.parseInt(timeSplit[1]);
        int second = Integer.parseInt(timeSplit[2]);

        int totalSeconds = (hour * 60 * 60) + (minute * 60) + second;

        JOptionPane.showMessageDialog(null, "Seconds quantity: " + time + " = " + totalSeconds);
    }
}
