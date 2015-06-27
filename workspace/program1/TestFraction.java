public class TestFraction
{
   public static void main(String[] args)
   {
      constructor3Tests();
      getNumeratorTests();
      getDenominatorTests();
      equalsTest();
      addTest();
      divTest();
      mulTest();
      subTest();
      toStringTest();
      valueTest();
   }
   
   public static void constructor3Tests()
   {
      Fraction f1 = new Fraction(1,2);
      Fraction f2 = new Fraction(-1,2);
      Fraction f3 = new Fraction(1,1);
     
      if(f1.getNumerator() != 1)
      {
         System.out.println("ERROR! Fraction(1,2) expected numerator of 1, " +
                            "found " + f1.getNumerator());
      }
      if(f1.getDenominator() != 2)
      {
         System.out.println("ERROR! Fraction(1,2) expected denominator of 2, " +
                            "found " + f1.getDenominator());
      }
      if(f2.getNumerator() != -1)
      {
         System.out.println("ERROR! Fraction(-1,2) expected numerator of -1, " +
                            "found " + f2.getNumerator());
      }
      if(f2.getDenominator() != 2)
      {
         System.out.println("ERROR! Fraction(1,2) expected denominator of 2, " +
                            "found " + f2.getDenominator());
      }
      if(f3.getNumerator() != 1)
      {
         System.out.println("ERROR! Fraction(1,1) expected numerator of 1, " +
                            "found " + f3.getNumerator());
      }
      if(f3.getDenominator() != 1)
      {
         System.out.println("ERROR! Fraction(1,1) expected denominator of 1, " +
                            "found " + f3.getDenominator());
      }
   }
      
   public static void getNumeratorTests()
   {
      Fraction f1 = new Fraction(1,2);
      Fraction f2 = new Fraction(-1,2);
      Fraction f3 = new Fraction(0,1);
     
      if(f1.getNumerator() != 1)
      {
         System.out.println("ERROR! Fraction(1,2) expected numerator of 1, " +
                            "found " + f1.getNumerator());
      }
      if(f2.getNumerator() != -1)
      {
         System.out.println("ERROR! Fraction(-1,2) expected numerator of -1, " +
                            "found " + f2.getNumerator());
      } 
      if(f3.getNumerator() != 0)
      {
         System.out.println("ERROR! Fraction(0,1) expected numerator of 0, " +
                            "found " + f3.getNumerator());
      } 
   }
   
   public static void getDenominatorTests()
   {
      Fraction f1 = new Fraction(1,2);
      Fraction f2 = new Fraction(1,1);
      Fraction f3 = new Fraction(-1,2);
      
      if(f1.getDenominator() != 2)
      {
         System.out.println("ERROR! Fraction(1,2) expected denominator of 2, " +
                            "found " + f1.getDenominator());
      }
      if(f2.getDenominator() != 1)
      {
         System.out.println("ERROR! Fraction(1,1) expected denominator of 1, " +
                            "found " + f2.getDenominator());
      }
      if(f3.getDenominator() != 2)
      {
         System.out.println("ERROR! Fraction(-1,2) expected denominator of 2, " +
                            "found " + f3.getDenominator());
      }
   }
   
   public static void equalsTest()
   {
      Fraction f1 = new Fraction(1,2);
      Fraction f2 = new Fraction(1,2);
      Fraction f3 = new Fraction(-1,3);
      Fraction f4 = new Fraction(1,3);
      Fraction f5 = new Fraction(5,6);
      Fraction f6 = new Fraction(5,6);
     
      if(f1.equals(f2) == false)
      {
         System.out.println("ERROR! f1.equals(f2) expected true, got " + f1.equals(f2));
      }
      if(f3.equals(f4) == true)
      {
         System.out.println("ERROR! f3.equals(f4) expected false, got " + f3.equals(f4));
      }
      if(f5.equals(f6) == false)
      {
         System.out.println("ERROR! f5.equals(f6) expected true, got " + f5.equals(f6));
      }
   }
   
   public static void addTest()
   {
      Fraction f1 = new Fraction(1,2);
      Fraction f2 = new Fraction(1,3);
      Fraction f3 = f1.add(f2);
      Fraction f4 = new Fraction(-1,2);      
      Fraction f5 = new Fraction(3,4);
      Fraction f6 = f4.add(f5);
      Fraction f7 = new Fraction(-2,4);
      Fraction f8 = new Fraction(-3,4);
      Fraction f9 = f7.add(f8);
      
      if(f3.getNumerator() != 5 || f3.getDenominator() != 6)
      {
    	  System.out.println("ERROR! f1.add(f2) expected 5/6, got " + f1.add(f2));
      }
      if(f6.getNumerator() != 1 || f6.getDenominator() != 4)
      {
    	  System.out.println("ERROR! f4.add(f5) expected 1/4, got " + f4.add(f5));
      }
      if(f9.getNumerator() != -5 || f9.getDenominator() != 4)
      {
    	  System.out.println("ERROR! f7.add(f8) expected -5/4, got " + f7.add(f8));
      }      
   }
   
   public static void divTest()
   {
      Fraction f1 = new Fraction(1,2);
      Fraction f2 = new Fraction(1,2);
      Fraction f3 = f1.div(f2);
      Fraction f4 = new Fraction(1,1);
      Fraction f5 = new Fraction(-2,3);
      Fraction f6 = f4.div(f5);
      Fraction f7 = new Fraction(3,2);
      Fraction f8 = new Fraction(-2,3);
      Fraction f9 = f7.div(f8);
      
      if(f3.getNumerator() != 2 || f3.getDenominator() != 2)
      {
    	  System.out.println("ERROR! f1.div(f2) expected 2, got " + f1.div(f2));
      }
      if(f6.getNumerator() != 3 || f6.getDenominator() != -2)
      {
    	  System.out.println("ERROR! f4.div(f5) expected -3/2, got " + f4.div(f5));
      }
      if(f9.getNumerator() != 9 || f9.getDenominator() != -4)
      {
    	  System.out.println("ERROR! f7.div(f8) expected -9/4, got " + f7.div(f8));
      }     
   }
   
   public static void mulTest()
   {
      Fraction f1 = new Fraction(1,2);
      Fraction f2 = new Fraction(1,2);
      Fraction f3 = f1.mul(f2);
      Fraction f4 = new Fraction(1,4);
      Fraction f5 = new Fraction(-2,3);
      Fraction f6 = f4.mul(f5);
      Fraction f7 = new Fraction(-1,5);
      Fraction f8 = new Fraction(-2,5);
      Fraction f9 = f7.mul(f8);
      
      if(f3.getNumerator() != 1 || f3.getDenominator() != 4)
      {
    	  System.out.println("ERROR! f1.mul(f2) expected 1/4, got " + f1.mul(f2));
      }
      if(f6.getNumerator() != -1 || f6.getDenominator() != 6)
      {
    	  System.out.println("ERROR! f4.mul(f5) expected -1/6, got " + f4.mul(f5));
      }
      if(f9.getNumerator() != 2 || f9.getDenominator() != 25)
      {
    	  System.out.println("ERROR! f7.mul(f8) expected 2/25, got " + f7.mul(f8));
      }
   }
   
   public static void subTest()
   {
      Fraction f1 = new Fraction(1,2);
      Fraction f2 = new Fraction(1,2);
      Fraction f3 = f1.sub(f2);
      Fraction f4 = new Fraction(0,1);
      Fraction f5 = new Fraction(-1,2);
      Fraction f6 = f4.sub(f5);
      Fraction f7 = new Fraction(5,6);
      Fraction f8 = new Fraction(6,5);
      Fraction f9 = f7.sub(f8);
      
      if(f3.getNumerator() != 0 || f3.getDenominator() != 2)
      {
    	  System.out.println("ERROR! f1.sub(f2) expected 0/2, got " + f1.sub(f2));
      }
      if(f6.getNumerator() != 1 || f6.getDenominator() != 2)
      {
    	  System.out.println("ERROR! f4.sub(f5) expected 1/2, got " + f4.sub(f5));
      }
      if(f9.getNumerator() != -11 || f9.getDenominator() != 30)
      {
    	  System.out.println("ERROR! f7.sub(f8) expected -11/30, got " + f7.sub(f8));
      }
   }
   
   public static void toStringTest()
   {
      Fraction f1 = new Fraction(1,2);
      Fraction f2 = new Fraction(-1,2);
      Fraction f3 = new Fraction(1,1);
      
      if(!f1.toString().equals("1/2"))
      {
         System.out.println("ERROR! f1.toString expected 1/2, got " + f1.toString());
      }
      if(!f2.toString().equals("-1/2"))
      {
         System.out.println("ERROR! f2.toString expected -1/2, got " + f2.toString());
      }
      if(!f3.toString().equals("1/1"))
      {
         System.out.println("ERROR! f3.toString expected 1/1, got " + f3.toString());
      }
   }
   
   public static void valueTest()
   {
      Fraction f1 = new Fraction(1,2);
      Fraction f2 = new Fraction(-2,3);
      Fraction f3 = new Fraction(0,1);
      
      if(f1.value() != 0.5)
      {
         System.out.println("ERROR! f1.value expected 0.5, got " + f1.value());
      }
      if(f2.value() <= -0.666667 || f2.value() >= -0.6666665)
      {
    	  System.out.println("ERROR! f2.value expected -0.66, got " + f2.value());
      }
      if(f3.value() != 0.0)
      {
    	  System.out.println("ERROR! f3.value expected 0.0, got " + f3.value());
      }
   }
}    
