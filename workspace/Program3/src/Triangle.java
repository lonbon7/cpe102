import java.awt.Color;
import java.awt.Point;

public class Triangle implements Shape
{
   private Point A;
   private Point B;
   private Point C;
   private Color clr;
   private boolean f;
   
	public Triangle(Point a, Point b, Point c, Color color, boolean filled)
	{
	   A = a;
	   B = b;
	   C = c;
	   clr = color;
	   f = filled;	   
	}
	
	public Point getVertexA()
	{
	   return A;
	}
	
	public void setVertexA(Point point)
	{
	   A = point;
	}
	
	public Point getVertexB()
	{
	   return B;
	}
	
	public void setVertexB(Point point)
	{
	   B = point;
	}
	
	public Point getVertexC()
	{
	   return C;
	}
	
	public void setVertexC(Point point)
	{
	   C = point;
	}
	
	public boolean equals(Object other)
   {
	   if (other == null)
	   {
	      return false;
	   }

	   if (!(other instanceof Triangle))
	   {
	      return false;
	   }
      
      if(!this.A.equals(((Triangle)other).A))
      {
         return false;
      }
      
      if(!this.B.equals(((Triangle)other).B))
      {
         return false;
      }
      
      if(!this.C.equals(((Triangle)other).C))
      {
         return false;
      }
      
      if(!this.clr.equals(((Triangle)other).clr))
      {
         return false;
      }
      
      if(this.f != ((Triangle)other).f)
      {
         return false;
      }
      
      return true;
   }
	
	public double getArea()
	{
	   double a, b, c, s, area;
	   
	   a = Math.sqrt(Math.pow(C.getX() - B.getX(), 2) +
	       Math.pow(C.getY() - B.getY(), 2));
	   
	   b = Math.sqrt(Math.pow(C.getX() - A.getX(), 2) +
	       Math.pow(C.getY() - A.getY(), 2));
	   
	   c = Math.sqrt(Math.pow(B.getX() - A.getX(), 2) +
	       Math.pow(B.getY() - A.getY(), 2));
	   
	   s = (a + b + c) / 2;
	   
	   area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
	   
	   return area;
	}
	
	public Color getColor()
	{
	   return clr;
	}
	
	public void setColor(Color color)
	{
	   clr = color;
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
	   return A;
	}
	
	public void setPosition(Point position)
	{
	   double dx = position.getX();
	   double dy = position.getY();
	   double ax = A.getX();
	   double ay = A.getY();
	   double nX = dx - ax;
	   double nY = dy - ay;
	   
	   A.setLocation(position.getX(), position.getY());
	   B.setLocation(B.getX() + nX, B.getY() + nY);
	   C.setLocation(C.getX() + nX, C.getY() + nY);	   
	}
	
	public void move(Point delta)
	{
	   double dx = delta.getX();
	   double dy = delta.getY();	   
	   
	   A.setLocation(A.getX() + dx, A.getY() + dy);
	   B.setLocation(B.getX() + dx, B.getY() + dy);
	   C.setLocation(C.getX() + dx, C.getY() + dy);	   
	}
}

	