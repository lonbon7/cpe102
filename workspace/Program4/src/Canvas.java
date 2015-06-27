/**
 * This class provides for space to put shapes that
 * you want to create.
 * 
 * @author Lonnie Bissmeyer
 * @version Program 4
 */

import java.util.ArrayList;
import java.awt.Color;

public class Canvas
{
   private ArrayList<Shape> list;
   
   /**
    * Constructs a new canvas to store shapes in.
    */
   public Canvas()
   {
      list = new ArrayList<Shape>();
   }
   
   /**
    * Adds a shape to the canvas.
    * @param shape The shape you want added to the canvas.
    */
   public void add(Shape shape)
   {
      list.add(shape);
   }
   
   /**
    * Removes a shape from the canvas.     
    * @param index The index of the shape you want to remove.
    * @return Returns a reference to the shape you removed.
    */
   public Shape remove(int index)
   {
      
      
      if(index >= list.size())
      {
         return null;
      }
      else
      {
         return list.remove(index);
      }      
   }
   
   /**
    * Retrieves a shape from the canvas at the specified index.
    * @param index The index of the shape you want to get.
    * @return Returns the shape you asked for.
    */
   public Shape get(int index)
   {
      return list.get(index);
   }
   
   /**
    * Tells you how many shapes are in the list.
    * @return Returns as an integer the number of shapes in list.
    */
   public int size()
   {
      return list.size();
   }
   
   /**
    * Collects only circles in a new list.
    * @return Returns a new array list of circles.
    */
   public ArrayList<Circle> getCircles()
   {
      ArrayList<Circle> circles = new ArrayList<Circle>();
      int i;
      
      for(i = 0; i < list.size(); i++)
      {
         if(list.get(i) instanceof Circle)
         {
           circles.add((Circle)list.get(i));
         }
      }
      
      return circles;
   }
   
   /**
    * Collects only convex polygons in a new list.
    * @return Returns a new list of convex polygons.
    */
   public ArrayList<ConvexPolygon> getConvexPolygons()
   {
      ArrayList<ConvexPolygon> polygons = new ArrayList<ConvexPolygon>();
      int i;
      
      for(i = 0; i < list.size(); i++)
      {
         if(list.get(i).getClass() == ConvexPolygon.class )
         {
           polygons.add((ConvexPolygon)list.get(i));
         }
      }
      
      return polygons;
   }
   
   /**
    * Collects only rectangles in a new list.
    * @return Returns a new list of rectangles.
    */
   public ArrayList<Rectangle> getRectangles()
   {
      ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
      int i;
      
      for(i = 0; i < list.size(); i++)
      {
         if(list.get(i) instanceof Rectangle && !(list.get(i) instanceof Square))
         {
            rectangles.add((Rectangle)list.get(i));
         }
      }
      
      return rectangles;
   }
   
   /**
    * Collects a list of only triangles.
    * @return Returns a new array list of triangles.
    */
   public ArrayList<Triangle> getTriangles()
   {
      ArrayList<Triangle> triangles = new ArrayList<Triangle>();
      int i;
      
      for(i = 0; i < list.size(); i++)
      {
         if(list.get(i) instanceof Triangle)
         {
           triangles.add((Triangle)list.get(i));
         }
      }
      
      return triangles;
   }
   
   /**
    * Sorts through canvas and finds shapes by their specified color.
    * @param color The color you want to sort by.
    * @return Returns a new list of shapes that were sorted by color.
    */
   public ArrayList<Shape> getShapesByColor(Color color)
   {
      ArrayList<Shape> shapes = new ArrayList<Shape>();
      int i;
      
      for(i = 0; i < list.size(); i++)
      {
         if(list.get(i).getColor() == color)
         {
            shapes.add(list.get(i));
         }
      }
      
      return shapes;
   }
   
   /**
    * Adds up the area of every shape in canvas.
    * @return Returns the total area as a double.
    */
   public double getAreaOfAllShapes()
   {
      double area = 0;
      int i;
      
      for(i = 0; i < list.size(); i++)
      {
         area += list.get(i).getArea();
      }
      
      return area;
   }      
}
