package tw.hui.tutor;

import java.util.HashSet;
import java.util.Set;

public class Hui32 {

	public static void main(String[] args) {
		// Set
		Set<String> names = new HashSet<>();
		names.add("Hui");
		names.add("Ariel");
		names.add("Jenny");
		System.out.println(names);
		for(String name : names) {
			System.out.println(name);
		}
	}

}
