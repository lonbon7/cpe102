
public class BadClass
{
   public void nullPointerMethod(Integer num)
   {
      Integer sum = 0;
      sum += num;
   }
   
   public void classCastMethod()
   {
      Object x = new Integer(0);
      System.out.println((String)x);
   }
   
   public void arrayIndexMethod()
   {
      int i;
      int[] array = new int[10];
      
      for(i = -1; i < array.length; i++)
      {
         array[i] += array[i+1];
      }
   }
   
   public void methodCaller(int num)
   {
      BadClass b1 = new BadClass();
      
      if(num == 1)
      {
         b1.nullPointerMethod(null);
      }
      if(num == 2)
      {
         b1.classCastMethod();
      }
      if(num == 3)
      {
         b1.arrayIndexMethod();
      }
   }
   
   public void checkedExceptionThrower()
   {
      try
      {
         throw new CheckedException();
      }
      catch(CheckedException exception)
      {
         System.out.println("A CheckedException was caught.");
      }
   }
   
   public void uncheckedExceptionThrower()
   {
      throw new UncheckedException();
   }
}
