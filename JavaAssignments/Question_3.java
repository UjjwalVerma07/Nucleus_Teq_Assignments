import java.util.*;
public class Question_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=scanner.nextInt();
        int result=1;
        for(int i=1;i<=num;i++){
            result=result*i;
        }
        System.out.println("The Factorial of "+num+" is : "+result);
    }
}
