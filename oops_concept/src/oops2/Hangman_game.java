package oops2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman_game {

	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("Guess the movie");
		
		try{File file = new File("movies.txt");
		Scanner in = new Scanner(file);
		List<String> names = new ArrayList<String>();
		while (in.hasNextLine()){
			names.add(in.nextLine());
		}
		Random random = new Random();
		Collections.shuffle(names);		
		String word = names.get(0);
		char[] filler = new char[word.length()];
		int life = 8;
		for(int i =0; i<word.length(); i++) {
			 filler[i] = '*' ;
			 if(word.charAt(i)== ' ') {
				 filler[i]= ' ';
			 }
			
		}
		System.out.print(filler);
		System.out.println("\nlife remaining = "+ life);
		
		Scanner s = new Scanner(System.in);
		ArrayList<Character> ch = new ArrayList<Character>();
		while(life>0)
		{
			char x = s.next().charAt(0);
			
			if (ch.contains(x)) {
				System.out.println("Letter already entered");
			}
			
			ch.add(x);
			
			if(word.contains(x+"")) {
				for(int i=0; i<word.length();i++) {
					if(word.charAt(i)==x) {
						filler[i]=x;
					}
				}
				
			}else {
				life--;
			}			
			if (word.equals(String.valueOf(filler))) {
				System.out.print(filler);
				System.out.println("\nYou won!!");
				break;
			}
				
			System.out.print(filler);
			System.out.println("\nlife remaining = "+ life);
			
		}
		
		if(life==0) {
			System.out.println("You lost");
			System.out.println(word);
			
		}
				
		}
		catch (Exception e) {
			System.out.println("File not found");
		}
		
		
	}

}


	
