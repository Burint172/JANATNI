import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {
        int Minutes = Integer.parseInt(JOptionPane.showInputDialog("Input minutes::"));
        int hour = Minutes/60 ;
        int minutes = Minutes % 60 ;

        JOptionPane.showMessageDialog(null,
                Minutes + " minutes " + " is " + hour + " hour "+ minutes+" Minutes");


    }
}
