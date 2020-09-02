package listtutorial;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arraylist_Linkedlist {

	public static void main(String[] args) {
		List<Integer> arraylist = new ArrayList<Integer>();
		List<Integer> linkedlist = new LinkedList<Integer>();

		doTimings("ArrayList", arraylist);
		doTimings("LinKedList", linkedlist);
	}

	public static void doTimings (String type, List<Integer> list) {
		
		for (int i=0; i<1E5; i++) {
			list.add(i);
			
		}
		
		long start = System.currentTimeMillis();
		
		for(int i=0; i<1E5; i++) {
			list.add(0, 2);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end-start+ " for " + type);
	}
}
