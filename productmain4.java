import java.util.Scanner;

public class productmain4 {
    public static void setting_product(product... products) {

        String[] names = {"Pens", "Pencils", "Markers", "Highlighters"};
        double[] prices = {25.5, 17.25, 30, 35};
        int[] quantities = {20, 35, 10, 40};

        for (int i=0; i<products.length; i++) {
            products[i] = new product();
            products[i].name = names[i];
            products[i].price = prices[i];
            products[i].quantity = quantities[i];
        }
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        product p1 = new product();
        product[]products = new product[4];
        setting_product(products);

        System.out.println("Welcome to MINI SHOP!" +
                "\n--------------------------------------------------");

        for (int i =0;i<products.length;i++)
        {
            System.out.println("Press "+(i+1)+" to buy "+products[i].name+
                    " (items="+products[i].quantity+")");
        }
        System.out.println("--------------------------------------------------");

        System.out.print("Enter a number: ");
        int press = sc.nextInt();
        while (press<=0||press>4)
        {
            System.out.print("Invalaid!! Enter a number: ");
            press = sc.nextInt();
        }
        System.out.println("--------------------------------------------------");

        product p = products[press-1];
        System.out.print("How many"+p.name+" do you want to buy? ");
        int wantBuy = sc.nextInt();
        p.sell(wantBuy);

        System.out.println();
        p.showInfo();
    }


}
