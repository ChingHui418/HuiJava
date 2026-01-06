package tw.hui.tutor;

public class Hui13b {

	public static void main(String[] args) {
		// 陣列版本 不能賭博的範例 擲骰子，擲100次每個點骰到幾次
		int[] p = new int[7];
		
		for(int i=0; i<100; i++) {
			int point = (int)(Math.random()* 9) + 1; // 1~9的整數
			if(point>=1 && point<=9) {
				p[point>=7?point-3:point]++;
			}else {
				p[0]++;
			}
		}
		if(p[0]>0) {
			System.out.println("ERROR: " + p[0]);
		}else {
			for(int i=1; i<p.length; i++) {
				System.out.printf("%d點出現%d次\n", i, p[i]);
			}
			
		}
	}

}
