
public class Person extends Animal
{
   private String n;
   
   public Person(String name, int legs)
   {
      super(legs);
      n = name;     
   }
   
   public boolean equals(Person other)
   {
      if(!super.equals(other))
      {
         return false;
      }
      
      if(!this.n.equals(other.n))
      {
         return false;
      }
      
      return true;
   }
   
   public String toString()
   {
      return super.toString() + "and a person object whose name is " + n;
   }
}
