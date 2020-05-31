import java.util.Scanner;

public class Pgm7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//output the promt
		System.out.println("enter an integer");
		
		//Wait for the user to enter some thing
		int value = input.nextInt();
		
		//Tell them what they have entered
		System.out.println("You entered :" + value);
	}

}
