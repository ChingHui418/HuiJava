package tw.hui.practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PSRGame extends JFrame implements ActionListener {
	
	private JButton btnScissors, btnRock, btnPaper;
	private JLabel statusLabel; 
	
	public PSRGame() {
		setTitle("『剪刀, 石頭, 布』遊戲");
		setLayout(new BorderLayout());
		setSize(400, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Font F = new Font("微軟正黑體", Font.BOLD, 36);
		
		statusLabel = new JLabel("請出拳！", SwingConstants.CENTER);
		statusLabel.setFont(new Font("微軟正黑體", Font.BOLD, 24));
		statusLabel.setOpaque(true);
		statusLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 0, 10, 0));
		statusLabel.setBackground(Color.LIGHT_GRAY);
		add(statusLabel, BorderLayout.NORTH);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(3, 1, 0, 15));
		
		btnScissors = new JButton("剪刀");
		btnRock = new JButton("石頭");
		btnPaper = new JButton("布");
		
		btnScissors.setFont(F);
		btnRock.setFont(F);
		btnPaper.setFont(F);
		
		java.awt.Dimension btnSize = new java.awt.Dimension(200, 80);
		btnScissors.setPreferredSize(btnSize);
		btnRock.setPreferredSize(btnSize);
		btnPaper.setPreferredSize(btnSize);
		
		btnScissors.addActionListener(this);
		btnRock.addActionListener(this);
		btnPaper.addActionListener(this);
		
		buttonPanel.add(btnScissors);
		buttonPanel.add(btnRock);
		buttonPanel.add(btnPaper);
		add(buttonPanel, BorderLayout.CENTER);
		
		JPanel container = new JPanel();
		container.add(buttonPanel);
		add(container, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 取得點擊事件按鈕
		JButton clickButton = (JButton)e.getSource();
		String playerMove = clickButton.getText();
		
		// 電腦亂數
		int computerMoveCode = (int)(Math.random() * 3);
		String computerMove = "";
		if(computerMoveCode == 0) computerMove = "剪刀";
		else if(computerMoveCode == 1) computerMove = "石頭";
		else computerMove = "布";
		
		// 判斷勝負
		String result = "";
		if (playerMove.equals(computerMove)) {
			result = "平手！";
			statusLabel.setForeground(Color.BLACK); 
		} 
		else if ( (playerMove.equals("剪刀✌") && computerMove.equals("布")) ||
				  (playerMove.equals("石頭") && computerMove.equals("剪刀")) ||
				  (playerMove.equals("布") && computerMove.equals("石頭")) ) {
			result = "恭喜獲勝！";
			statusLabel.setForeground(Color.BLUE); 
		} 
		else {
			result = "你輸了，再試試看吧！";
			statusLabel.setForeground(Color.RED); 
		}
		
		statusLabel.setText("電腦出" + computerMove + "。 " + result);
	}
	
	public static void main(String[] args) {
		// 剪刀、石頭、布」GUI 遊戲
		new PSRGame();
	}

}
