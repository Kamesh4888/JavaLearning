import java.util.Scanner;
public class Pgm9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
 System.out.println("Please enter a command");
 String name = input.nextLine();
 
 switch (name) {
 case "k":
	 System.out.println("Kamesh ");
	 break;
	 
 case "l":
	 System.out.println("lakshmi");
	 break;
	 
	 default:
	 System.out.println("command not recognized");
	 

 }
	}

}
