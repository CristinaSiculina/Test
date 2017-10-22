package Test.lab02;

public class shortstr {
	public static String scurt(String[] names){
		String scurtstr = names[0];
		for (int i = 1; i < names.length; i++){
			if ((names[i].compareTo(scurtstr)) < 0){
				scurtstr = names[i];
			}
		}
		return scurtstr;
	}
	
	public static void main(String[] args){
	String[] nume = {"Vasile", "Ana", "Elena"};
	scurt(nume);
	System.out.println(scurt(nume));
	}
}
