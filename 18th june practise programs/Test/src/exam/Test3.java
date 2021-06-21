//Write a program to remove duplicates from an array in java

package exam;

import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Integer[] numbers = new Integer[] {1,1,3,4,5,2,3,5};
         
	        System.out.println( Arrays.toString(numbers) );
	         
	        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );
	        
	        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
	         
	        System.out.println( Arrays.toString(numbersWithoutDuplicates) );

	}

}
