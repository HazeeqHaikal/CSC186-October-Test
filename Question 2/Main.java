import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String productName;
        int age;
        double stockPrice;
        double grossProfit = 0;
        int quantity;

        System.out.print("Enter the amount of array: ");
        int size = input.nextInt();

        Product[] prod = new Product[size];

        input.nextLine();
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print("Product name: ");
            productName = input.nextLine();

            System.out.print("Age started (months): ");
            age = input.nextInt();

            System.out.print("Stock Price: RM");
            stockPrice = input.nextDouble();

            System.out.print("Quantity left: ");
            quantity = input.nextInt();

            prod[i] = new Product(productName, age, stockPrice, quantity);

            input.nextLine();
            System.out.println();

        }

        for (int i = 0; i < size; i++) {
            if (prod[i].getQuantity() < 50) {
                System.out.println(prod[i]);
            }

            grossProfit += (prod[i].calculateSellingPrice() * prod[i].getQuantity())
                    - (prod[i].getStockPrice() * prod[i].getQuantity());
        }

        System.out.println("\nProduct name for baby above than 7 months old: ");

        for (int i = 0; i < size; i++) {
            if (prod[i].getAge() > 7) {
                System.out.println(i + ". " + prod[i].getProductName());
            }
        }

        System.out.printf("\nGross profit: RM%,.2f", grossProfit);

        input.close();
    }
}
