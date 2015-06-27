import java.util.ArrayList;


public class SearcherTest
{
   public static void main(String[] args)
   {
      int i;
      ArrayList<String> selection = new ArrayList<String>();
      ArrayList<String> binary = new ArrayList<String>();
      
      for(i = 0; i < selection.size(); i++)
      {
         System.out.println("Word is " + selection.get(i));
      }
      
      for(i = 0; i < binary.size(); i++)
      {
         System.out.println("Word is " + binary.get(i));
      }
   }
}
