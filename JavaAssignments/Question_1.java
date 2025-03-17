import java.util.*;
public class Question_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose the Shape to calculate the area:");
        System.out.println("1 for Circle");
        System.out.println("2 for Rectangle");
        System.out.println("3 for Triangle");
        int choice;
        System.out.print("Please Enter Your Choice:");
        choice=scanner.nextInt();
        if(choice==1){
            System.out.println("Enter the Radius: ");
            double radius=scanner.nextDouble();
            double area=3.14*radius*radius;
            System.out.println("The area of the Circle is:"+area);
        }
        else if(choice==2){
            System.out.println("Enter the Length: ");
             double length=scanner.nextDouble();
             System.out.println("Enter the Breadth: ");
             double breadth=scanner.nextDouble();
             double area=length*breadth;
             System.out.println("The area of the Rectangle is:"+area);
        }
        else if(choice==3){
            System.out.println("Enter the Base: ");
             double base=scanner.nextDouble();
             System.out.println("Enter the Height: ");
             double height=scanner.nextDouble();
             double area=0.5*base*height;
             System.out.println("The area of the Triangle is : "+area);
        }
        else{
            System.out.println("Invalid choice !!");
        }
    }
}
