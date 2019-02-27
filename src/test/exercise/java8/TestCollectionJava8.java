package test.exercise.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class TestCollectionJava8 {

	public static void main(String[] args) {
		List<Person> people = createPeople();

		// sort list by Last Name
		Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));

		System.out.println("List Iteration Using New Iterator of java 8 ");
		people.forEach(p->System.out.println(p));
		System.out.println("List is : "+people);

		// create a method that print all element in list
		System.out.println("All element");
		printAll(people);
		printOnCondition(people, p -> true);

		// create a method that print all people in list who have Last Name
		// beginning with T
		System.out.println("Element who have Last Name beginning with T");
		printOnCondition(people, p -> p.getLastName().startsWith("T"));

		// create a method that print all people in list who have First Name
		// beginning with T
		System.out.println("Element who have First Name beginning with A");
		printOnCondition(people, p -> p.getFirstName().startsWith("A"));
	}

	public static List<Person> createPeople() {
		List<Person> people = Arrays.asList(
				new Person("Sudhir", "Trivedi", 20), new Person("Vikash",
						"Yadav", 21), new Person("Anil", "Mehra", 23),
				new Person("Shanu", "Tiwari", 20), new Person("Rakesh", "Raj",
						27), new Person("Manoj", "Madeshiya", 29));
		return people;
	}

	public static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.print(p + "\t");
		}
		System.out.println();
	}

	public static void printOnCondition(List<Person> people, Predicate<Person> condition) {
		for (Person p : people) {
			// if(p.getLastName().startsWith("T"))
			if (condition.test(p))
				System.out.print(p + "\t");
		}
		System.out.println();
	}
}