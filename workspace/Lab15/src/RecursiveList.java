/** 
 * A recursive singly linked list.
 *
 * @author Kurt Mammen

 * Objectives:
 *
 *   1) Exposure to recursion.
 *   2) Exposure to structural recursion.
 *
 * @version 11/21/2012 - Updated some comments to more accurately reflect the
 *                       assignment. 
 * @version 05/26/2011 - Modified into a lab (from program assignment).
 */

/* The RecursiveList class is complete and correct!
 * 
 * DO NOT:
 *    1) Add or remove instance variables of the RecursiveList class.
 *    2) Change the methods of the RecursiveList class.
 *    3) Use any loops - all iteration to be done recursively!
 * 
 * DO:
 *    1) Read and understand the private EmptyNode class.
 *    2) Read and understand the completed methods in the private ListNode
 *       class.
 *    3) Implement the incomplete methods in the private ListNode class
 *       RECURSIVELY and in a similar manner to the provided methods.
 */
public class RecursiveList<E>
{
   private Node<E> head = new EmptyNode<E>();
   private Throwable stackTrace;

   /** Used to determine if the list is empty or not.
    * @return true if empty, otherwise false
    */
   public boolean isEmpty()
   {
      return head.isEmpty();
   }
   
   /** Used to access the number of elements in the list - O(N) operation.
    * @return The number of elements in the list.
    */
   public int size()
   {
      return head.size();
   }
   
   /** Adds the specified element to the end of the list - O(N) operation.
    * @param element The element to add to the list.
    */
   public void add(E element)
   {
      head = head.add(element);
   }

   /** Used to access the specified element of the list.
    * @param index The zero-based index of the desired element.
    * @throws IndexOutOfBoundsException if the index is not valid.
    * @return The requested element
    */
   public E get(int index)
   {
      return head.get(index);
   }
   
   /** Used to obtain the zero-based index of the first element that is equal
    * to the specified element using its equals(Object) method.
    * @param element The element to search for in the list.
    * @throws java.util.NoSuchElementException() if there is not element in
    * the list that is equal to the specified element.
    * @return The zero-based index of the first element equal to the
    * specified element using its equals(Object) method.
    */
   public int indexOf(E element)
   {
      return head.indexOf(element);
   }

   /** Used to modify the element at the specified index.
    * @param index The zero-based index of the element to modify.
    * @param element The new element
    * @throws IndexOutOfBoundsException if the index is not valid.
    * @return The old element at the specified index.
    */
   public E set (int index, E element)
   {
      return head.set(index, element);
   }
   
   /** Using the list element's equals method this method determines if two
    * lists have the same items in the same order - NOTE: You must return
    * false at the earliest (least amount of work) opportunity!
    *
    * @param other The other list to check for equality with this list.
    * @return true if the lists contain the same objects (logical equality)
    * in the same order, otherwise false.
    */
   @SuppressWarnings("rawtypes")
   public boolean equals(Object other)
   {
      if (other == null )
      {
         return false;
      }

      if (getClass() != other.getClass())
      {
         return false;
      }

      return head.equals(((RecursiveList)other).head);
   }
   
   /** Adds the specified element to list in the specified location.
    * The element at that position, if any, is not overwritten.  This method
    * may be used to add elements to the end of the list by specifying an index
    * equal to the list's current size.
    * @param index The zero-based index of the position to add the element.
    * @param element The element to add to the list.
    * @throws IndexOutOfBoundsException if the index is not valid.
    */
   public void add(int index, E element)
   {
      head = head.add(index, element);
   }

   /** Used to remove the element at the specified postion in the list.
    * @param index The zero-based index of the element to remove from the list.
    * @throws IndexOutOfBoundsException if the index is not valid.
    */   
   public void remove (int index)
   {
      head = head.remove(index);
   }
   
   /** Used retrieve a stack trace of the previous method call which is used to
    * verify the correct recursive behavior of the implementation.
    * @return A reference to the Throwable object constructed as the first line
    * OF ALL ListNode and EmptyNode methods.
    */
   public Throwable getStackTrace()
   {
      return stackTrace;
   }
   
   /* A private inner interface that you will be implementing in two
    * private inner classes.
    *
    * Do not modify this interface in any way!
    */
   private interface Node<E>
   {
      // Fundamental and/or easier methods - some/all demonstrated in class...
      boolean isEmpty();
      int size();
      Node<E> add(E element);
      E get(int index);

      // Easier methods... 
      int indexOf(E element);
      E set (int index, E element);

      // More challenging methods...
      boolean equals(Object other);
      Node<E> add(int index, E element);
      Node<E> remove (int index);
   }
   
   /* Provided - no changes necessary or expected!
    * 
    *   - With no instance variables
    *   - With no explicit constructors.
    *   - Only the methods of the Node<E> interface.
    *   - Remember to initialization stackTrace as the first as the first line
    *     each method so the test driver can verify your implementation!
    */
   @SuppressWarnings("hiding")
   private class EmptyNode<E> implements Node<E>
   {
      public boolean isEmpty()
      {
         stackTrace = new Throwable();
         return true;
      }
      
      public int size()
      {
         stackTrace = new Throwable();
         return 0;
      }

      public Node<E> add(E element)
      {
         stackTrace = new Throwable();

         ListNode<E> n = new ListNode<E>();
         n.element = element;
         n.next = this;
         
         return n;
      }
      
      public E get(int index)
      {
         stackTrace = new Throwable();
         throw new IndexOutOfBoundsException();
      }
      
      public E set(int index, E element)
      {
         stackTrace = new Throwable();
         throw new IndexOutOfBoundsException();
      }
      
      public int indexOf(E element)
      {
         stackTrace = new Throwable();
         throw new java.util.NoSuchElementException();
      }
      
      public boolean equals(Object node)
      {
         stackTrace = new Throwable();
         return node instanceof EmptyNode;
      }
      
      public Node<E> add(int index, E element)
      {
         stackTrace = new Throwable();
         
         if (index != 0)
         {
            throw new IndexOutOfBoundsException();
         }
         
         return add(element);
      }
            
      public Node<E> remove (int index)
      {
         stackTrace = new Throwable();
         throw new IndexOutOfBoundsException();
      }
   } // End of EmptyNode inner class
   
   /* TODO: Implement this class as follows:
    *  
    *   - With only the instance variables already specified.
    *   - With no explicit constructors.
    *   - Only the methods of the Node<E> interface.
    *   - Remember to initialization stackTrace as the first as the first line
    *     each method so the test driver can verify your implementation!
    */ 
   @SuppressWarnings("hiding")
   private class ListNode<E> implements Node<E>
   {
      public E element;
      public Node<E> next;
      
      public boolean isEmpty()
      {
         stackTrace = new Throwable();
         return false;
      }
      
      public int size()
      {
         stackTrace = new Throwable();
         
         return 1 + next.size();
      }
      
      public Node<E> add(E element)
      {
         stackTrace = new Throwable();
         next = next.add(element);
         return this;
      }
      
      public E get(int index)
      {
         stackTrace = new Throwable();

         if (index == 0)
         {
            return element;
         }

         return next.get(index - 1);
      }

      public int indexOf(E element)
      {
         stackTrace = new Throwable();         
         
         if(this.element.equals(element))
         {
            return 0;
         }      
         
         return 1 + next.indexOf(element);
      }
      
      public E set (int index, E element)
      {
         stackTrace = new Throwable();
         
         if(index == 0)
         {
            E tempElement = this.element;
            this.element = element;
            return tempElement;           
         }
         
         return next.set(index - 1, element);
      }
      
      @SuppressWarnings("unchecked")
      public boolean equals(Object node)
      {
         stackTrace = new Throwable();       
               
         return node instanceof ListNode && this.element.equals(((ListNode<E>)node).element)
               && this.next.equals(((ListNode<E>)node).next);                           
      }

      public Node<E> add(int index, E element)
      {
         stackTrace = new Throwable();
         
         if(index == 0)
         {
            ListNode<E> n = new ListNode<E>();
            n.element = element;
            n.next = this;            
            
            return n;
         }         
         
         this.next = this.next.add(index - 1, element);
         
         return this;
      }
      
      public Node<E> remove(int index)
      {
         stackTrace = new Throwable();
         
         // "this" is the one we're looking for
         if(index == 0)
         {
            return this.next;
         }
         
         // "this" isn't the one we're looking for,
         // BUT "this" is the end of the list
         if(this.next instanceof EmptyNode)
         {
            throw new IndexOutOfBoundsException();
         }
         
         // "this" isn't the one we're looking for,
         // "this" isn't the end of the list,
         // so recurse
         this.next = this.next.remove(index - 1);
         
         return this;
      }
   } // End of ListNode inner class
} // End of RecursiveList class
