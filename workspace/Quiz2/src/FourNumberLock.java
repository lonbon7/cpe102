/**
 * 
 * @author Lonnie Bissmeyer
 * @version Lab Quiz 2
 *
 */
public class FourNumberLock extends ThreeNumberLock
{
   private int num4;
   
   public FourNumberLock(int val1, int val2, int val3, int val4)
   {
      super(val1, val2, val3);
      num4 = val4;
      
      if(num4 < 0 || num4 > 99)
      {
         throw new IllegalArgumentException();
      }
   }
   
   public boolean open(int number1, int number2, int number3, int number4)
   {
      if(!super.open(number1, number2, number3))
      {
         return false;
      }
      
      if(num4 != number4)
      {
         return false;
      }      
     
      return true;
   }
   
   public boolean equals(Object other)
   {
      if(!super.equals(other))
      {
         return false;
      }
      
      if(this.num4 != ((FourNumberLock)other).num4)
      {
         return false;
      }
      
      return true;       
   }
   
   public int compareTo(ThreeNumberLock other)
   {
      if(this instanceof ThreeNumberLock && !(this instanceof FourNumberLock))
      {
         if(other instanceof FourNumberLock)
         {
            return 1;
         }
      }
      
      if(super.compareTo(other) == 0 && this.num4 < ((FourNumberLock)other).num4)
      {
         return 1;
      }
      
      if(super.compareTo(other) == 0 && this.num4 > ((FourNumberLock)other).num4)
      {
         return -1;
      }
      
      if(super.compareTo(other) == 0 && this.num4 == ((FourNumberLock)other).num4)
      {
         return 0;
      }
      
      return super.compareTo(other);
   }
}
