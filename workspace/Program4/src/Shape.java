/**
 * Shape is an abstract class provides the necessary date to construct
 * and compare different shapes.
 *
 * @author Lonnie Bissmeyer
 * @version Program 4
 */

import java.awt.Color;
import java.awt.Point;

public abstract class Shape implements Comparable<Shape> 
{
   private Color c;
   private boolean f;
   
   /**
    * Constructs a shape with the specified color and filled state.
    * 
    * @param color The color you want your shape to be.
    * @param value The filled state you want your shape to be in.
    */
   public Shape(Color color, boolean value)
   {
      c = color;
      f = value;
   }
   /**
    * Calculates and returns the area of the shape.
    * 
    * @return Returns the area of the shape as a double.
    */
   public abstract double getArea();
   
   /**
    * Returns the color of the shape.
    * 
    * @return Returns the color of the shape as type Color.
    */
   public Color getColor()
   {
      return c;
   }
   
   /**
    * Sets the color of the shape.
    * 
    * @param color The color you want the shape to be filled with.
    */
   public void setColor(Color color)
   {
      c = color;
   }
   
   /**
    * Returns true of the shape is filled with color, otherwise false
    * (shape is wire-framed).
    * 
    * @return The truth value of whether or not the shape is filled
    * with color.
    */   
   public boolean getFilled()
   {
      return f;
   }
   
   /**
    * Sets the filled state of the shape to the specified value.
    * 
    * @param filled The truth value you want the filled state of the shape to be
    * set to.
    */   
   public void setFilled(boolean filled)
   {
      f = filled;
   }
   
   /**
    * Returns the current position of the shape.
    * 
    * @return The position of the shape as type Point.
    */
   public abstract Point getPosition();
   
   /**
    * Changes the position of the shape to the specified point.
    * 
    * @param position The point you want the shape to be set at.
    */
   public abstract void setPosition(Point position);
   
   /**
    * Moves the shape by the x and y amounts specified (in the Point delta).
    * 
    * @param delta The points you want the shape to be moved by.
    */
   public abstract void move(Point delta);
   
   /**
    * Compares two shapes and checks for equality.
    * The first check is by name, the second by area.
    * 
    * @param other The shape you want to compare your shape to.
    * 
    * @return -1 if the explicit parameter is less the your shape, 0 if equal, and 1 if
    * greater.
    */
   public int compareTo(Shape other)
   {
      String thisClassName = this.getClass().getName();
      String otherClassName = other.getClass().getName();
      
      if(thisClassName.compareTo(otherClassName) < 0)
      {
         return -1;
      }      
      
      if(thisClassName.compareTo(otherClassName) > 0)
      {
         return 1;
      }
      
      if(this.getArea() < other.getArea())
      {
         return -1;
      }
      
      if(this.getArea() > other.getArea())
      {
         return 1;
      }
      
      return 0;
   }
   
   /**
    * Compare shape for equality based on class and instance variables.
    * Overrides Object's equals method.
    * 
    * @param The object you want to compare your object to.
    * 
    * @return A true value if the objects are equal, otherwise false.
    */
   public boolean equals(Object other)
   {
      if(other == null)
      {
         return false;
      }
      
      if(this.getClass() != other.getClass())
      {
         return false;
      }
      
      if(!this.c.equals(((Shape)other).c))
      {
         return false;
      }
      
      if(this.f != ((Shape)other).f)
      {
         return false;
      }
      
      return true;
   }
}
