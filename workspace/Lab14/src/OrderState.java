import java.util.Comparator;

public class OrderState implements Comparator<Person>
{
   private Comparator<Person> c;
   
   public OrderState()
   {
      
   }
   
   public OrderState(Comparator<Person> c)
   {
      this.c = c;
   }
   
   public int compare(Person a, Person b)
   {
      if(a.getState().compareTo(b.getState()) < 0)
      {
         return -1;
      }
      else if(a.getState().compareTo(b.getState()) > 0)
      {
         return 1;
      }
      
      if(c == null)
      {
         return 0;         
      }
      
      return c.compare(a, b);
   }
}
