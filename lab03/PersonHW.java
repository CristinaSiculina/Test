import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonHW {
	private String firstName;
	private String lastName;
	private String cnp;
	private boolean isMale;
	private Date birthDate;
	
	public PersonHW(String firstName, String lastName, String cnp, boolean isMale, Date birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cnp = cnp;
		this.isMale = isMale;
		this.birthDate = birthDate;
	}

	public static Date extractDate(String cnp){
		try {
			String dateStr = cnp.substring(1,6);
		    Date birthdate = new SimpleDateFormat("yymmdd").parse(dateStr);          // asta e cazul vostru (transform String into Date)
		    System.out.println(new SimpleDateFormat("dd.mm.yyyy").format(birthdate)); // aici doar arat transformarea din Date in String folosind alt format
		    return birthdate;
		} catch (ParseException e) {
		    System.err.println("The given String is not a date");
		    return null;
		}
	}

	private static PersonHW parsePersonHW(String details) {
		String[] tokens = details.split(",");
		String firstName = tokens[0].trim();
		String lastName = tokens[1].trim();
		String cnp = tokens[2].trim();
		String gender = cnp.substring(0,1);
		boolean isMale = gender.equals("1") ? true : false;
		Date birthDate = extractDate(cnp);
		return new PersonHW(firstName, lastName, cnp, isMale, birthDate);
	}
	
	@Override public String toString() {
		return firstName + " " + lastName + ", birth date = " +
				new SimpleDateFormat("dd.mm.yyyy").format(birthDate);
	}

	public static void main(String[] args){
		String details = "Ion, Popescu, 1800920117892";
		
		PersonHW p = PersonHW.parsePersonHW(details);
		System.out.println(p);
	}

}
