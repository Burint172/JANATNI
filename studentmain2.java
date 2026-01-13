import java.util.Scanner;

public class studentmain2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        student[] st =new student[10];

        for(int i=0; i<st.length;i++) {
            st[i] = new student();
            System.out.print("Enter student name :" );
            st[i].name =scanner.next();
            System.out.print("Enter student id   :");
            st[i].id = scanner.next();
            System.out.print("Enter homework socre: ");
            st[i].doHomework(scanner.nextInt());
            System.out.print("Enter exam socre: ");
            st[i].doHomework(scanner.nextInt());
        }
            for(student s : st){
                System.out.println();
                s.showStatus();
            }




    }
}
