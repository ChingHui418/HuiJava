package tw.hui.tutor;

import java.util.ArrayList;
import java.util.List;

public class Hui34 {

	public static void main(String[] args) {
		// List
		List<String> names = new ArrayList<>();
		names.add(0, "Hui");
		names.add(0, "Jenny");
		names.add(0, "Ariel");
		names.add(0, "Shine");
		names.add(0, "Mark");
		names.add(0, "David");
		System.out.println(names.size());
		for(String name: names) {
			System.out.println(name);
		}
		System.out.println("---");
		System.out.println(names.get(0));
		System.out.println(names.get(3));
	}

}
