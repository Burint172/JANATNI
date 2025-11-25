import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {

        DecimalFormat frm = new DecimalFormat( "#");
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Enter number1  : ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter number2 : ");
        double number2 =scanner.nextDouble();

        System.out.println("Summation :" + frm.format(number1 + number2) );
        System.out.println("Subtraction :" + frm.format(number1 - number2) );
        System.out.println("Multiplication :" + frm.format(number1 * number2) );
        System.out.println("Division :" + (number1 / number2) );
        System.out.println("Modulus :" + frm.format(number1 % number2) );
    }
}
