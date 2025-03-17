import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // Arithmetic Operators
        System.out.println(" Arithmetic Operators ");
        System.out.println(a + " + " + b + " = " + (a + b)); 
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b)); 
        System.out.println(a + " / " + b + " = " + (a / b)); 
        System.out.println(a + " % " + b + " = " + (a % b)); 

        // Relational Operators
        System.out.println(" Relational Operators ");
        System.out.println(a + " > " + b + " = " + (a > b));  
        System.out.println(a + " < " + b + " = " + (a < b));  
        System.out.println(a + " >= " + b + " = " + (a >= b)); 
        System.out.println(a + " <= " + b + " = " + (a <= b));
        System.out.println(a + " == " + b + " = " + (a == b)); 
        System.out.println(a + " != " + b + " = " + (a != b)); 

        // Logical Operators
        System.out.println(" Logical Operators ");
        boolean condition1 = (a > 0 && b > 0);
        boolean condition2 = (a < 0 || b < 0); 
        boolean condition3 = !(a == b);        

        System.out.println("Both numbers are positive: " + condition1);
        System.out.println("At least one number is negative: " + condition2);
        System.out.println("Numbers are not equal: " + condition3);

    }
}
