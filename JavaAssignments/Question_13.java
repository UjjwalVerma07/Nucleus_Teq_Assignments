class Student{
    String name;
    int rollNo;
    double marks;
    public Student(String name,int rollNo,double marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }
    public void display(){
        System.out.println("Student Name: "+name);
        System.out.println("Roll Number : "+rollNo);
        System.out.println("Marks: "+marks);
    }
}
public class Question_13 {
    public static void main(String[] args) {
        Student s1=new Student("Ujjwal Verma", 22, 100);
        s1.display();
    }
}
