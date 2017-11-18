import java.util.Map;
import java.util.HashMap;

import static java.lang.System.*;

class Student {
	private String firstName;
	private String lastName;

	public Student(String f, String l) {
		firstName = f;
		lastName = l;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}

public class MapTest {

	public static void main(String[] args) {
		// Paranthesis start
		Integer i1 = new Integer(10);
		Integer i2 = 10;
		int i3 = i1;
		// paranthesis end

		Map<Student, Integer> mathMarks = new HashMap<Student, Integer>();
		Student ionIonescu = new Student("Ion", "Ionescu");
		Student anaIonescu = new Student("Ana", "Ionescu");
		
		Map<String, Double> weight = new HashMap<String, Double>();
		String alinaMoise = new String ("Alina Moise");
		String bogdanLazar = "Bogdan Lazar";

		mathMarks.put(ionIonescu, 10);
		mathMarks.put(anaIonescu, 10);
		mathMarks.put(new Student("Ionel", "Popescu"), 9);
		
		weight.put(alinaMoise, 56.00);
		weight.put(bogdanLazar, 109.40);
		weight.put("ion", 20.6);

		out.printf("%s`s mark is %d\n", ionIonescu, mathMarks.get(ionIonescu));
		
		for (Student s : mathMarks.keySet()) {
			out.printf("%s`s mark is %d\n", s, mathMarks.get(s));	
		}
		
		for (String s : weight.keySet()) {
			out.printf("%s`s weight is %f\n", s, weight.get(s));	
		}
		
		for (int mark : mathMarks.values()) {
			out.println(mark);
		}
	}

}
