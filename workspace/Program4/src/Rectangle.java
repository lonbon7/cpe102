/**
 *
 * This class constructs a convex polygon with four rectilinear sides.
 * 
 * @author Lonnie Bissmeyer
 * @version Program 4
 */

import java.awt.Color;
import java.awt.Point;

public class Rectangle extends ConvexPolygon
{
   public Rectangle(int width, int height, Point position, Color color, boolean filled)
   {
      super(new Point[]{position, new Point(position.x + width, position.y),
            new Point(position.x + width, position.y + height),
            new Point(position.x, position.y + height)}, color, filled);
   }
   
   public int getWidth()
   {
      return getVertex(1).x - getVertex(0).x;
   }
   
   public void setWidth(int width)
   {
      int diff = width - (getVertex(1).x - getVertex(0).x);
      
      Point newPointX = new Point(getVertex(1).x + diff, getVertex(1).y);
      Point newPointY = new Point(getVertex(2).x + diff, getVertex(2).y);
      super.setVertex(1, newPointX);
      super.setVertex(2, newPointY);      
   }
   
   public int getHeight()
   {
      return getVertex(2).y - getVertex(0).y;
   }
   
   public void setHeight(int height)
   {
      int diff = height - (getVertex(2).y - getVertex(1).y);
      
      Point newPointX = new Point(getVertex(2).x, getVertex(2).y + diff);
      Point newPointY = new Point(getVertex(3).x, getVertex(3).y + diff);
      super.setVertex(2, newPointX);
      super.setVertex(3, newPointY);      
   }   
   
   public void setVertex(int index, Point vertex)
   {
      throw new UnsupportedOperationException();
   }
}
