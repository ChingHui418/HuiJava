package tw.hui.tutor;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Hui20 extends JFrame {
	private JButton b1, b2, b3;
	
	public Hui20() {
		super("偶的視窗");
		System.out.println("Hui20()");
		
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3"); // 目前只有擁有，未呈現
		
		setLayout(new FlowLayout());
		add(b1);add(b2);add(b3);
		
		setSize(640, 480);
		setVisible(true);  // 視窗程式
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Hui20(); //要物件，但沒有要呼叫他
	}

}
