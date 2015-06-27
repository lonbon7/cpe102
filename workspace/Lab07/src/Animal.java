
public class Animal
{
   private int l;
   
   public Animal(int legs)
   {
      l = legs;
   }
   
   public boolean equals(Animal other)
   {
      if(other == null)
      {
         return false;
      }
      
      if(this.getClass() != other.getClass())
      {
         return false;
      }
      
      if(this.l != other.l)
      {
         return false;
      }
      
      return true;      
   }
   
   public String toString()
   {
      return "I am an animal object with " + l + " legs ";
   }
}
