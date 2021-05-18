import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionLambda {


	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Erdinç","Daðlý",24),
				new Person("Umut","Çalýþkan",25),
				new Person("Emre","Daðlý",21));

		// Step 1: Sort list by last name
		Collections.sort(people,(p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));
		
		// Step 2: Create a method that prints all elements in the list
		System.out.println("Printing all Persons");
		printConditionally(people,p->true);
		
		// Step 3: Create a method that prints all people that have last name beginning with 'D'
		System.out.println("Printing all Persons with last name beginnig with D");
		printConditionally(people,p->p.getLastName().startsWith("D"));

	}

	private static void printConditionally(List<Person> people,Condition condition) {
		for (Person person : people) {
			if (condition.test(person)) {
				System.out.println(person);
			}
		}
	}


}
