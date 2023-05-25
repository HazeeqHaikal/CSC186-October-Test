import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        String codeSubject, gred, name;
        int creditHour, noMatrix, part;
        System.out.print("Enter the amount of array: ");
        int size = numInput.nextInt();
        int count = 0;

        Student[] student = new Student[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter name: ");
            name = stringInput.nextLine();

            System.out.print("Enter course: ");
            course = stringInput.nextLine();

            System.out.print("Enter part: ");
            part = numInput.nextInt();

            for (int j = 0; j < 7; j++) {
                Subject[] subject = new Subject[7];
                System.out.print("Enter code subject: ");
                codeSubject = stringInput.nextLine();

                System.out.print("Enter credit hours: ");
                creditHour = numInput.nextInt();

                System.out.print("Enter gred: ");
                gred = stringInput.nextLine();

                System.out.print("Enter subject " + i + " grade: ");
                String inputGrade = stringInput.next();
                subject[j] = new Subject(codeSubject, creditHour, inputGrade);
                if(student[i].calcGPA() > 3.00){
                    count++;
                }
            }

            student[i] = new Student(name, noMatrix, part, course, subject);
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 7; j++) {
                if(student[j].calcGPA() >= 3.67){

                }
            }
        }

        input.close();
    }
}
