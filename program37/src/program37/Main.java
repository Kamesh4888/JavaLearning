//Multiple exceptions
package program37;

public class Main {
	public static void main(String[] args) {
		
		//Multiple catch blocks
		
	    try 
	    {
	      int array[] = new int[10];
	      array[10] = 30 / 0;
	    } 
	    catch (ArithmeticException e)
	    {
	      System.out.println(e.getMessage());
	    } 
	    catch (ArrayIndexOutOfBoundsException e) 
	    {
	      System.out.println(e.getMessage());
	    } 
	    
	   
	  }

}
