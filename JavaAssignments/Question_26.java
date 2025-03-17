import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;  
public class Question_26 {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("C:\\Users\\vishn\\OneDrive\\Documents\\JavaAssignment\\example.txt");
            int i;
        while((i=fr.read())!=-1){
            System.out.print((char)i);
        }
        fr.close();
    }
    catch(FileNotFoundException e){
        System.out.println(e);
    }
    catch(IOException e){
        System.out.println(e);
    }
    }
}
