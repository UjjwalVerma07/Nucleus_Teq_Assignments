import java.util.*;
public class Question_11 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number for which you want the Multiplication Table : ");
        int num=scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+ "X" + i + " = "+num*i);
        }
    }
}
