package com.sam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class WithLambdaInBuiltInterface {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
            new Person("Charles", "Dacken", 40), 
            new Person("Jordan", "Belfort", 42),
			new Person("Tony", "Stark", 25), 
            new Person("Jack", "Dawson", 45), 
            new Person("Andy", "Dufresne", 48),
			new Person("Bruce", "Wayne", 49));

		// Sort By Last Name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Print List Of Person
		printNameConditionally(people, p -> true, p -> System.out.println(p));

		// Print Name Conditionally
		System.out.println("Printing Person Last Name Start With D using Flexible Method.....");
		printNameConditionally(people, p -> p.getLastName().startsWith("D"), p -> System.out.println(p));

		System.out.println("Printing Person First Name Start With J using Flexible Method.....");
		printNameConditionally(people, p -> p.getFirstName().startsWith("J"), p -> System.out.println(p.getFirstName()));
	}

	// Here We Use in Built Predicate and consumer Interface instead Creating our own interface,
	//  we can perform any operation instead just print
	private static void printNameConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}
