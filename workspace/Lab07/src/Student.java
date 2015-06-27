
public class Student extends Person
{
   private double gpa;
   
   public Student(double grade, String name, int legs)
   {
      super(name, legs);
      gpa = grade;
   }
   
   public boolean equals(Student other)
   {
      if(!super.equals(other))
      {
         return false;
      }
      
      if(this.gpa != other.gpa)
      {
         return false;
      }
      
      return true;
   }
   
   public String toString()
   {
      return super.toString() + " and a student object with a " + gpa + " gpa.";
   }
}
