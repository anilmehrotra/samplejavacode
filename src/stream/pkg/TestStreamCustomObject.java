package stream.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamCustomObject {

	public static void main(String[] args) {
		List<Person> people = createPeople();
		System.out.println(people);

		List<Person> filterAge = new ArrayList<>();

		/**************** Traditional way to filter *****************/
		for (Person person : people) {
			if (person.getAge() > 23) {
				filterAge.add(person);
			}
		}
		System.out.println(filterAge);

		/**************** Filter using Stream API *****************/
		System.out.println("this is a new **************** "+people.stream()
                .filter(person -> person.getAge() > 20)
                .map(person -> person.getName())
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList()));

		List<String> pFilteredList = people.stream()
				.filter(person -> person.getAge() > 20)
				.map(person -> person.getName())
				.map(name -> name.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println("000 --> "+pFilteredList);
		
		Set<String> pSet = people.stream()
				.filter(person -> person.getAge() > 20)
				.map(Person::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toSet());
		
		System.out.println("111 --> "+pSet);
		
		System.out.println("Iterate using stream");
		people.stream()
			  .filter(person -> person.getAge() > 23)
			  .map(person -> new Person(person.getName()
			  .toUpperCase(),person.getAdd().toUpperCase(),person.getAge()))
			  //.map(person -> person.toUpperCase())
			  .forEach(System.out::println);
		
		
		System.out.println("get sum");
		System.out.println(
		people.stream()
			  //.map(Person::getAge)
			  .mapToInt(Person::getAge)
			  //.reduce(0,(carry,age) -> carry + age));
			  //.reduce(0,Integer::sum));
			  .sum());
		
		System.out.println("get max");
		System.out.println(
				people.stream()
					  .max((person1,person2) -> person1.getAge() > person2.getAge() ? 1 : -1));
		
		System.out.println("get min");
		System.out.println(
				people.stream()
					  .min((person1,person2) -> person1.getAge() > person2.getAge() ? 1 : -1));
		
		System.out.println("get count");
		System.out.println(
		people.stream()
			  .filter(person -> person.getAge() > 19)
			  .count());
		
		Map<String,Person> map = people.stream()
									   .collect(
											   Collectors.toMap(
													   person->person.getName()+"::"+person.getAge(),
													   person->person));
		/*System.out.println(map);
		
		Map<String,List<Person>> mapListbject = people.stream()
				   .collect(
						   Collectors.
						   groupingBy(Person::getName)
						   );
		mapListbject.forEach((k,v) -> System.out.println(k+"::"+v));*/
		
		/*people.stream().filter(person -> person.getName().length()==4)
						.filter(person -> person.getAge() > 29)
						.findFirst();
		*/
		System.out.println("____________________");
		
		Stream.iterate(1, e -> e+1)
			  .filter(e -> e % 2==0)
			  .limit(3)
			  .forEach(System.out::println);
	}

	public static List<Person> createPeople() {
		List<Person> people = Arrays.asList(new Person("Sudhir", "delhi", 20),
				new Person("Vikash", "lko", 21), new Person("Anil", "gzb", 23),
				new Person("Rajesh", "blr", 20), new Person("Manoj", "delhi",
						27), new Person("Manoj", "delhi", 29));
		return people;
	}
}
