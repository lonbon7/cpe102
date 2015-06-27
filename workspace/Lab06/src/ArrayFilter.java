import java.util.ArrayList;

public class ArrayFilter 
{
   private ArrayList<Object> myList = new ArrayList<Object>();
   
   public void add(Integer x)
   {
      myList.add(x);
   }
   
   public void add(String x)
   {
      myList.add(x); 
   }
   
   public void add(Double x)
   {
      myList.add(x);
   }
   
   public void add(Boolean x)
   {
      myList.add(x);
   }
   
   public int minimumInt()
   {
      int i, min = 0, minCount = 0;
      
      if(myList.size() == 0)
      {
         min = 0;
         return min;
      }
      else
      {  
         for(i = 0; i < myList.size(); i++)
         {            
            if(myList.get(i) instanceof Integer)
            {      
               min = (Integer)myList.get(i);
               minCount++;
               break;
            }
         }
         
         if(minCount == 1)
         {
            for(i = 0; i < myList.size(); i++)
            {
               
               if((Integer)myList.get(i) < min)
               {                  
                  min = (Integer)myList.get(i);
               }
            }
               
         }
      }
      
      return min;
   }
   
   public double averageDouble()
   {
      double average;
      int i, sum = 0;
      
      if(myList.size() == 0)
      {
         average = 0;
         return average;
      }
      else
      {
         for(i = 0; i < myList.size(); i++)
         {
            if(myList.get(i) instanceof Double)
            {
               sum += (Double)myList.get(i);               
            }
         }
         average = sum/i;
         return average;
      }
   }
   
   public int numberOfTrues()
   {
      int i, numTrues = 0;
      
      if(myList.size() == 0)
      {
         return numTrues;
      }
      else
      {
         for(i = 0; i < myList.size(); i++)
         {
            if(myList.get(i) instanceof Boolean)
            {
               if((Boolean)myList.get(i))
               {
                  numTrues ++;
               }
            }
         }
      }
      return numTrues;
   }
   
   public int numberOfStrings()
   {
      int numString = 0, i;
            
      if(myList.size() == 0)
      {
         return numString;
      }
      else
      {
         for(i = 0; i < myList.size(); i++)
         {
            if(myList.get(i) instanceof String)
            {
               numString++;
            }
         }
      }
      return numString;
   }

}
