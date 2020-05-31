package program42;

public class EqualsClass {
	public static void main(String args[]){  
		String s1="Kamesh";  
		String s2="KAMESH";  
		String s3="Kamesh";  
		String s4="Lakshmi";  
		System.out.println(s1.equals(s2));//true because content and case is same  
		System.out.println(s1.equals(s3));//false because case is not same  
		System.out.println(s1.equals(s4));//false because content is not same  
		}
	}  

