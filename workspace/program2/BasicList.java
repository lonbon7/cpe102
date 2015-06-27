/**
 * This interface is for the basic array list class.
 * @author Lonnie Bissmeyer
 * @version Program 2
 *
 */
public interface BasicList<E>
{
	void add(E element);
	void add(int index, E element);
	void clear();
	boolean contains(E element);
	E get(int index);
	int indexOf(E element);
	E remove(int index);
	E set(int index, E element);
	int size();	
}