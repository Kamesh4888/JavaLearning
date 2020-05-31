package program32;
import java.util.*;
//using generics
public class TestGenerics1 {
 
	public static void main(String args[]){  
	ArrayList<String> list=new ArrayList<String>();  
	list.add("rahul");  
	list.add("jai");  
	//list.add(32);//compile time error  
	  
	String s=list.get(1);//type casting is not required  
	System.out.println("element is: "+s);  
	  
	Iterator<String> itr=list.iterator();  
	while(itr.hasNext())
	{  
	System.out.println(itr.next());  
	}
	
	
	//Generics using maps
	Map<Integer,String> map=new HashMap<Integer,String>();  
	map.put(1,"vijay");  
	map.put(4,"umesh");  
	map.put(2,"ankit");  
	  
	//Now use Map.Entry for Set and Iterator  
	Set<Map.Entry<Integer,String>> set=map.entrySet();  
	  
	Iterator<Map.Entry<Integer,String>> abc=set.iterator();  
	while(abc.hasNext())
	{  
	Map.Entry e=abc.next();//no need to typecast  
	System.out.println(e.getKey()+" "+e.getValue()); 
	
	}  
	}
}

