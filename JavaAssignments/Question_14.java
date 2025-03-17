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
};
class GraduateStudent extends Student{
    String specialization;
    public GraduateStudent(String name,int rollNo,double marks,String specialization){
              super(name,rollNo,marks);
              this.specialization=specialization;
    }
    public void displayDetails(){
        super.display();
        System.out.println("Specialization : "+specialization);
    }
}
public class Question_14{
    public static void main(String[] args) {
        GraduateStudent s1=new GraduateStudent("Ujjwal Verma",22, 100, "Data Science");
        s1.displayDetails();
    }
}
