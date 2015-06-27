/**
 * This class constructs a convex polygon with three vertices.
 * 
 * @author Lonnie Bissmeyer
 * @version Program 4
 */

import java.awt.Color;
import java.awt.Point;

public class Triangle extends ConvexPolygon
{
   public Triangle(Point a, Point b, Point c, Color color, boolean filled)
   {
      super(new Point[]{a, b, c}, color, filled);
   }
   
   public Point getVertexA()
   {
      Point newPoint = new Point();
      newPoint.setLocation(getVertex(0));
      
      return newPoint;
   }
   
   public void setVertexA(Point point)
   {
       super.setVertex(0, point);
   }
   
   public Point getVertexB()
   {
      Point newPoint = new Point();
      newPoint.setLocation(getVertex(1));
      
      return newPoint;
   }
   
   public void setVertexB(Point point)
   {
     super.setVertex(1, point);
   }
   
   public Point getVertexC()
   {
      Point newPoint = new Point();
      newPoint.setLocation(getVertex(2));
      
      return newPoint;
   }
   
   public void setVertexC(Point point)
   {
      super.setVertex(2, point);
   }  
   
   public double getArea()
   {
      double a, b, c, s, area;
      
      a = Math.sqrt(Math.pow(getVertexC().getX() - getVertexB().getX(), 2) +
          Math.pow(getVertexC().getY() - getVertexB().getY(), 2));
      
      b = Math.sqrt(Math.pow(getVertexC().getX() - getVertexA().getX(), 2) +
          Math.pow(getVertexC().getY() - getVertexA().getY(), 2));
      
      c = Math.sqrt(Math.pow(getVertexB().getX() - getVertexA().getX(), 2) +
          Math.pow(getVertexB().getY() - getVertexA().getY(), 2));
      
      s = (a + b + c) / 2;
      
      area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
      
      return area;
   }   
}

