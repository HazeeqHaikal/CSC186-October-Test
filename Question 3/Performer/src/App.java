import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dancerName;
        char gender;
        String artistName;
        String genre;

        Dancer[] arrayD = new Dancer[2];

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter the dancer name: ");
            dancerName = input.nextLine();

            System.out.print("Enter the gender (M/F): ");
            gender = input.nextLine().charAt(0);

            arrayD[i] = new Dancer(dancerName, gender);
            System.out.println();
        }

        System.out.print("Enter the artist name: ");
        artistName = input.nextLine();

        System.out.print("Enter the genre: ");
        genre = input.nextLine();

        Performer performer = new Performer(artistName, genre, arrayD);

        System.out.println();
        System.out.println(performer.toString());

        input.close();
    }
}
