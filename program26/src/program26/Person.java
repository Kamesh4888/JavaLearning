package program26;

public class Person implements Info{
public void greet() {
	System.out.println("Hi nice to meet you");
}

@Override
public void showInfo() {
	// TODO Auto-generated method stub
	System.out.println("My name is Bob");
}
}
