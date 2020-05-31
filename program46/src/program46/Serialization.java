//Serialization
package program46;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String [] args) {
	      Employee e = new Employee();
	      e.name = "Kamesh";
	      e.address = "Vijayawada";
	      e.number = 101;
	      
	      try {
	         FileOutputStream fileOut =
	         new FileOutputStream("D:\\Test.txt");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in D:\\Test.txt");
	      } 
	      catch (IOException i)
	      {
	         i.printStackTrace();
	      }
	   }
}
