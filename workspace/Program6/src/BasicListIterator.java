/**
 * This an interface BasicLinkedList iterator.
 *
 * @author Lonnie Bissmeyer
 * @version Program 6
 */

import java.util.Iterator;

public interface BasicListIterator<E> extends Iterator<E>
{
   public void remove();
   public boolean hasNext();
   public E next();
   public boolean hasPrevious();
   public E previous();
}
