import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Erdin�","Da�l�",24),
				new Person("Umut","�al��kan",25),
				new Person("Emre","Da�l�",21));
	
		//Using for loop
		System.out.println("FOR Loop");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		System.out.println("FOR Loop");
		for(Person p : people) {
			System.out.println(p);
		}
		
		System.out.println("FOREACH Loop");
		people.forEach(System.out::println);
		
	}

}
