package Test.lab02;

import java.util.Arrays;

public class exTwo {
	public static void main(String[] args) {
		String text = "Ianas, Paul, 30\nIonescu,Ana,30\nIon, Paul, 20\n";
		String[] names = extractNames(text);
		Arrays.sort(names);
		for (int i = 0; i < names.length - 1;) {
			int counter = 1;
			int j = i + 1;
			for (; j < names.length; j++) {
				if (names[i].equalsIgnoreCase(names[j])) {
					counter = counter + 1;
				} else {
					break;
				}
			}
			if (counter >= 2) {
				System.out.println(names[i]);
			}
			i = j;
		}

	}

	private static String[] extractNames(String text) {
		String[] lines = text.split("\n");
		String[] names = new String[lines.length];
		for (int i = 0; i < lines.length; i++) {
			names[i] = lines[i].split(",")[1].trim();
		}
		return names;
	}

}
