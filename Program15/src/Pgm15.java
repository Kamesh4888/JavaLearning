//import java.util.Scanner;

///////METHODS//////
class Student
{ 
	String name;
	int age;
	char grade;
	
	void favSubj() 
	{
		System.out.println("Maths");
		
    }

	int addition()
	{
		int sum=35+78;
		return sum;
	}
}

public class Pgm15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			//Scanner sc=new Scanner(System.in);
			
			
				Student stu1=new Student();
				stu1.name="Kamesh";
				stu1.age=27;
				stu1.grade='A';
				stu1.favSubj();
			   int add=stu1.addition();
				System.out.println(add);
			
				
				Student stu2=new Student();
				stu2.name="Lakshmi";
				stu2.age=23;
				stu2.grade='C';
				System.out.println(stu1.name + " is a good boy");
				System.out.println(stu1.name + " has a grade of " +stu1.grade +" having age " +stu1.age);
			
				
				
			}

		}


	}


