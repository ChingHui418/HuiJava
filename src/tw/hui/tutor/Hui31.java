package tw.hui.tutor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import tw.hui.apis.Bike;
import tw.hui.apis.Scooter;

public class Hui31 {

	public static void main(String[] args) {
		// set
		Set set = new HashSet();
		set.add("Hui");
		set.add(new Bike());
		set.add("Hui");
		set.add(new Scooter());
		set.add(new int[3]);
		set.add(new Bike());
		set.add(123); // auto-boxing int => Integer
		System.out.println(set.size());
		System.out.println(set);
		System.out.println("---");
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

	}

}
