package program37;

public class Main2 
{
	public static void main(String[] args) throws ArithmeticException {
	
	 try {
	        int array[] = new int[10];
	        array[10] = 30 / 0;
	      } 
	    catch (Exception e) 
	    {
	        System.out.println(e.getMessage());
	      }

}
}