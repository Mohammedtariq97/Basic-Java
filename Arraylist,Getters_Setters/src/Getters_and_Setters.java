package BankAccount;

import java.util.Scanner;

public class Getters_and_Setters {

	public static void main(String[] args) {
		Student person = new Student();
		person.setName("Tariq");
		person.setAge(23);
		System.out.println(person.getName());
		
	}

}

class Student{
	
	private String name;
	private String rollNumber;
	String gender;
	private int age;
	

	int getAge() {
		return age;
	}
	String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	
	
}