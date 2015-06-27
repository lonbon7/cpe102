import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileIO
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File file = new File("poem.txt");
      PrintStream writer = new PrintStream(file);
      writer.close();
      Scanner scanner = new Scanner(file);      
   }
   
   
}
