import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		
		if (len1 >len2) {
		return 1;} else if (len1<len2) {
			return -1;}
		return 0;
		}
	}
	
class AlphabeticalComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2);
		
	}		
	}	


public class compare {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		
		name.add("Tariq");
		name.add("Farith");
		name.add("Arshath");
		name.add("Rashhith");
		name.add("Rafi");
		
		for (String str: name) {
		System.out.println(str);}
		System.out.println();
		
		//Collections.sort(name, new StringLengthComparator());
		
		Collections.sort(name, new AlphabeticalComparator());
		
		for (String str: name) {
			System.out.println(str);}
		
	List<Integer> number = new ArrayList<Integer>();
		
		number.add(34);
		number.add(235);
		number.add(14);
		number.add(5456);
		number.add(67);
		
		
		for(Integer num : number) {
		System.out.println(num);
		}
		System.out.println();
		//Collections.sort(number);
		
		Collections.sort(number, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return -o1.compareTo(o2);
			}
			
			
		});
		for(Integer num : number) {
			System.out.println(num);
			}
	}

}
