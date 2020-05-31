import java.util.Scanner;
public class Arrapra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	int i;
			int[] marks=new int[4];
					{
			 marks[0] = 10;
			 marks[1] = 20;
			 marks[2] = 30;
			 marks[3] = 40;


					//Multi dimensional array 
					int[][] grid= {{1,2,3} , {4,5,6} , {7,8,9}};
					System.out.println(grid [2][1]);
					
					//Arrays using for loop
					int[] scores=new int[6];
					{
					System.out.println("Please enter scores");
					for(i=0;i<6;i++)
					{
						scores[i]=sc.nextInt();
						System.out.println("You have entered" +scores[i]);
						System.out.println(scores[4]);
					}
					}
					String[] flowers= {"rose","jasmine","lilly","lotus"};
					System.out.println("I like the flower" +flowers[1]);
					
					//System.out.println(nubers[3]);
					
					System.out.println(marks[2]);
			}
	}
}

