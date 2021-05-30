package com.sam;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WithoutLambda {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
            new Person("Charles", "Dacken", 40), 
            new Person("Jordan", "Belfort", 42),
			new Person("Tony", "Stark", 25), 
            new Person("Jack", "Dawson", 45), 
            new Person("Andy", "Dufresne", 48),
			new Person("Bruce", "Wayne", 49));

		// Sort By Last Name
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		// Print List Of Person
		System.out.println("Printing Sorted List By Last Name.....");
		printAll(people);

		// Print People Who's name Start With "D"
		// Cons: Only Provide Static Functionality And Less Flexible
		System.out.println("Printing Person Last Name Start With D using Static Method.....");
		printLastNameStartWithD(people);

		// Print Name Conditionally
		System.out.println("Printing Person Last Name Start With D using Flexible Method.....");
		printNameConditionally(people, new Condition() {
			@Override
			public boolean check(Person p) {
				return p.getLastName().startsWith("D");
			}
		});
		
		System.out.println("Printing Person First Name Start With J using Flexible Method.....");
		printNameConditionally(people, new Condition() {
			@Override
			public boolean check(Person p) {
				return p.getFirstName().startsWith("J");
			}
		});
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

	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}
}

interface Condition {
	boolean check(Person p);
}
