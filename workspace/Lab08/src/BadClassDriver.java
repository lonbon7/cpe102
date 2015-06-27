import java.util.Scanner;

public class BadClassDriver
{
   public static void main(String[] args)
   {
      try
      {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Please enter an integer value: ");
         int num = scanner.nextInt();
         
         BadClass b1 = new BadClass();
         
         b1.nullPointerMethod(null);
         b1.classCastMethod();
         b1.arrayIndexMethod();
         b1.methodCaller(num);
         b1.checkedExceptionThrower();
         b1.uncheckedExceptionThrower();
      }
      catch(NullPointerException exception)
      {
         System.out.println("A NullPointException was caught.");
      }
      catch(ClassCastException exception)
      {
         System.out.println("A ClassCastException was caught.");
      }
      catch(ArrayIndexOutOfBoundsException exception)
      {
         System.out.println("An ArrayIndexOutOfBoundsException was caught.");
      }
      catch(UncheckedException exception)
      {
         System.out.println("An UncheckedException was caught.");
      }
      finally
      {
         System.out.println("Hi. This is the finally block.");
      }
   }
}
