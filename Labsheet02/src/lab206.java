import javax.swing.*;
import java.text.DecimalFormat;

public class lab206 {
    public static void main(String[] args) {
        final int piece_buffet = 299;
        int customer = Integer.parseInt(JOptionPane.showInputDialog("How many customer:"));
        double priceTotal = (piece_buffet*customer);
        double priceNet = (piece_buffet*customer)+(priceTotal*7/100);
        DecimalFormat frm = new DecimalFormat( "#,###.00");
        int coupon = Integer.parseInt(JOptionPane.showInputDialog("Price with Net is "+ frm.format(priceNet)+ " baht." +
                "\nHow much of discount(%) on your coupon"));
        double discount = priceNet*coupon/100,discountPrice = priceNet-discount;

        double paid = Double.parseDouble(JOptionPane.showInputDialog("Total price is "+frm.format(discountPrice)+" baht."+
                "\n Enter the anount the customer paid"));
        double chang = paid - discountPrice;
        JOptionPane.showMessageDialog(null,"Total price is "+ frm.format(discountPrice)+ " baht."+
                "\n Custoner paid "+frm.format(paid)+" baht."+"\nGet change "+frm.format(chang)+ " baht.");
    }
}
