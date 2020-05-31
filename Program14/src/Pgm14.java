
///////CLASSES AND OBJECTS////////

		class Person {
			
			String name;
			int age;
			void speak() {
				for(int i=0; i<3; i++) {
				System.out.println("My name is: " + name + " and I am " + age + "years old"); }
			}
		}
	
		
		public class Pgm14 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		Person person1 = new Person();
		person1.name = "Kamesh";
		person1.age  = 27;
		person1.speak();
		//person1.sayHello();
		
	Person person2 = new Person();
	person2.name  = "lakshmi";
	person2.age   =  23;
	person2.speak();
	//person2.sayHello();
	System.out.println(person1.name + "  age is :" + person1.age);
	System.out.println(person2.name +  " age is :" + person2.age);
	
	
			}
		}
