
///////Getters and Return Values/////////////
class Person {
	 String name;
	 int age;
	 
	 void speak () {
		 
		 System.out.println("My name is :"  + name);
	 }

	 int calculateYearsToRetirement() {
		 int yearsLeft = 65- age;
		 
		System.out.println(yearsLeft);
		
		return yearsLeft;
}
	 
	 int getAge() {
		 return age;
	 }
	 
	 String getName() {
		 return name;
	 }
}
public class Pgm16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person();
		
		person1.name = "kamesh";
		person1.age  = 27;
		
		person1.speak();
		int years = person1.calculateYearsToRetirement();
		
		System.out.println("Years till retirements "  +  years);
		
		int age = person1.getAge();
		String name = person1.getName();
		
		System.out.println("Name is:" +name);
		System.out.println("Age is:" +age);
		
		
	}

}
