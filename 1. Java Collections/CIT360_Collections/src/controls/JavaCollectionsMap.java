package controls;

import java.util.*;

public class JavaCollectionsMap {
	
	public static void main(String[] args) {
		
		//Creates new object and assigns it to  a variable.
		HashMap<String, String> hm = new HashMap<>();
		//Inserts values.
		hm.put("Category2","Value1");
		hm.put("Category2","Value2");
		hm.put("Category1","Value3");
		hm.put("Category3","Value4");
		hm.put("Category2","Value7");
		
		//Uses HashMap interface for deduplication of categories.  Does not Sort
		System.out.printf("Uses HashMap interface for deduplication of categories.  Does not Sort%n");
		Set<String> hmKeys = hm.keySet();
		for (String key : hmKeys) {
			System.out.println(key + " = " + hm.get(key));
		}
		
		//Creates new object and assigns it to  a variable.
		TreeMap<String, String> tm = new TreeMap<>();
		//Inserts values.
		tm.put("Category2","Value1");
		tm.put("Category2","Value2");
		tm.put("Category1","Value3");
		tm.put("Category3","Value4");
		tm.put("Category2","Value7");
		
		//Uses TreeMap interface for sorting and deduplication of categories.
		System.out.printf("%nUses TreeMap interface for sorting and deduplication of categories.%n");
		Set<String> tmKeys = tm.keySet();
		for (String key : tmKeys) {
			System.out.println(key+ " = " + tm.get(key));
		}
		
		//Creates new object and assigns it to  a variable.
		Hashtable<String, String> ht = new Hashtable<>();
		//Inserts values.
		ht.put("Category2","Value1");
		ht.put("Category2","Value2");
		ht.put("Category1","Value3");
		ht.put("Category3","Value4");
		ht.put("Category2","Value7");
		
		//Uses HashTable interface for deduplication of categories.  Does not Sort
		System.out.printf("%nUses HashTable interface for deduplication of categories.  Does not Sort%n");
		Set<String> keys2 = ht.keySet();
		for (String key : keys2) {
			System.out.println(key + " = " + ht.get(key));
		}
		
	}

}