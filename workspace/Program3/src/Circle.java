import java.awt.Color;
import java.awt.Point;

public class Circle implements Shape
{
   private double r;
   private Point p;
   private Color c;
   private boolean f;
   
   public Circle(double radius, Point position, Color color, boolean filled)
   {
      r = radius;
      p = position;
      c = color;
      f = filled;
   }
   
   public double getRadius()
   {
      return r;
   }
   
   public void setRadius(double radius)
   {
      r = radius;
   }
   
   public boolean equals(Object other)
   {
      if (other == null)
      {
         return false;
      }

      if (!(other instanceof Circle))
      {
         return false;
      }
      
      if(this.r != ((Circle)other).r)
      {
         return false;
      }
      
      if(!this.p.equals(((Circle)other).p))
      {
         return false;
      }
      
      if(!this.c.equals(((Circle)other).c))
      {
         return false;
      }
      
      return true;
   }
   
   public double getArea()
   {
      return Math.PI * r * r;
   }
   
   public Color getColor()
   {
      return c;
   }
   
   public void setColor(Color color)
   {
      c = color;
   }
   
   public boolean getFilled()
   {
      return f;
   }
   
   public void setFilled(boolean filled)
   {
      f = filled;
   }
   
   public Point getPosition()
   {
      return p;
   }
   
   public void setPosition(Point position)
   {
      p.setLocation(position.getX(), position.getY());
   }
   
   public void move(Point delta)
   {
      double dx = delta.getX();
      double dy = delta.getY();
           
      p.setLocation(p.getX() + dx, p.getY() + dy);
   }
}
