
public class Lab07Test
{
   public static void main(String[] args)
   {
      toStringTest();
   }
   
   public static void toStringTest()
   {
      Student s = new Student(3.0, "Lonnie", 2);
      
      System.out.println(s.toString());
   }
}
