import java.util.*;
public class Question_10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the num1: ");
        double num1=scanner.nextDouble();
        System.out.print("Enter the num2: ");
        double num2=scanner.nextDouble();
        System.out.print("Enter the num3: ");
        double num3=scanner.nextDouble();
        if((num1>num2) && (num1>num3)){
            System.out.println(num1 + " is the largest among 3 numbers");
        }
        else if((num2>num1) && (num2>num3)){
            System.out.println(num2 + " is the largest among 3 numbers");
        }
        else{
            System.out.println(num3 + " is the largest among 3 numbers");
        }
    }
}
