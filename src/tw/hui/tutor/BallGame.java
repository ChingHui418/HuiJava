package tw.hui.tutor;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import tw.hui.apis.GamePanel;
import tw.hui.apis.GamePanelV2;

public class BallGame extends JFrame {
	private GamePanelV2 gamePanel;
	
	public BallGame() {
		
		setLayout(new BorderLayout());
		gamePanel = new GamePanelV2();
		add(gamePanel, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new BallGame();
	}

}
