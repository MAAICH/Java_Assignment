package Lab9;

import java.util.Scanner;

// interface for Display
@FunctionalInterface
interface Display {
	void print();
}

// class with main method for program execution
public class InstanceCreation {

	private int id;
	private String name;
	private float marks1;
	private float marks2;
	private float marks3;

	public InstanceCreation(int id, String name, float marks1, float marks2, float marks3) {
		super();
		this.id = id;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks1() {
		return marks1;
	}

	public void setMarks1(float marks1) {
		this.marks1 = marks1;
	}

	public float getMarks2() {
		return marks2;
	}

	public void setMarks2(float marks2) {
		this.marks2 = marks2;
	}

	public float getMarks3() {
		return marks3;
	}

	public void setMarks3(float marks3) {
		this.marks3 = marks3;
	}

	public float calculateTotal() {
		return getMarks1() + getMarks2() + getMarks3();
	}

	// method to display details
	public void display() {
		System.out.println("\nDetails are :");
		System.out.println("ID : " + getId());
		System.out.println("Name : " + getName().toUpperCase());
		System.out.println("Total : " + calculateTotal());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id;
		do {
			System.out.print("Enter the ID : ");
			id = sc.nextInt();
			if (id <= 0)
				System.out.println("ID cannot be zero or negative.");
		} while (id <= 0);
		String name;
		boolean result = false;
		do {
			System.out.print("Enter the name : ");
			name = sc.next();
			result = name.matches("^[a-zA-Z]+$");
			if (result == false)
				System.out.println("Name must only consist of alphabets.");
		} while (result == false);
		float java_marks, spring_marks, hibernate_marks;
		do {
			System.out.print("Enter marks for java (out of 100) : ");
			java_marks = sc.nextFloat();
			if (java_marks < 0 || java_marks > 100)
				System.out.println("Marks should be between 0 and 100.");
		} while (java_marks < 0 || java_marks > 100);
		do {
			System.out.print("Enter marks for spring (out of 100) : ");
			spring_marks = sc.nextFloat();
			if (spring_marks < 0 || spring_marks > 100)
				System.out.println("Marks should be between 0 and 100.");
		} while (spring_marks < 0 || spring_marks > 100);
		do {
			System.out.print("Enter marks for hibernate (out of 100) : ");
			hibernate_marks = sc.nextFloat();
			if (hibernate_marks < 0 || hibernate_marks > 100)
				System.out.println("Marks should be between 0 and 100.");
		} while (hibernate_marks < 0 || hibernate_marks > 100);
		InstanceCreation stdm = new InstanceCreation(id, name, java_marks, spring_marks, hibernate_marks);
		Display display = stdm::display;

		display.print();

		sc.close();
	}

}
