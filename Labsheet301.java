import javax.swing.*;
import java.util.Scanner;

public class Labsheet301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();


        if (number == 0){
            System.out.println("This is Zero Number");
        }
        else{
            if (number % 2 == 0){
                if(number > 0){
                    System.out.println("This number is even and Positive number");
                } else{
                    System.out.println("This number is even and Positive number");
                }
            }
            else {
                if (number >0){
                    System.out.println("This number is odd and Positive number ");
                }else{
                    System.out.println("This number is odd and Positive number ");
                }
            }

        }


    }
}
