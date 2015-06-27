/**
 * @author Lonnie Bissmeyer
 *@version Lab Quiz 3
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Box
{
   private double length, width, height, weight;
   
   public Box(double length, double width, double height, double weight)
   {
      this.length = length;
      this.width = width;
      this.height = height;
      this.weight = weight;
   }
   
   public double getLength()
   {
      return length;
   }
   
   public double getWidth()
   {
      return width;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public double getWeight()
   {
      return weight;
   }
   
   public double getVolume()
   {
      return length * width * height;
   }
   
   public double getMaxDimension()
   {
      if(length > width && length > height)
      {
         return length;
      }
      else if(width > length && width > height)
      {
         return width;
      }
      
      return height;      
   }
   
   public boolean equals(Object other)
   {
      if(other == null)
      {
         return false;
      }
      
      if(this.length != ((Box)other).length)
      {
         return false;
      }
      
      if(this.width != ((Box)other).width)
      {
         return false;
      }
      
      if(this.height != ((Box)other).height)
      {
         return false;
      }
      
      return true;
   }
   
   public static void write(String fileName, ArrayList<Box> list) throws FileNotFoundException,
   IOException
   {
      int i = 0;
      
      FileOutputStream file = new FileOutputStream(fileName);
      DataOutputStream out = new DataOutputStream(file);
      
      while(i < list.size())
      {
         out.writeDouble(list.get(i).length);
         out.writeDouble(list.get(i).width);
         out.writeDouble(list.get(i).height);
         out.writeDouble(list.get(i).weight);
         
         i++;
      }
      out.flush();
      out.close();
      file.close();      
   }
   
   public static ArrayList<Box> read(String fileName) throws FileNotFoundException,
   IOException
   {
      ArrayList<Box> list = new ArrayList<Box>();
      FileInputStream file = new FileInputStream(fileName);
      DataInputStream in = new DataInputStream(file);
      
      try
      {
         while(true)
         {
            Box box = new Box(in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble());
            list.add(box);
         }
      }
      catch(EOFException exception)
      {
         in.close();
         file.close();
         return list;
      }
   }
}
