//PROGRAM TO PRINT LARGEST OF THREE NUMBERS//

package ultracode;

public class Largestof3numbers {

	public static void main(String[] args) {
		
		 int num1 = 36, num2 = 35, num3 = 56;
	      if(num1 >= num2) 
	      {
	         if(num1 >= num3)
	         {
	            System.out.println(num1 + " is largest number.");
	         }
	         else
	         {
	            System.out.println(num3 + " is largest number.");
	         }
	      } 
	      else 
	      {
	         if(num2 >= num3)
	         {
	            System.out.println(num2 + " is largest number.");
	         }
	         else
	         {
	            System.out.println(num3 + " is largest number.");
	         }
	      }
	   }
	}
