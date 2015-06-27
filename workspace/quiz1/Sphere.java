/**
 * @author Lonnie Bissmeyer
 * @version Lab Quiz 1
 */

public class Sphere
{
   private double radius;
   
   public Sphere()
   {
      radius = 1.0;
   }
   
   public Sphere(double r)
   {
      radius = r;
   }
   
   public boolean equals(Sphere other)
   {
      if(this.getRadius() == other.getRadius())
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   public double getRadius()
   {
      return radius;
   }
   
   public double getDiameter()
   {
      double d;
      
      d = 2 * radius;
      
      return d;
   }
   
   public double getSurfaceArea()
   {
      double SA = 4 * Math.PI * (radius * radius);
      
      return SA;
   }
   
   public double getVolume()
   {
      double volume = (4/3) * Math.PI * (radius * radius * radius);
      
      return volume;
   }
   
   public java.lang.String toString()
   {
      return "The Sphere class is mutable!";
   }      
}