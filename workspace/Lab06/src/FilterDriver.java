import java.util.Scanner;

public class FilterDriver 
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      ArrayFilter filter = new ArrayFilter();
      
      int min, numTrue, numString;
      double average;
      
      while(true)
      {
         System.out.print("Enter a value: ");
         
         if(scanner.hasNextInt())
         {
            filter.add(scanner.nextInt());            
         }
         else if(scanner.hasNextDouble())
         {
            filter.add(scanner.nextDouble());
         }
         else if(scanner.hasNextInt())
         {
            filter.add(scanner.nextInt());            
         }
         else if(scanner.hasNextBoolean())
         {
            filter.add(scanner.nextBoolean());           
         }
         else if(scanner.hasNext())
         {
            String s = scanner.next();
            
            if(s.equals("quit"))
            {
               break;
            }
            else
            {
               filter.add(s);             
            }
         }
      }
      min = filter.minimumInt();
      average = filter.averageDouble();
      numString = filter.numberOfStrings();
      numTrue = filter.numberOfTrues();
      
      
      System.out.println("Minimum Integer: " + min);
      System.out.println("Average of doubles: " + average);
      System.out.println("Number of strings: " + numString);
      System.out.println("Number of trues: " + numTrue);    
   }
}
