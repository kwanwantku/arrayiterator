package ku.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Iterated over the method of any objects to check the list of element.
 * @author pranger54
 * @version 1.0
 * @param <T> The any object to iterator the array.
 */
public class ArrayIterator<T> implements Iterator<T> {
	
	/** attribute for the array we want to iterate over */
    private T[ ] array;
    /** attribute for the current point in array */
    private int current;
       
    /**
     * Initialize a new array iterator with the array to process the array.
     * It's initialize the started current point at zero.
     * @param array is the array to iterate over them
     */
    
    public ArrayIterator(T[] array) {
        this.array = array;
        this.current = 0;
    }
 
	/** Check the next method if it can return element or not.
     *  @return If the next method have element to return. It's return true.
     * 		    If the next method haven't element to return more. It's return false.
     */
    
	@Override
	public boolean hasNext() {

		 for(int i =current;i<array.length;i++){   
			 
			    	if(array[i]!=null)
			    		return true;
			    	else
			    		continue;
		 }
			   
			   return false;
	}

	/**
     * Return the next non-null element from array, if any.
     * @return the next non-null element in the array.
     * @throws NoSuchElementException if there are no more elements
     *         to return.
     */

	@Override
	public T next() {
		
		if(hasNext()){

			for(int i =current;i<array.length;i++) {
				
				if(array[i]!=null) {
					return array[current++];
				}
				else {
					current++;
				}
			}
			
			return array[current];
		}
        
		else throw new NoSuchElementException();

		
	}


}
