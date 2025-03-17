import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion");
        System.out.println("1 for Celsius to Fahrenheit");
        System.out.println("2 for Fahrenheit to Celsius");
        System.out.print("Enter your choice :  ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit + "F");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius + "C");
        } else {
            System.out.println("Invalid choice!");
        }

    }
}
