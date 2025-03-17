abstract class Bike{
    abstract void run();
}

class Honda extends Bike{
    void run(){
        System.out.println("Bike running Safely");
    }
}

interface Animal{
    void eat();
    void sleep();
}

class Lion implements Animal{
    public void eat(){
        System.out.println("Lion is Eating");
    }
    public void sleep(){
        System.out.println("Lion is sleeping");
    }
}

class Deer implements Animal{
    public void eat(){
        System.out.println("Deer is Eating");
    }
    public void sleep(){
        System.out.println("Deer is sleeping");
    }
}


public class Question_23 {
    public static void main(String[] args) {

//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
// Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where we type the text and send the message. We do not know the internal processing about the message delivery.
// Abstraction lets you focus on what the object does instead of how it does it.

        // An abstract class in Java acts as a partially implemented class that itself cannot be instantiated. It exists only for subclassing purposes, and provides a template for its subcategories to follow. Abstract classes can have implementations with abstract methods. Abstract methods are declared to have no body, leaving their implementation to subclasses.

        Honda h1=new Honda();
        h1.run();



//An interface in Java is a blueprint of a class. It has static constants and abstract methods.

//The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

// In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.

// An interface is declared by using the interface keyword. It provides total abstraction; means all the methods in an interface are declared with the empty body, and all the fields are public, static and final by default. A class that implements an interface must implement all the methods declared in the interface.
       Lion l1=new Lion();
       l1.eat();
       l1.sleep();

       Deer d1=new Deer();
       d1.sleep();
       d1.eat();

    }

}
