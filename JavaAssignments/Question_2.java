import java.util.*;
public class Question_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=scanner.nextInt();
        if(num%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
