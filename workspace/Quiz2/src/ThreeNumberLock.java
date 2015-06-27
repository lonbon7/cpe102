/**
 * 
 * @author Lonnie Bissmeyer
 * @version Lab Quiz 2
 *
 */
public class ThreeNumberLock implements Comparable<ThreeNumberLock>
{
   private int num1;
   private int num2;
   private int num3;
   private boolean locked;
   
   public ThreeNumberLock(int number1, int number2, int number3)
   {
      num1 = number1;
      if(num1 < 0 || num1 > 99)
      {
         throw new IllegalArgumentException();
      }
      
      num2 = number2;
      if(num2 < 0 || num2 > 99)
      {
         throw new IllegalArgumentException();
      }
      
      num3 = number3;
      if(num3 < 0 || num3 > 99)
      {
         throw new IllegalArgumentException();
      }
      
      locked = true;      
   }
   
   public boolean open(int number1, int number2, int number3)
   {
      if(num1 == number1 && num2 == number2 && num3 == number3)
      {
         locked = false;
         
         return true;
      }
      
      return false;
   }
   
   public boolean isOpen()
   {
      if(locked == true)
      {
         return false;
      }
      
      return true;
   }
   
   public void close()
   {
      locked = true;
   }
   
   public boolean equals(Object other)
   {
      if(other == null)
      {
         return false;
      }
      
      if(!(other instanceof ThreeNumberLock))
      {
         return false;
      }
      
      if(this.num1 != ((ThreeNumberLock)other).num1)
      {
         return false;
      }
      
      if(this.num2 != ((ThreeNumberLock)other).num2)
      {
         return false;
      }
      
      if(this.num3 != ((ThreeNumberLock)other).num3)
      {
         return false;
      }
      
      return true;
   }
   
   public int compareTo(ThreeNumberLock other)
   {
      if(this.num1 > other.num1)
      {
         return -1;
      }
      
      if(this.num1 < other.num1)
      {
         return 1;
      }
      
      if(this.num2 > other.num2)
      {
         return -1;
      }
      
      if(this.num2 < other.num2)
      {
         return 1;
      }
      
      if(this.num3 > other.num3)
      {
         return -1;
      }
      
      if(this.num3 < other.num3)
      {
         return 1;
      }
      
      return 0;
   }
}
