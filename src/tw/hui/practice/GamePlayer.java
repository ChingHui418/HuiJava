package tw.hui.practice;

public class GamePlayer {

	private String name;
	private int hp;
	private int iv;
	
	public GamePlayer(String name, int hp, int iv) {
		this.name = name; 
        this.hp = hp;
        this.iv = iv;
	}
	
	public void attack(GamePlayer target) {
		
		int damage = 10 + this.iv;
		
		target.hp -= damage;
		
		System.out.println(this.name + " 攻擊了 " + target.name + 
                "，造成 " + damage + " 點傷害！");
		System.out.println(target.name + " 剩餘血量：" + target.hp);
		System.out.println("----------------------------------");
	}
	
	public String getName() {
		return name;
	}
	
	
	public static void main(String[] args) {
		GamePlayer hero1 = new GamePlayer("阿路", 100, 5);
		GamePlayer hero2 = new GamePlayer("阿華", 100, 8);
		
		System.out.println("=== 遊戲開始 ===");
		hero1.attack(hero2);
		hero2.attack(hero1);		
		hero1.attack(hero2);
	}

}
