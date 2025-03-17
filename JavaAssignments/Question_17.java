import java.util.*;
public class Question_17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        double avg;
        double sum=0;
        for(int i=0;i<n;i++){
            System.out.print("Enter the Number in the arr: ");
        arr[i]=scanner.nextInt();
           sum+=arr[i];
        }
        avg=sum/n;
       System.out.println("The average of numbers in arr is: "+avg);
    }
}
