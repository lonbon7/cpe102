import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Dictionary implements Iterable<String>
{
   private ArrayList<String> list = new ArrayList<String>();
   
   public Dictionary(String fileName, boolean sort) throws DictionaryException
   {
      try
      {
         File file = new File(fileName);
         Scanner in = new Scanner(file);            
      
         while(in.hasNext())
         {
            list.add(in.next());            
         }        
      }
      catch(FileNotFoundException exception) 
      {
         throw new DictionaryException();
      }
     
      if(sort == true)
      {
         sort();
      }
   }
   
   private void sort()
   {
      for (int i = 0; i < list.size() - 1; i++)
      {
         int minPos = minimumPosition(i);
         swap(minPos, i);
      }
   }
   
   private int minimumPosition(int from)
   {
      int minPos = from;

      for (int i = from + 1; i < list.size(); i++)
      {
         if (list.get(i).compareTo(list.get(minPos)) < 0)
         {
            minPos = i;
         }
      }

      return minPos;
   }
   
   private void swap(int i, int j)
   {
      String temp = list.get(i);
      list.set(i, list.get(j));
      list.set(j, temp);
   }
   
   public Iterator<String> iterator()
   {
      Iterator<String> it = list.iterator();
      return it;
   }
   
   private int search(String value)
   {
       int lo = 0;
       int hi = list.size() - 1;

       while(lo <= hi)
       {
           int mid = (lo + hi) / 2;
    
           if(list.get(mid).compareTo((value)) > 0)
           {
               hi = mid - 1;
           }
           else if(list.get(mid).compareTo((value)) < 0)
           {
               lo = mid + 1;
           }
           else
           {
               return mid;
           }
       }

       return -1;
   }
   
   public boolean lookUp(String word)
   {
      if(search(word) != -1)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   public void write(String fileName) throws DictionaryException
   {
      int i = 0;
      
      try
      {
         File file = new File(fileName);
         PrintStream writer = new PrintStream(file);            
         while(i != list.size())
         {
            writer.println(list.get(i));
            i++;
         }
         writer.flush();
         writer.close();
      }
      catch(FileNotFoundException exception)
      {
         throw new DictionaryException();
      }            
   }
}
