import java.util.LinkedList;

public class Stack<E>
{
   private LinkedList<E> list = new LinkedList<E>();
   
   public void push(E element)
   {
      list.add(0, element);
   }
   
   public void pop(E element)
   {
      list.remove(0);
   } 
}
   
   
