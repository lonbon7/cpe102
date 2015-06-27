import java.util.Scanner;

public class InputParser
{
   public static void main(String[] args)
   {
      int j = 0, numInt = 0, numDouble = 0, numString = 0, intSum = 0, intTemp = 0;
      double doubleSum = 0.0;
      String scat = "";
      
      Scanner scanner = new Scanner(System.in);
      System.out.print("How many values would you like to parse? ");
      int i = scanner.nextInt();
      
      while(j < i)
      {
         System.out.print("Enter a value: ");
         if(scanner.hasNextInt())
         {
        	 intSum += scanner.nextInt();
        	 numInt ++;        	 
         }
         else if(scanner.hasNextDouble())
         {
    	 	doubleSum += scanner.nextDouble();
    	 	numDouble ++;
         }
         else if(scanner.hasNext())
         {
        	 scat += scanner.next();
        	 numString ++;
         }
         j++;
      }
      
      System.out.println(intSum);
      System.out.println(numInt);
      System.out.println(doubleSum);
      System.out.println(numDouble);
      System.out.println(scat);
      System.out.println(numString);
   }
}