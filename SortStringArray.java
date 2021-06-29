//PROGRAM TO SORT STRING ARRAY//

package ultracode;
import java.util.Arrays;

public class SortStringArray {

	public static void main(String[] args) {

		String[] my_array = {
	            "Praveen",
				
	            "Shiva",
	            "Rajesh",
	            "Dinki",
	            "Pranay",
	            "Siridi",
	            "Yaswanth",
	            "Mom",
	            "Dad"
	        }; 
		System.out.println("Original string array : "+Arrays.toString(my_array));
	    Arrays.sort(my_array);
	    System.out.println("Sorted string array : "+Arrays.toString(my_array));
		
	}

}
