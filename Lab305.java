import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int f1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int s2 = sc.nextInt();
        for (int i = f1;i<=s2;i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
    }
}
