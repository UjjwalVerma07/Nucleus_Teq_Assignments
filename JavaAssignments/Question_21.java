import java.util.*;
public class Question_21 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Value of the String: ");
        String str=scanner.nextLine();
        int count_vowel=0;
        for(int i=0;i<str.length();i++){
            char ch=Character.toLowerCase(str.charAt(i));
            if((ch=='a')||(ch=='e') || (ch=='i') || (ch=='o') || (ch=='u')){
                count_vowel++;
            }
        }
        System.out.println("The Vowel Count for a given String is: "+count_vowel);
    }
}
