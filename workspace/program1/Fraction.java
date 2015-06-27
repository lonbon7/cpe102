//This is the website I got my GCD algorithm from: http://stackoverflow.com/questions/4009198/java-get-greatest-common-divisor

public class Fraction
{
   private int n;
   private int d;
   
   public Fraction(int numerator, int denominator)
   {
      int gcd;
      n = numerator;
      d = denominator;
      
                             
      if(d <= 0)
      {
    	  throw new IllegalArgumentException();
      } 

      gcd = GCD(n, d);      
      n = n / gcd;
      d = d / gcd;
      
      if(d < 0)
      {
         n *= -1;
         d *= -1;
      }      
   }
   
   public Fraction()
   {
      n = 0;
      d = 1;
   }
   
   public Fraction(int numerator)
   {
      n = numerator;
      d = 1;
   }
   
  private int GCD(int a, int b)
  {
     if (b == 0) return a;
     
     return GCD(b, a % b);
  }
   
   public int getNumerator()
   {
      return n;
   }
   
   public int getDenominator()
   {
      return d;
   }
   
  public boolean equals(Fraction other)
   {
      if(this.getNumerator() != other.getNumerator() || this.getDenominator()
    	 != other.getDenominator())
      {
         return false;
      }
      else
      {
         return true;
      }
   }
   
   public Fraction add(Fraction other)
   {
	  int newN, newD;
     	  
	  if(this.getDenominator() != other.getDenominator())
	  {
        newD = this.getDenominator() * other.getDenominator();
       
		  newN = this.getNumerator() * other.getDenominator()
               + other.getNumerator() * this.getDenominator();
		 		  
		  return new Fraction(newN, newD);
	  }
	  else
	  {
        newN = this.getNumerator() + other.getNumerator();
        newD = this.getDenominator();
        
		  return new Fraction(newN, newD);
	  }      
   }
   
   public Fraction div(Fraction other)
   {
	  int newN;
	  int newD;
          
	  
     newN = this.getNumerator() * other.getDenominator();
	  newD = this.getDenominator() * other.getNumerator();
     
     if(newN <= 0 && newD <= 0)
     {
        newN *= -1;
        newD *= -1;
     }
     else if(newD < 0)
     {
        newD *= -1;
        newN *= -1;
     }
     else if(newD == 0 && newN == 0)
     {
        newN = 0;
        newD = 1;
     }     
      	 	  
     return new Fraction(newN, newD);
   }
   
   public Fraction mul(Fraction other)
   {
      int newN = this.n * other.n;
      int newD = this.d * other.d;
      
      return new Fraction( newN, newD);
   }
   
   public Fraction sub(Fraction other)
   {
	   int newD, newN;
		  
	   if(this.getDenominator() != other.getDenominator())
	   {
		   newD = this.getDenominator() * other.getDenominator();
		   newN = this.getNumerator() * other.getDenominator() - 
                other.getNumerator() * this.getDenominator();
		   
         return new Fraction(newN, newD );
	   }
	   else
	   {
          newN = this.getNumerator() - other.getNumerator();
          newD = this.getDenominator();
          
	       return new Fraction(newN, newD);
	   }      
   }
   
   public java.lang.String toString()
   {
      if(d != 1)
      {
	      return n + "/" + d; 
      }
      else
      {
         return "" + n;
      }
   }
   
   public double value()
   {
      return (double)n/d;
   }
}