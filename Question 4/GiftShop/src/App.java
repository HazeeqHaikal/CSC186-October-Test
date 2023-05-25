import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner numInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        System.out.print("1. NP456\n2.BS123\n\nEnter category code (1-2): ");
        int categoryCode = numInput.nextInt();

        System.out.print("1. New Product\n2. Best Seller\n\nEnter category description (1-2): ");
        int categoryDescription = numInput.nextInt();

        char productCode = '';
        if(categoryDescription == 1){
            System.out.print("Promising Love (P) - RM 158.50\nEndless Love (E) - RM 198.50\n\nEnter product code (P, E): ");
            productCode = stringInput.nextLine().charAt(0);
        }else if(categoryDescription == 2){
            System.out.print("Ferrero Chocolate Foil Balloon (F) - RM 158.50\nBirthday Cake Mania (B) - RM 188.50\nEnter product code (F, B): ");
            productCode = stringInput.nextLine().charAt(0);
        }else{
            System.out.println("Wrong input sir");
        }

        GiftProduct giftProduct = new GiftProduct[];
        giftProduct(categoryCode, categoryDescription, productCode);





    }
}
