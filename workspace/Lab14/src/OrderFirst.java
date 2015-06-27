import java.util.Comparator;


public class OrderFirst implements Comparator<Person>
{
   private Comparator<Person> c;
   
   public OrderFirst()
   {
      
   }
   
   public OrderFirst(Comparator<Person> c)
   {
      this.c = c;
   }
   
   public int compare(Person a, Person b)
   {
      if(a.getFirst().compareTo(b.getFirst()) < 0)
      {
         return -1;
      }
      else if(a.getFirst().compareTo(b.getFirst()) > 0)
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
