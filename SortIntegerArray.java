package ultracode;
import java.util.Arrays;  
public class SortIntegerArray {
  
	public static void main(String[] args)   
	{	//Using SORT method
		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
		Arrays.sort(array);   
		System.out.println("Elements of array sorted in ascending order: "); 
		for (int i = 0; i < array.length; i++)   
		{       
			System.out.println(array[i]);   
		}   
	}  
}  
/*WITHOUT USING SORT METHOD
 int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};  
 System.out.println("Array elements after sorting:");    
for (int i = 0; i < arr.length; i++)   
{  
for (int j = i + 1; j < arr.length; j++)   
{  
int tmp = 0;  
if (arr[i] > arr[j])   
{  
tmp = arr[i];  
arr[i] = arr[j];  
arr[j] = tmp;  
}  
}   
System.out.println(arr[i]);  
}  
}  
}  */	
