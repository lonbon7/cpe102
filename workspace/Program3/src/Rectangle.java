import java.awt.Color;
import java.awt.Point;

public class Rectangle implements Shape
{
   private int w;
   private int h;
   private Point p;
   private Color c;
   private boolean f;
   
   public Rectangle(int width, int height, Point position, Color color, boolean filled)
   {
      w = width;
      h = height;
      p = position;
      c = color;
      f = filled;
   }
   
   public int getWidth()
   {
      return w;
   }
   
   public void setWidth(int width)
   {
      w = width;
   }
   
   public int getHeight()
   {
      return h;
   }
   
   public void setHeight(int height)
   {
      h = height;
   }
   
   public boolean equals(Object other)
   {
      if (other == null)
      {
         return false;
      }

      if (!(other instanceof Rectangle))
      {
         return false;
      }
      
      if(this.w != ((Rectangle)other).w)
      {
         return false;
      }
      
      if(this.h != ((Rectangle)other).h)
      {
         return false;
      }
      
      if(!this.p.equals(((Rectangle)other).p))
      {
         return false;
      }
      
      if(!this.c.equals(((Rectangle)other).c))
      {
         return false;
      }
      
      if(this.f != ((Rectangle)other).f)
      {
         return false;
      }
      
      return true;
   }
   
   public double getArea()
   {
      return w * h;
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
