public class sphereTest
{
   public static void main(String[] args)
   {
      constructorTests();
      getRadiusTests();
      equalsTest();
      getDiameterTest();
      getSurfaceAreaTests();
      getVolumeTests();
      toStringTest();
   }
   
   public static void constructorTests()
   {
      Sphere s1 = new Sphere();
      Sphere s2 = new Sphere(2.0);
      
      if(s1.getRadius() != 1.0)
      {
         System.out.println("ERROR! s1  in constructorTests expected radius of 1.0, got " + s1.getRadius());
      }
      if(s2.getRadius() != 2.0)
      {
         System.out.println("ERROR! s2  in constructorTests expeceted radius of 2.0, got " + s2.getRadius());
      }
   }
   
   public static void getRadiusTests()
   {
      Sphere s1 = new Sphere();
      Sphere s2 = new Sphere(5.0);
      
      if(s1.getRadius() != 1.0)
      {
         System.out.println("ERROR! s1  in getRadiusTests expected radius of 1.0, got " + s1.getRadius());
      }
      if(s2.getRadius() != 5.0)
      {
         System.out.println("ERROR! s2 in getRadiusTests expected radius of 5.0, got " + s2.getRadius());
      }
   }
   
   public static void equalsTest()
   {
      Sphere s1 = new Sphere();
      Sphere s2 = new Sphere();
      Sphere s3 = new Sphere(2.0);
      Sphere s4 = new Sphere(3.0);
      
      if(s1.equals(s2) != true)
      {
         System.out.println("ERROR! s1.equals(s2) in equalsTest expected true, got " + s1.equals(s2));
      }
      if(s3.equals(s4))
      {
         System.out.println("ERROR! s3.equals(s4) in equalsTest expected false, got " + s3.equals(s2));
      }
   }
   
   public static void getDiameterTest()
   {
      Sphere s1 = new Sphere();
      Sphere s2 = new Sphere(2.0); 
      
      if(s1.getDiameter() != 2.0)
      {
         System.out.println("ERROR! s1.getDiatemer in getDiameterTest expected 2.0, got " + s1.getDiameter());
      }
      if(s2.getDiameter() != 4.0)
      {
         System.out.println("ERROR! s2.getDiameter in getDiameterTest expected 4.0, got " + s2.getDiameter());
      }
   }
   
   public static void getSurfaceAreaTests()
   {
      Sphere s1 = new Sphere();
      Sphere s2 = new Sphere(2.0);
      
      if(s1.getSurfaceArea() != 4 * Math.PI)
      {
         System.out.println("ERROR! s1 in getSurfaceAreaTests expected 4 * Math.PI, got " + s1.getSurfaceArea());
      }
      if(s2.getSurfaceArea() != 4 * Math.PI * 8.0)
      {
         System.out.println("ERROR! s2 in getSurfaceAreaTests expected 4 * Math.PI * 8.0, got " + s2.getSurfaceArea());
      }
   }
   
   public static void getVolumeTests()
   {
      Sphere s1 = new Sphere();
      Sphere s2 = new Sphere(2.0);
      
      if(s1.getVolume() != 4/3 * Math.PI)
      {
         System.out.println("ERROR! s1 in getVolumeTests expected 4/3 * Math.PI, got " + s1.getVolume());
      }
      if(s2.getVolume() != 4/3 * Math.PI * 8.0)
      {
         System.out.println("ERROR! s2 in getVolume expected 4/3 * Math.PI * 8.0, got " + s2.getVolume());
      }
   }
   
   public static java.lang.String toStringTest()
   {
      return "The Sphere class is mutable!";
   }      
}