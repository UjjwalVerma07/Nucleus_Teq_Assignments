class Shape{
    public void calculateArea(double radius){
        double area=3.14*radius*radius;
        System.out.println("The area of the Circle is : "+area);
    }
}
class Rectangle extends Shape{
    public void calculateArea(double length,double breadth){
        double area=length*breadth;
        System.out.println("The area of the Rectangle is : "+area);
    }
}
public class Question_15 {
    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.calculateArea(4);
        Rectangle rectangle=new Rectangle();
        rectangle.calculateArea(3,3);
    }
}
