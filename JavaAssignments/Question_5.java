import java.util.*;
public class Question_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        int side=scanner.nextInt();
        for(int i=0;i<side;i++){
            for(int j=0;j<side;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
