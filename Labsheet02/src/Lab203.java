import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab203 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);


        System.out.print("Enter product id  : ");
        String id = scanner.next();
        scanner.nextLine();
        System.out.print("Enter product name: ");
        String name =scanner.nextLine();
        System.out.print("Enter product item: ");
        int item =scanner.nextInt();
        System.out.print("Enter product price per piece: ");
         double piece =scanner.nextDouble();
        System.out.println("------------------------------------------------ ");
        System.out.println("Product name: " + name +"  ("+id+")");
        System.out.println("Product item: " + item +"  ("+piece+ " baht/piece)");
        System.out.println("Total price : " + (item*piece)+"  baht");
    }
}
