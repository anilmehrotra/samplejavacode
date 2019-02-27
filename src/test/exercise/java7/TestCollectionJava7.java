package test.exercise.java7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCollectionJava7 {

	public static void main(String[] args) {
		List<Person> people = createPeople();

		// sort list by Last Name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});

		//System.out.println(people);

		// create a method that print all element in list
		System.out.println("All element");
		printAll(people);
		printOnCondition(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return true;
			}
		});

		// create a method that print all people in list who have Last Name
		// beginning with T
		System.out.println("Element who have Last Name beginning with T");
		printOnCondition(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("T");
			}
		});

		// create a method that print all people in list who have First Name
		// beginning with T
		System.out.println("Element who have First Name beginning with A");
		printOnCondition(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("A");
			}
		});
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

	public static void printOnCondition(List<Person> people, Condition condition) {
		for (Person p : people) {
			// if(p.getLastName().startsWith("T"))
			if (condition.test(p))
				System.out.print(p + "\t");
		}
		System.out.println();
	}
}