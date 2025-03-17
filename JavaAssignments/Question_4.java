import java.util.*;
public class Question_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int first=0;
        int second=1;
        System.out.println("Fibonacci Series upto "+ num +" terms is : ");
        for(int i=0;i<num;i++){
            System.out.println(first + " ");
            int next=first+second;
            first=second;
            second=next;
        }
    }
}
