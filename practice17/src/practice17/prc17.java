package practice17;
import java.util.Scanner;

class Student
{ 
	
	String name;
	int age;
	char grade;
}


public class prc17 {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1=new Student();
		stu1.name="Kamesh";
		stu1.age=27;
		stu1.grade='A';
		
		Student stu2=new Student();
		stu2.name="Lakshmi";
		stu2.age=23;
		stu2.grade='C';
		System.out.println(stu1.name + "is a good boy");
		System.out.println(stu1.name + "has a grade of" +stu1.grade +"having age" +stu1.age);

		
		
	}

}
