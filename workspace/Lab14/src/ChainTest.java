import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class ChainTest
{
   public static void main(String[] args) throws FileNotFoundException
   {
      System.out.println("Testing OrderFirst. Check firstOut.txt for results.");
      ArrayList<Person> list = Person.readFile("C:\\Users\\Lonnie Bissmeyer\\school\\cpe102\\workspace\\Lab14\\bin\\randomPeople.txt");
      Comparator<Person> c = new OrderFirst();
      Collections.sort(list, c);      
      Person.writeFile("firstOut.txt", list);
      
      System.out.println("Testing OrderLast. Check lastOut.txt for results.");
      ArrayList<Person> list2 = Person.readFile("C:\\Users\\Lonnie Bissmeyer\\school\\cpe102\\workspace\\Lab14\\bin\\randomPeople.txt");
      Comparator<Person> c2 = new OrderLast();
      Collections.sort(list2, c2);      
      Person.writeFile("lastOut.txt", list2);
      
      System.out.println("Testing OrderState. Check stateOut.txt for results.");
      ArrayList<Person> list3 = Person.readFile("C:\\Users\\Lonnie Bissmeyer\\school\\cpe102\\workspace\\Lab14\\bin\\randomPeople.txt");
      Comparator<Person> c3 = new OrderState();
      Collections.sort(list3, c3);      
      Person.writeFile("stateOut.txt", list3);
      
      System.out.println("Testing OrderAge. Check ageOut.txt for results.");
      ArrayList<Person> list4 = Person.readFile("C:\\Users\\Lonnie Bissmeyer\\school\\cpe102\\workspace\\Lab14\\bin\\randomPeople.txt");
      Comparator<Person> c4 = new OrderAge();
      Collections.sort(list4, c4);      
      Person.writeFile("ageOut.txt", list4);
      
      System.out.println("Testing OrderFirst and OrderLast. Check firstLastOut.txt for results.");
      ArrayList<Person> list5 = Person.readFile("C:\\Users\\Lonnie Bissmeyer\\school\\cpe102\\workspace\\Lab14\\bin\\randomPeople.txt");
      Comparator<Person> c5 = new OrderLast();
      Comparator<Person> c6 = new OrderFirst(c5);
      Collections.sort(list5, c6);
      Person.writeFile("firstLastOut.txt", list5);
      
      System.out.println("Testing OrderLast and OrderState. Check lastStateOut.txt for results.");
      ArrayList<Person> list6 = Person.readFile("C:\\Users\\Lonnie Bissmeyer\\school\\cpe102\\workspace\\Lab14\\bin\\randomPeople.txt");
      Comparator<Person> c7 = new OrderState();
      Comparator<Person> c8 = new OrderLast(c7);
      Collections.sort(list6, c8);
      Person.writeFile("lastStateOut.txt", list6);
      
      System.out.println("Testing OrderState and OrderAge. Check stateAgeOut.txt for results.");
      ArrayList<Person> list7 = Person.readFile("C:\\Users\\Lonnie Bissmeyer\\school\\cpe102\\workspace\\Lab14\\bin\\randomPeople.txt");
      Comparator<Person> c9 = new OrderAge();
      Comparator<Person> c10 = new OrderState(c9);
      Collections.sort(list7, c10);
      Person.writeFile("stateAgeOut.txt", list7);
      
      System.out.println("Testing OrderFirst and OrderAge. Check firstAgeOut.txt for results.");
      ArrayList<Person> list8 = Person.readFile("C:\\Users\\Lonnie Bissmeyer\\school\\cpe102\\workspace\\Lab14\\bin\\randomPeople.txt");
      Comparator<Person> c11 = new OrderAge();
      Comparator<Person> c12 = new OrderFirst(c11);
      Collections.sort(list8, c12);
      Person.writeFile("firstAgeOut.txt", list8);
      
      System.out.println("Testing all four attributes. Check completeSort.txt for results.");
      ArrayList<Person> list9 = Person.readFile("C:\\Users\\Lonnie Bissmeyer\\school\\cpe102\\workspace\\Lab14\\bin\\randomPeople.txt");
      Comparator<Person> c13 = new OrderAge();
      Comparator<Person> c14 = new OrderState(c13);
      Comparator<Person> c15 = new OrderLast(c14);
      Comparator<Person> c16 = new OrderFirst(c15);
      Collections.sort(list9, c16);
      Person.writeFile("completeSort.txt", list9);      
   }
}
