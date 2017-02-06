package ku.util;

import java.util.Scanner;
/**
 * The test method of array iterator.
 * @author pranger54
 * @version 1.0
 */

public class main {
    /**
     * Testing the array iterator with the array of string.
     * @param The string that receive the list of array to check it.
     */
	
	public static void main(String[] args){
		String [] array = { "apple", "banana", null, "carrot" };
		ArrayIterator<String> iter = new ArrayIterator( array );
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.hasNext());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		
	}
}
