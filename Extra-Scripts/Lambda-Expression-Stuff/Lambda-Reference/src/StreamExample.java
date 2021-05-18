import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Erdinç","Daðlý",24),
				new Person("Umut","Çalýþkan",25),
				new Person("Emre","Daðlý",21));
	
	    people.stream()
	    .filter(p->p.getName().startsWith("U"))
	    .forEach(p->System.out.println(p.getAge()));;
		
	    long count = people.stream()
	    		.filter(p->p.getName().startsWith("E"))
	    	    //.forEach(p->System.out.println(p.getAge())
	    		.count();
	    System.out.println(count);
	    
	    long countParalle = people.parallelStream()
	    		.filter(p->p.getName().startsWith("E"))
	    	    //.forEach(p->System.out.println(p.getAge())
	    		.count();
	    System.out.println(countParalle);
	}

}
