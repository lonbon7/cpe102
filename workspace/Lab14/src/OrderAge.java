import java.util.Comparator;

public class OrderAge implements Comparator<Person>
{
   private Comparator<Person> c;
   
   public OrderAge()
   {
      
   }
   
   public OrderAge(Comparator<Person> c)
   {
      this.c = c;
   }
   
   public int compare(Person a, Person b)
   {
      if(a.getAge() < b.getAge())
      {
         return -1;
      }
      else if(a.getAge() > b.getAge())
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
