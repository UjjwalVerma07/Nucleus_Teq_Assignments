import java.util.*;
public class Question_20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=scanner.nextLine();
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        System.out.println("String Before Reversing: "+str);
        System.out.println("String After Reversing: "+reversed);

    }
}
