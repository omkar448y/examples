package pro;

public class Reverse_Pyramid 
{
public static void main(String[] args) {

	        int rows = 5; // Number of rows in the pyramid          

	        for (int i = 0; i < rows; i++) {
	            // Print spaces before the asterisks
	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }

	            // Print asterisks in reverse order
	            for (int k = i; k < rows; k++) {
	                System.out.print("* ");
	            }

	            // Move to the next line
	            System.out.println();
	        }
	    test();

}
public static void test() 
{
int row=4;

for (int i=0; i<=row; i++) 
{for(int j=0; j<i; j++) 
   {
	System.out.println(" ");
   }
	for(int k=i; k<row; k++) 
	{
		System.out.print("* ");
		
	}
	System.out.println();

}



}
 
}
