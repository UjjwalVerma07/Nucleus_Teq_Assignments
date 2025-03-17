import java.util.*;
public class Question_12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=1;
        int even_sum=0;
        while(num<=10){
            //To check if it is even number;
            if(num%2==0){
                even_sum+=num;
            }
            num++;
        }
        System.out.println("The sum of even number is "+even_sum);
    }
}
