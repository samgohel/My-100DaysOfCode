package com.sam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WithLambda {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
            new Person("Charles", "Dacken", 40), 
            new Person("Jordan", "Belfort", 42),
			new Person("Tony", "Stark", 25), 
            new Person("Jack", "Dawson", 45), 
            new Person("Andy", "Dufresne", 48),
			new Person("Bruce", "Wayne", 49));

		// Sort By Last Name
		// Pros: No Long Code, No Need to Write Type
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Print List Of Person
		// We Can put Condition Always true to print full list
		System.out.println("Printing Sorted List By Last Name.....");
		// printAll(people);
		printNameConditionally(people, p -> true);

		// Print People Who's name Start With "D"
		// Cons: Only Provide Static Functionality And Less Flexible
		System.out.println("Printing Person Last Name Start With D using Static Method.....");
		printLastNameStartWithD(people);

		// Print Name Conditionally
		System.out.println("Printing Person Last Name Start With D using Flexible Method.....");
		printNameConditionally(people, p -> p.getLastName().startsWith("D"));

		System.out.println("Printing Person First Name Start With J using Flexible Method.....");
		printNameConditionally(people, p -> p.getFirstName().startsWith("J"));
	}

	// Print Name If Condition True
	private static void printNameConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.check(p)) {
				System.out.println(p);
			}
		}
	}

	private static void printLastNameStartWithD(List<Person> people) {
		for (Person p : people) {
			if (p.getLastName().startsWith("D")) {
				System.out.println(p);
			}
		}
	}

	// Instead We Can use we can use print conditionally But Condition always Should
	// Be True, so we will no longer need this method
	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}

}

// Here we Still Using Interface