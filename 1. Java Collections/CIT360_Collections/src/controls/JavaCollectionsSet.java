package controls;

import java.util.*;

public class JavaCollectionsSet {
	
	public static void main (String[] args) {
		
		//Uses TreeSet interface for sorting and deduplication
		System.out.printf("Uses TreeSet interface for sorting and deduplication.");
		//Creates new TreeSet object and assigns it to set1 variable
		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("item3");
		set1.add("item2");
		set1.add("item5");
		set1.add("item1");
		set1.add("item3");
		set1.add("item6");
		set1.add("item4");
		set1.add("item3");
		set1.add("item5");
		
		//runs through each entry in set1 variable and prints it out.
		Iterator<String> it1 = set1.iterator();
		//Will continue to run until variable no longer has any values.
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		//Uses HashSet interface for deduplication.  Does not sort.
		System.out.printf("%nUses HashSet interface for deduplication.  Does not sort.");
		HashSet<String> set2 = new HashSet<String>();
		set2.add("item3");
		set2.add("item2");
		set2.add("item5");
		set2.add("item1");
		set2.add("item3");
		set2.add("item6");
		set2.add("item4");
		set2.add("item3");
		set2.add("item5");
		
		//runs through each entry in set2 variable and prints it out.
		Iterator<String> it2 = set2.iterator();
		//Will continue to run until variable no longer has any values.
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
						
	}		
	
}