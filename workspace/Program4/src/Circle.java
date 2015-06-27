import java.awt.Color;
import java.awt.Point;

public class Circle extends Ellipse
{       
   public Circle(double radius, Point position, Color color, boolean filled)
   {
      super(radius, radius, position, color, filled);
   }  
   
   public void setSemiMajorAxis(double axis)
   {
      super.setSemiMajorAxis(axis);
      super.setSemiMinorAxis(axis);
   }
   
   public void setSemiMinorAxis(double axis)
   {
      super.setSemiMinorAxis(axis);
      super.setSemiMajorAxis(axis);
   }
   
   public double getRadius()
   {
      return getSemiMajorAxis();
   }
   
   public void setRadius(double radius)
   {
      super.setSemiMinorAxis(radius);
      super.setSemiMajorAxis(radius);      
   }
}
