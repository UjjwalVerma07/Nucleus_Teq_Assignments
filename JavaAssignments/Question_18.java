import java.util.*;
public class Question_18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the value of the n: ");
        int n=scanner.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the Number in the arr: ");
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
   System.out.println("Output After Performing Selection Sort is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
