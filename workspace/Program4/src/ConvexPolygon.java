/**
 * ConvexPolygon is a class used to construct convex polygons.
 * It also provides inheritance for other classes.
 *
 * @author Lonnie Bissmeyer
 * @version Program 4
 */

import java.awt.Point;
import java.awt.Color;

public class ConvexPolygon extends Shape
{
   private Point[] p;
      
   public ConvexPolygon(Point[] vertices, Color color, boolean filled)
   {
      super(color, filled);      
      
      p = new Point[vertices.length];      
            
      int i;
      for(i = 0; i < vertices.length; i++)
      {
         p[i] = new Point();         
         p[i].x = vertices[i].x;
         p[i].y = vertices[i].y;         
      }           
   }
   
   public Point getVertex(int index)
   {
      Point newPoint = new Point(p[index]);      
      
      return newPoint;
   }
   
   public void setVertex(int index, Point vertex)
   {
      p[index] = new Point(vertex);
   }
   
   public boolean equals(Object other)
   {
      int i;
     
      if(!super.equals(other))
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
      
   public Point getPosition()
   {
      Point newPoint = new Point(p[0]);      
      
      return newPoint;
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
