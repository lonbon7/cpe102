import java.awt.Color;
import java.awt.Point;

public class Square extends Rectangle
{
   public Square(int sideLength, Point position, Color color, boolean filled)
   {
      super(sideLength, sideLength, position, color, filled);
   }
   
   public int getSize()
   {
      return getWidth();
   }
   
   public void setSize(int size)
   {
      setWidth(size);
   }
   
   public void setHeight(int height)
   {
      super.setHeight(height);
      super.setWidth(height);
   }
   
   public void setWidth(int width)
   {
      super.setWidth(width);
      super.setHeight(width);
   }   
}
