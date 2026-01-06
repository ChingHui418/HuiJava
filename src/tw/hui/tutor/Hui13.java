package tw.hui.tutor;

public class Hui13 {

	public static void main(String[] args) {
		// 陣列版本 擲骰子，擲100次每個點骰到幾次
		int[] p = new int[7];
		
		for(int i=0; i<100; i++) {
			int point = (int)(Math.random()* 6) + 1; // 1~6的整數
			if(point>=1 && point<=6) {
				p[point]++;  // 如果骰到 3 點，就在 p[3] 加 1
			}else {
				p[0]++;  // 萬一不是 1~6，記錄在 p[0]
			}
		}
		if(p[0]>0) {
			System.out.println("ERROR: " + p[0]); // 如果有產生 1~6 以外的數字，提示錯誤
		}else {
			for(int i=1; i<p.length; i++) {  // i 只能跑到 6 為止
				System.out.printf("%d點出現%d次\n", i, p[i]); // 印出 1~6 點的結果
			}
			
		}
	}

}
