import java.awt.Color;
import java.awt.Point;

public interface Shape
{
   /**
    * Calculates and returns the area of the shape.
    * 
    * @return Returns the area of the shape as a double.
    */
   public double getArea();
   
   /**
    * Returns the color of the shape.
    * 
    * @return Returns the color of the shape as type Color.
    */
   public Color getColor();
   
   /**
    * Sets the color of the shape.
    * 
    * @param color The color you want the shape to be filled with.
    */
   public void setColor(Color color);
   
   /**
    * Returns true of the shape is filled with color, otherwise false
    * (shape is wire-framed).
    * 
    * @return The truth value of whether or not the shape is filled
    * with color.
    */   
   public boolean getFilled();
   
   /**
    * Sets the filled state of the shape to the specified value.
    * 
    * @param filled The truth value you want the filled state of the shape to be
    * set to.
    */   
   public void setFilled(boolean filled);
   
   /**
    * Returns the current position of the shape.
    * 
    * @return The position of the shape as type Point.
    */
   public Point getPosition();
   
   /**
    * Changes the position of the shape to the specified point.
    * 
    * @param position The point you want the shape to be set at.
    */
   public void setPosition(Point position);
   
   /**
    * Moves the shape by the x and y amounts specified (in the Point delta).
    * 
    * @param delta The points you want the shape to be moved by.
    */
   public void move(Point delta);
}
