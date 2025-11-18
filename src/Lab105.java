import javax.swing.*;

public class Lab105 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "Summation number = "+(5+2)+
                "\nSummation number = "+(2-5)+
                "\nMultiplication number = "+(5*2)+
                "\nDivision number = "+(2.0/5)+
                "\nModulus number = "+(2%5),
                "Aritmetic Operators",
                JOptionPane.WARNING_MESSAGE);
    }
}
