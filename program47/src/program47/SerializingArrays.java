//Serializing arrays
package program47;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializingArrays {

	public static void main(String[] args) throws Exception
	{
	        ArrayList<String> namesList = new ArrayList<String>();
	         
	        namesList.add("Kamesh");
	        namesList.add("brian");
	        namesList.add("charles");
	 
	        try
	        {
	            FileOutputStream fos = new FileOutputStream("listData");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(namesList);
	            oos.close();
	            fos.close();
	        } 
	        catch (IOException ioe) 
	        {
	            ioe.printStackTrace();
	        }
	}
}
