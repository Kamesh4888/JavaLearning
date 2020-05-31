import java.util.Scanner;

public class Whi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
  /*int a = sc.nextInt();
		while (a%2==0 && a<10)
		 { System.out.println(+a +"is even in while condition");
		 a=a+2;}
		int i = 10;
		 
		do {
			System.out.println(i);
			i=i-2;
		}while(i%2==0 && i>1);*/
		
	int days = sc.nextInt();
	
	switch (days) {
	case 1:System.out.println(" sunday ");
	break;
	case 2:System.out.println(" monday ");
	break;
	case 3:System.out.println(" tuesday ");
	break;
	case 4:System.out.println(" wednesday ");
	break;
	case 5:System.out.println(" thursday ");
	break;
	case 6:System.out.println(" friday ");
	break;
	case 7:System.out.println(" saturday ");
	break;
	default:System.out.println("Not there");
	
	
	
	}
		
	}

}
