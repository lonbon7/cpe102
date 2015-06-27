/**
 * This class implements the methods of BasicArray.
 * @author Lonnie Bissmeyer
 * @version Program 2
 *
 */
import java.util.Arrays;
import java.util.NoSuchElementException;

public class BasicArrayList implements BasicList<Object>
{
	public static final int DEFAULT_CAPACITY = 10;
	
	private Object[] list;
	private int size;
	
	public BasicArrayList()
	{
		list = new Object[DEFAULT_CAPACITY];
		size = 0;
	}
	
	public BasicArrayList(int capacity)
	{
		list = new Object[capacity];
		size = 0;
	}
	
	public void add(Object object)
	{	
		if(size == list.length)
		{
			Object[] o = new Object[2 * size];
			System.arraycopy(list, 0, o, 0, list.length);
			list = o;
		}
		
		list[size] = object;
		size++;				
	}
	
	public void add(int index, Object object)
	{
		int i;
		
		if(index < 0 || index > size)
		{
			throw new IndexOutOfBoundsException();
		}				
		
		if(size == list.length)
		{
			Object[] o = new Object[2 * size];
			System.arraycopy(list, 0, o, 0, list.length);
			list = o;
		}
				
		for(i = size; i > index; i--)
		{
			list[i] = list[i -1];
		}
		
		list[index] = object;
		size++;
				
		
	}
	
	public void clear()
	{
		list = new Object[DEFAULT_CAPACITY];
		size = 0;
	}
	
	public boolean contains(Object object)
	{
		int i;
		
		for(i = 0; i < size; i++)
		{
			if(list[i].equals(object))
			{
				return true;
			}
		}
				
		return false;
	}
	
	public Object get(int index)
	{
		if(index < 0 || index >= size)
		{
			throw new IndexOutOfBoundsException();
		}
		
		Object object = new Object();
		object = list[index];
		
		return object;		
	}
	
	public int indexOf(Object object)
	{
		int i;
		
		for(i = 0; i < size; i++)
		{
			if(object.equals(list[i]))
			{
				return i;
			}					
		}
		
		throw new NoSuchElementException();		
	}
	
	public Object set(int index, Object object)
	{
		if(index < 0 || index >= size)
		{
			throw new IndexOutOfBoundsException();
		}
		
		Object o = new Object();
		o = list[index];
		list[index] = object;
		
		return o;		
	}
	
	public int size()
	{
		return size;
	}
	
	public Object remove(int index)
	{
		int i;
		
		Object object;
		
		if(index < 0 || index >= size)
		{
			throw new IndexOutOfBoundsException();
		}
		
		object = list[index];
		
		for(i = index; i < size; i++)
		{			
			list[i] = list[i + 1];
		}
		
		size--;
		
		return object;
	}
	
	public void trimToSize()
	{
		Object object[] = new Object[size];
		
		if(list.length > size)
		{
			if(size < DEFAULT_CAPACITY)
			{
				object = Arrays.copyOf(list, DEFAULT_CAPACITY);
			}
			else
			{
				object = Arrays.copyOf(list, size);
			}
		}
		
		list = object;
	}
	
	public int capacity()
	{
		return list.length;
	}
	
	public Object[] unusualMethodForTestDriverOnly()
	{
		return list;
	}
}
