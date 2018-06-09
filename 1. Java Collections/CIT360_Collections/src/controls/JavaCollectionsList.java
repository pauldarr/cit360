package controls;

import java.util.*;

public class JavaCollectionsList {
	
	public static void main (String[] args) {
		
		//Creates string variable and assings values to list.
		String[] array1 = {"item1", "item2", "item3", "item4", "item5", "item6", "item7"};
		ArrayList<String> list1 = new ArrayList<String>();		
		for (String x: array1)
			list1.add(x);
		
		//Creates string variable and assings values to list.		
		String[] array2 = {"item2", "item3", "item6"};
		ArrayList<String> list2 = new ArrayList<String>();		
		for (String x: array2)
			list2.add(x);
		
		//Prints values of both lists
		System.out.printf("Uses ArrayList interface for full list 1, and list 2.");
		System.out.printf("%n List1: ");
		for(int i = 0; i < list1.size(); i++) {
			System.out.printf("%s ", list1.get(i));
		}	
		
		System.out.printf("%n List2: ");		
		for(int i = 0; i < list2.size(); i++) {
			System.out.printf("%s ", list2.get(i));
		}	
		
		//Calls editlist function to deduplicate values.
		editList(list1, list2);
		ArrayList<String> list3 = list1;
		System.out.println();
		
		//Prints desuplicated list. 
		System.out.printf("%nDeduplicated ArrayList 1, and 2, to create a new list.");
		System.out.printf("%n List3: ");
		for(int i = 0; i < list3.size(); i++) {
			System.out.printf("%s ", list3.get(i));
		}
				
		//Creates string variable and assigns values to LinkedList
		String[] array3 = {"item6", "item3", "item2"};
		LinkedList<String> ll = new LinkedList<String>();		
		for (String x: array3)
			ll.add(x);
		
		//Prints LinkedList values
		System.out.printf("%n%nUses LinkedList interface");
		System.out.printf("%n List: ");
		for(int i = 0; i < ll.size(); i++) {
			System.out.printf("%s ", ll.get(i));
		}	
		
	}	
	
	//this functiosn deduplicates list entries.
	public static void editList (Collection<String> l1, Collection<String> l2) {
		Iterator<String> it = l1.iterator();
		while (it.hasNext()) {
			if(l2.contains(it.next()))
				it.remove();			
		}
		
	}

}