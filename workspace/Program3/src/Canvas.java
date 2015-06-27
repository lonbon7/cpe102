import java.util.ArrayList;
import java.awt.Color;

public class Canvas
{
   private ArrayList<Shape> list;
   
   public Canvas()
   {
      list = new ArrayList<Shape>();
   }
   
   public void add(Shape shape)
   {
      list.add(shape);
   }
   
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
   
   public Shape get(int index)
   {
      return list.get(index);
   }
   
   public int size()
   {
      return list.size();
   }
   
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
   
   public ArrayList<ConvexPolygon> getConvexPolygons()
   {
      ArrayList<ConvexPolygon> polygons = new ArrayList<ConvexPolygon>();
      int i;
      
      for(i = 0; i < list.size(); i++)
      {
         if(list.get(i) instanceof ConvexPolygon)
         {
           polygons.add((ConvexPolygon)list.get(i));
         }
      }
      
      return polygons;
   }
   
   public ArrayList<Rectangle> getRectangles()
   {
      ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
      int i;
      
      for(i = 0; i < list.size(); i++)
      {
         if(list.get(i) instanceof Rectangle)
         {
           rectangles.add((Rectangle)list.get(i));
         }
      }
      
      return rectangles;
   }
   
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
