package tw.hui.tutor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNum extends JFrame implements ActionListener {
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	private final int times = 10;
	private int counter;
	
		public GuessNum() {
			super("猜數字遊戲");
			
			guess = new JButton("猜");
			input = new JTextField();
			log = new JTextArea();
			
			// 美化
			input.setFont(new Font(null, Font.BOLD | Font.ITALIC, 24));
			input.setForeground(Color.BLUE);
			
			// 畫面部分
			setLayout(new BorderLayout());
			add(log, BorderLayout.CENTER);
			
			JPanel top = new JPanel(new BorderLayout());
			add(top, BorderLayout.NORTH);
			
			// 頂部畫面
			top.add(guess, BorderLayout.EAST);
			top.add(input, BorderLayout.CENTER);
			
			setSize(640, 480);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			initGame();
			guess.addActionListener(this);
//			guess.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					System.out.println("OK2");
//				}
//			});
		}
		// 每次開新的一局
		private void initGame() {
			log.setText("");
			answer = createAnswer(3);
			counter = 0;
			System.out.println(answer);
		}
		
		private String createAnswer(int d) {
			final int num = 10;
			int[] poker = new int[num];
			for(int i=0; i<num; i++) poker[i] = i;
			
			// 亂數隨機一張牌，做交換
			for(int i = num-1; i>0; i--) {
				int r = (int)(Math.random()*(i+1));
				// 交換 poker[i] <=> poker[r]
			    int temp = poker[i];
				poker[i] = poker[r];
				poker[r] = temp;
			}
			

			
			StringBuffer sb = new StringBuffer();
			for(int i=0; i<d; i++) sb.append(poker[i]);
			
			return sb.toString();		
		}

		public static void main(String[] args) {
			new GuessNum();
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String g = input.getText();
			// 檢查機制
			
			counter++;
			input.setText("");
			
			String result = checkAB(g);
			log.append(String.format("%d. %s => %s\n", counter, g, result));
			
			if(result.equals("3A0B")) {
				JOptionPane.showMessageDialog(null, "恭喜老爺，賀喜夫人");
				initGame();
			}else if(counter == times) {
				JOptionPane.showMessageDialog(null, "Answer is" + answer);
				initGame();
			}
		}
		
		private String checkAB(String g) {
			// 區域變數
			int A, B; A = B = 0;
			
			for(int i=0; i<answer.length(); i++) {
				if(answer.charAt(i) == g.charAt(i)) {
					A++;
				}else if(answer.indexOf(g.charAt(i)) != -1) {
					B++;
				}
			}
			
			return String.format("%dA%dB", A, B);
		}

	}
