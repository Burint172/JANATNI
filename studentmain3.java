import javax.swing.*;
import java.util.Scanner;

public class studentmain3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        student[] st =new student[10];

        for(int i=0; i<st.length;i++) {
            st[i] = new student();
           // System.out.print("Enter student name:  );
            st[i].name = JOptionPane.showInputDialog("Enter student name: ");
            //System.out.print("Enter student id   :");
            st[i].id = JOptionPane.showInputDialog("Enter student id   :");
            //System.out.print("Enter homework socre: ");
            st[i].doHomework(Integer.parseInt(JOptionPane.showInputDialog("Enter homework socre: ")));
            //System.out.print("Enter exam socre: ");
            st[i].takeExam(Integer.parseInt(JOptionPane.showInputDialog("Enter exam socre: ")));
        }
        for(student s : st){
            System.out.println();
            s.showStatus();
        }




    }
}
