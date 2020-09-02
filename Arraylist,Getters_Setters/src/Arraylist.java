package BankAccount;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {		
	
		ArrayList<Animal> strings = new ArrayList<Animal>();
		
		strings.add(new Animal());
		strings.add(new Animal());
		strings.add(new Animal());
		
		
		showList(strings);
		
		ArrayList<Animal> strings1 = new ArrayList<Animal>();
		
		strings1.add(new lion());
		strings1.add(new lion());
		strings1.add(new lion());
		
		showList(strings1);
		
	}
	//wildcard shown below--
	public static void showList(ArrayList<?> strings) {
		for(Object list : strings)
			System.out.println(list);
		
	}

	 
}

 class Animal {	 
	public String toString() {
		return "I am an Animal" ;
	}	 
 }
 class lion extends Animal {
	public String toString() {
		return "I am a Lion - king of jungle";
	}  
 }