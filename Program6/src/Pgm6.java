
public class Pgm6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myInt = 200;
		int myValue = 20;
		int myNbr = 10;
		int loop = 0;
		
		if(myInt < 100) {
			System.out.println("Yes it is true");
		}
		else
		{ System.out.println("No it is false"); 
		}
		
		
		if(myValue < 10) {
			System.out.println("Yes it is true");
		}
		else if(myValue > 10)
		{ System.out.println("No it is false"); 
		}
			
		if(myNbr < 5) {
			System.out.println("Yes it is true");
		}
		else if(myNbr ==5) 
		{ System.out.println("No it is false"); 
		}
		
		else {
			System.out.println("None of the abo");
		}
		
		while(true) {
			System.out.println("looping " + loop);
			if(loop==5) {
				break;
			}
			loop++;
			System.out.println("running");
			}
		}
}

