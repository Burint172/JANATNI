import javax.swing.*;
import java.text.DecimalFormat;

public class Ex203 {
    public static void main(String[] args) {
        final double LECTURE_PRICE = 1900;
        final double LAB_PRICE = 3500;
        DecimalFormat frm = new DecimalFormat( "#,###.00");

        int LECTURE_credit = Integer.parseInt(JOptionPane.showInputDialog("Enter lecturn sredit:"));
        int lab_credit = Integer.parseInt(JOptionPane.showInputDialog("Enter lab sredit:"));

        double Lecturn_total_price =LECTURE_PRICE * LECTURE_credit;
        double lab_total_price =lab_credit * LAB_PRICE;
        double Total =Lecturn_total_price + lab_total_price;
        JOptionPane.showMessageDialog(null,
                "lecture: " + LECTURE_credit + "x" + LECTURE_PRICE+ "="+ frm.format(Lecturn_total_price) +
                "\nLaboratory: " +  lab_credit +"x"+  LAB_PRICE + "="+ frm.format(lab_total_price)+
                        "\nTotal price: " + Total
                );
    }
}
