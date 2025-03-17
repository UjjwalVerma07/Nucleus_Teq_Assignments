import java.util.*;
public class Question_22 {
    public static boolean check(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort both character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       System.out.print("Enter the first string: ");
       String str1=scanner.nextLine();
       System.out.print("Enter the second string: ");
       String str2=scanner.nextLine();
       if(check(str1,str2)){
        System.out.println("The two Strings are Anagrams");
       }
       else{
        System.out.println("The two Strings are not Anagrams");
       }

    }
}
