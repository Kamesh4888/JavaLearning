///Setters and This///
  
class Frog {

	private String name;
	private int age;
	
	public void setname(String name) {
		this.name = name;
	}
	public void setage(int age) {
		this.age  = age;
	}
	
	public String  getname() {
		return name;
		
	}
	public int getage () {
		return age;
	}
	
	public void setinfo(String name, int age) {
		setname(name);
		setage(age);
	}
}
public class Pgm18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frog frog1 = new Frog();
		frog1.setname("fooby");
		frog1.setage(1);
		
		System.out.println(frog1.getname());
	}

}
