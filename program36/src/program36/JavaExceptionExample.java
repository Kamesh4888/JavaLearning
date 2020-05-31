//ExceptionHandling
package program36;

import java.util.Scanner;

public class JavaExceptionExample {

	/*public static void main(String args[]){  
		   try{  
		      //code that may raise exception  
		      int data=100/0;  
		   }
		   catch(ArithmeticException e)
		   {
			   System.out.println(e);}  
		   //rest code of the program   
		   System.out.println("rest of the code...");  
		  }  */
	//Alternate code
	
	public static void main(String[] args) {
	int a, b, result;
	 
	  Scanner input = new Scanner(System.in);
	  System.out.println("Input two integers");
	 
	  a = input.nextInt();
	  b = input.nextInt();
	 
	  // try block
	 
	  try 
	  {
	    result  = a / b;
	    System.out.println("Result = " + result);
	  }
	 
	  // catch block
	 
	  catch (ArithmeticException e) {
	    System.out.println("Exception caught: Division by zero.");
	  }
}
}