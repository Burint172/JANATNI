import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        /*System.out.println("Birthday cake's Dertails: ");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor : ");
        String flavor = scanner.nextLine();
        System.out.print("Enter a pounds : ");
        double pound = scanner.nextDouble();


        BirthdayCake order1 = new BirthdayCake(message,pound,flavor,350);

        System.out.println(order1);

        System.out.println("Cup cake's Details: ");
        System.out.print("Enter a flavor:");
        String cup_flavor = scanner.next();
        System.out.print("Enter a piece: ");
        int piece = scanner.nextInt();


        Cupcake order2=new Cupcake(piece,cup_flavor,65);

        System.out.println(order2);

        System.out.println("Total price ="+
                (order1.calculateTotalPrice()+order2.calculateTotalPrice()));*/

        System.out.println("Cup cake's Details: ");
        System.out.print("Enter a flavor:");
        String flavor = scanner.next();
        System.out.print("Enter a piece: ");
        int piece = scanner.nextInt();
        Macaron order3 =new Macaron(piece,flavor,50);
        System.out.println();
        System.out.println(order3);
    }
}
