package tw.hui.tutor;

public class Hui15 {

	public static void main(String[] args) {
		// 二維陣列
		int a;
		int[] a1;
		int[][] a2 = new int[2][3]; // 人稱 2 Rows x 3 Columns
		System.out.println(a2);
		System.out.println(a2.length);
		System.out.println(a2[0]);
		System.out.println(a2[0].length);
		System.out.println("-----");
		
		int[][] b = new int[3][];
		System.out.println(b.length);
		b[0] = new int[2];
		b[1] = new int[3];
		b[2] = new int[4];
		System.out.println("---");	
		for(int[] v : b) {
			for(int vv : v) {
				System.out.print(vv + " ");
			}
			System.out.println();
		}

	}

}
