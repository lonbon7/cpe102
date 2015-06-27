import java.util.Comparator;

public class OrderLast implements Comparator<Person>
{
   private Comparator<Person> c;
   
   public OrderLast()
   {
      
   }
   
   public OrderLast(Comparator<Person> c)
   {
      this.c = c;
   }
   
   public int compare(Person a, Person b)
   {
      if(a.getLast().compareTo(b.getLast()) < 0)
      {
         return -1;
      }
      else if(a.getLast().compareTo(b.getLast()) > 0)
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
