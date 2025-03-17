import java.util.*;
public class Question_19 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Value of the N: ");
        int n=scanner.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the Number in the arr: ");
            arr[i]=scanner.nextInt();
        }
        int key;
        System.out.print("Enter the Value of the key: ");
        key=scanner.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
               flag=true;
               break;
            }
        }
        if(flag==true){
            System.out.println("The key is Present in the arr");
        }
        else{
            System.out.println("The key is not Present in the arr");
        }

    }
}
