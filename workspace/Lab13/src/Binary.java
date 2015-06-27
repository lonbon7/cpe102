import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;

public class Binary
{
   public static ArrayList<Object> read(String fileName) throws
   FileNotFoundException, IOException
   {
      Integer tempInt;
      
      ArrayList<Object> list = new ArrayList<Object>();
      FileInputStream input = new FileInputStream(fileName);
      DataInputStream in = new DataInputStream(input);
      
      try
      {
         while(true)
         {
            tempInt = in.readInt();
            list.add(tempInt);
         
            for(int i = 0; i < tempInt; i++)
            {
               list.add(in.readDouble());
            }            
         }
      }
      catch(EOFException exception)
      {
         in.close();
         input.close();
         return list;
      }      
   }
   
   public static void write(String fileName, ArrayList<Object> list) throws
   FileNotFoundException, IOException
   {
      int i = 0;
      
      FileOutputStream file = new FileOutputStream(fileName);
      DataOutputStream out = new DataOutputStream(file);     
      
      while(i < list.size())
      {
         Object tempInt = list.get(i);
         
         if(list.get(i) instanceof Integer)
         {            
            out.writeInt((Integer)list.get(i));           
            i++;
         }
         else
         {
            out.flush();
            out.close();     
            file.close();
            throw new IllegalArgumentException("You messed up in ints.");            
         }        
         
         for(int j = 0; j < (Integer)tempInt; j++)
         {
            if(list.get(i) instanceof Double)
            {
               out.writeDouble((Double)list.get(i));               
               i++;
            }
            else
            {
               out.flush();
               out.close();
               file.close();
               throw new IllegalArgumentException("You messed up in doubles.");
            }
         }
      }
      out.flush();      
      out.close();
      file.close();
      
   }
}
