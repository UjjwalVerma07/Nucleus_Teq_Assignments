
class BankAccount{
    private String accountHolder;
    private double balance;
    
    public void setAccountholder(String name){
        this.accountHolder=name;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }

    public String getAccountholder(){
        return accountHolder;
    }
    public double getBalance(){
        return balance;
    }
}

public class Question_16 {
    public static void main(String[] args) {
//Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.

// encapsulation in java:-

// We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it
   //Some Advnatage of Encapsulation in java:
//    By providing only a setter or getter method, you can make the class read-only or write-only. In other words, you can skip the getter or setter methods.

//    It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only, you can write the logic inside the setter method. You can write the logic not to store the negative numbers in the setter methods.

//    It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.

//    The encapsulate class is easy to test. So, it is better for unit testing
     BankAccount b1=new BankAccount();
     b1.setAccountholder("Ujjwal");
     b1.setBalance(100);
     System.out.println("Name is : "+b1.getAccountholder());
     System.out.println("Balance is : "+ b1.getBalance());
    }
}
