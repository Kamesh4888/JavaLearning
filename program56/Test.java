package program56;

import java.util.Arrays; 
import java.util.Comparator; 
import java.util.List; 
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values 
        = Arrays.asList(212, 324, 
                        435, 566, 
                        133, 100, 121); 

    // naturalOrder is a static method 
    values.sort(Comparator.naturalOrder()); 

    // print sorted number based on natural order 
    System.out.println(values); 
    

    
    List<String> stringList 
        = Arrays.asList("Aman", "Kajal", 
                        "Joyita", "Das"); 

    System.out.println("Before sorting:"); 
    stringList.forEach(System.out::println); 

    stringList.sort(Comparator.naturalOrder()); 
    System.out.println("\nAfter sorting:"); 
    stringList.forEach(System.out::println); 


	}

}
