import java.util.LinkedList;
import java.util.ListIterator;


public class Explorer
{
   private LinkedList<String> strings = new LinkedList<String>();
   private LinkedList<Integer> numbers = new LinkedList<Integer>();
   
   public Explorer()
   {
      int i;      
      
      for(i = 0; i < 10; i++)
      {
         strings.add("" + i);
      }
      
      for(i = 0; i < 10; i++)
      {
         numbers.add(i);
      }     
   }
   
   public void  stringIterator()
   {
      ListIterator<String> stringIt = strings.listIterator();
      while(stringIt.hasNext())
      {
         System.out.println(stringIt.next());
      }      
   }
   
   public void integerIterator()
   {
      for(Integer i : numbers)
      {
         System.out.println(i);
      }
   }
   
   
}
