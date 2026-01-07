package tw.hui.tutor;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hui33 {

	public static void main(String[] args) {
		// 出樂透 Set 應用
		Set<Integer> lottery = new TreeSet<>();
		while(lottery.size() < 6) {
			lottery.add((int)(Math.random()*49+1));
		}
		for(Integer i :lottery) {
			System.out.println(i);
		}
		
	}

}
