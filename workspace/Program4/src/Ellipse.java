/**
 * This class constructs an ellipse and provides inheritance
 * for the circle class.
 * 
 * @author Lonnie Bissmeyer
 * @version Program 4 
 *
 */

import java.awt.Color;
import java.awt.Point;

public class Ellipse extends Shape
{
   private Point p;
   private double major;
   private double minor;
   
   public Ellipse(double semiMajorAxis, double semiMinorAxis, Point position, Color color
                  , boolean filled)
   {
      super(color, filled);
      major = semiMajorAxis;
      minor = semiMinorAxis;
      p = new Point(position);
   }
   
   public double getSemiMajorAxis()
   {
      return major;
   }
   
   public void setSemiMajorAxis(double axis)
   {
      major = axis;
      double tempMinor = minor;
      
      if(major < minor)
      {
         minor = major;
         major = tempMinor;
      }
   }
   
   public double getSemiMinorAxis()
   {
      return minor;
   }
   
   public void setSemiMinorAxis(double axis)
   {
      minor = axis;
      double tempMajor = major;
      
      if(minor > major)
      {
         
         major = minor;
         minor = tempMajor;
      }
   }
   
   public boolean equals(Object other)
   {
      if(!super.equals(other))
      {
         return false;
      }
      
      if(!p.equals(((Ellipse)other).p))
      {
         return false;
      }
      
      if(this.major != ((Ellipse)other).major)
      {
         return false;
      }
      
      if(this.minor != ((Ellipse)other).minor)
      {
         return false;
      }
      
      return true;
   }
   
   public double getArea()
   {
      return Math.PI * minor * major;
   }
   
   public Point getPosition()
   {
      Point newPoint = new Point();
      newPoint.setLocation(p);
      
      return newPoint;
   }
   
   public void setPosition(Point position)
   {
      p = new Point(position);
   }
   
   public void move(Point delta)
   {
      p.setLocation(p.getX() + delta.getX(), p.getY() + delta.getY());
   }
   
}
