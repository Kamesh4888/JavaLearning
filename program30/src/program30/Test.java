//type casting
package program30;

public class Test {

	public static void main(String[] args) {
	
		      int i = 100;
		      long l = i; //no explicit type casting required
		      float f = l;  //no explicit type casting required
		      System.out.println("Int value "+i);
		      System.out.println("Long value "+l);
		      System.out.println("Float value "+f);
		//narrowing or explicit type conversion      
		      
		      double d = 100.04;
		      long lo = (long)d;  //explicit type casting required
		      int in = (int)l; //explicit type casting required

		      System.out.println("Double value "+d);
		      System.out.println("Long value "+lo);
		      System.out.println("Int value "+in);

	
//converting int and double to binary
		      byte b;  
		      int xy = 355;  
		      double dou = 423.150; 
		      b = (byte) i; 
		      System.out.println("Conversion of int to byte: i = " + xy + " b = " + b);  
		      System.out.println("*************************************************"); 
		      b = (byte) d;        
		      System.out.println("Conversion of double to byte: d = " + dou + " b= " + b);}
	}


