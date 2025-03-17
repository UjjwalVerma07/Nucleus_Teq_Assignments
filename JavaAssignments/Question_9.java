import java.util.*;
public class Question_9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please Enter the Number : ");
        int num=scanner.nextInt();
        boolean flag=true;
        if(num<2){
            flag=true;
        }
        else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    flag=false;
                    break;
                }
            }
        }
        if(flag==true){
            System.out.println("The Number is Prime Number");
        }
        else{
            System.out.println("The Number is not Prime Number");
        }
    }
}
