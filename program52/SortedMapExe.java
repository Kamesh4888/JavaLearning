//SortedMap

package program52;

import java.time.LocalDate;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap<String, PersonalDetails> personMap = new TreeMap<>();
		personMap.put("Dan Brown", new PersonalDetails("Writer", LocalDate.of(1964, 6, 22), "New Hampshire"));
		personMap.put("Ayn Rand", new PersonalDetails("Writer", LocalDate.of(1905, 2, 2), "Saint Petersburg"));
		personMap.put("Devdutt Pattanaik", new PersonalDetails("Mythologist", LocalDate.of(1970, 12, 11), "Mumbai"));

		personMap.keySet().forEach(key -> {
			System.out.println(key + " -> " + personMap.get(key));
		});


	}

}
