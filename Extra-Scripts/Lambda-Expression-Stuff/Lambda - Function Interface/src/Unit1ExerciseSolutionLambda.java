import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionLambda {


	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Erdin�","Da�l�",24),
				new Person("Umut","�al��kan",25),
				new Person("Emre","Da�l�",21));

		// Step 1: Sort list by last name
		Collections.sort(people,(p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));
		
		// Step 2: Create a method that prints all elements in the list
		System.out.println("Printing all Persons");
		printConditionally(people,p->true,p->System.out.println(p));
		
		// Step 3: Create a method that prints all people that have last name beginning with 'D'
		System.out.println("Printing all Persons with last name beginnig with D");
		printConditionally(people,p->p.getLastName().startsWith("D"),p->System.out.println(p.getLastName()));

	}

	private static void printConditionally(List<Person> people,Predicate<Person> predicate,Consumer<Person> consumer) {
		for (Person person : people) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}


}
