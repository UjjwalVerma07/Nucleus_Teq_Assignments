
public class Question_6 {
    public static void main(String[] args) {
        
    
    // Primitive data types are the basic building blocks of data manipulation in Java. They store actual values directly in memory and are not objects.
//   1.  Stored directly in memory.
//   2. Have fixed sizes depending on the type.
//   3. More efficient in terms of memory and performance.
//   4. Cannot store null (except for Boolean in some cases with autoboxing)

System.out.println("Example of Primitive Data Type:");
int number = 10;
char letter = 'A';
boolean flag = true;
System.out.println("Number: " + number);
System.out.println("Letter: " + letter);
System.out.println("Is Java Fun? " + flag);

// Reference data types are used to store references (memory addresses) to objects rather than actual values.

// 1. Store references (addresses) instead of actual values.
// 2. Memory allocated dynamically (heap memory).
// 3. Can store null values.
// 4. Support methods and behaviors (since they are objects).
        String text = "Hello, Java!";
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Example of Reference Data Type: ");

        System.out.println("Text: " + text);
        System.out.println("First number in array: " + numbers[0]);
    }
}
