import java.util.Scanner;
public class ifLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
  int a = sc.nextInt();
  String c = "2";
  String d = "2";
  
  if (c==d)
  {
	  System.out.println("kamesh");
  }
  else
  {
	  System.out.println("lakshmi");
  }
  /*if (a%2==0)
  {
	  System.out.println(+a +"is even");
	  	  
  }
 /* else
  { System.out.println(+a +"is odd")
;	}

  //int b = 2020;
  if (year%4==0)
  {
	  System.out.println (+year +"is a leap  year");
  }
  else
  { System.out.println(+year +"is not a leap year");
  
	  
  }*/
  while (a%2==0 && a<10)
{ System.out.println(+a +"is even in while condition");
a=a+2;
}
}
}
