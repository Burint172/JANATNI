import javax.swing.*;
import java.util.Scanner;

public class Lab302 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you height (cm.)"));
        double gender = JOptionPane.showConfirmDialog(null,"Are your biological gender is Male","Gender",JOptionPane.YES_NO_OPTION);
        if (gender == 0){
            JOptionPane.showMessageDialog(null,"Hello, Mr." +name+"\nIf your height is "+height+"cm.\n"+"Your weight should be "+
                    (height-100)+"kg.");
        }
        else if (gender == 1){
            int genderFemale = JOptionPane.showConfirmDialog(null,"Are your biological gender is Female?","Gender",JOptionPane.YES_NO_OPTION);
            if(genderFemale == 0 ){
                JOptionPane.showMessageDialog(null, "hello, Ms."+name+"\nIF your height is "+height+"cm.\n"+"Your weight should be"+(height-100)+"kg.");

            }else{
                JOptionPane.showMessageDialog(null,"You can us BMI to measure your weight and height");
            }
        }
    }
}
