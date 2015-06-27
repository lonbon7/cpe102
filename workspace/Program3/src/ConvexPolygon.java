import java.awt.Point;
import java.awt.Color;

public class ConvexPolygon implements Shape
{
   private Point[] p;
   private Color c;
   private boolean f;
   
   public ConvexPolygon(Point[] vertices, Color color, boolean filled)
   {
      p = new Point[vertices.length];
      int i;
      
      for(i = 0; i < vertices.length; i++)
      {
         p[i] = vertices[i];
      }
      
      c = color;
      f = filled;      
   }
   
   public Point getVertex(int index)
   {
      return p[index];
   }
   
   public void setVertex(int index, Point vertex)
   {
      p[index] = vertex;
   }
   
   public boolean equals(Object other)
   {
      int i;
      
      if (other == null)
      {
         return false;
      }

      if (!(other instanceof ConvexPolygon))
      {
         return false;
      }
      
      if(this.p.length != ((ConvexPolygon)other).p.length)
      {
         return false;
      }
      
      for(i = 0; i < p.length; i++)
      {
         if(!this.p[i].equals(((ConvexPolygon)other).p[i]))
         {
            return false;
         }
      }
      
      if(!this.c.equals(((ConvexPolygon)other).c))
      {
         return false;
      }
      
      if(this.f != ((ConvexPolygon)other).f)
      {
         return false;
      }
      
      return true;
   }
   
   public double getArea()
   {
      int i;
      double area1 = 0, area2 = 0, totalArea;
      
      for(i = 0; i < p.length; i++)
      {
         if(i == p.length - 1)
         {
            area1 += p[i].getX() * p[0].getY();
            break;
         }
         area1 += p[i].getX() * p[i + 1].getY();
      }
      
      for(i = 0; i < p.length; i++)
      {
         if(i == p.length - 1)
         {
            area2 += p[i].getY() * p[0].getX();
            break;
         }
         area2 += p[i].getY() * p[i + 1].getX();
      }
      
      totalArea = (area1 - area2)/2;
      
      return totalArea;
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
      return p[0];
   }
   
   public void setPosition(Point position)
   {
      int i;
      double dx = position.getX();
      double dy = position.getY();
      double px = p[0].getX();
      double py = p[0].getY();
      double nx = dx - px;
      double ny = dy - py;
      
      p[0].setLocation(dx, dy);
      
      for(i = 1; i < p.length; i++)
      {
         p[i].setLocation(p[i].getX() + nx, p[i].getY() + ny);
      }
   }
   
   public void move(Point delta)
   {
      int i;
      double dx = delta.getX();
      double dy = delta.getY();
      
      for(i = 0; i < p.length; i++)
      {
         p[i].setLocation(p[i].getX() + dx, p[i].getY()+ dy);
      }      
   }
}
