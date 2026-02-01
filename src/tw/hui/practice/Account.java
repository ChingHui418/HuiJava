package tw.hui.practice;

import java.util.ArrayList;

public class Account {
	
	private String name;
	private int balance;
	private int passwd;
	private ArrayList<String> history;
	
	public Account(String initName, int initBalance, int initPassword) {
		this.name = initName;
		this.balance = initBalance;
		this.passwd = initPassword;
		this.history = new ArrayList<>();
	}
	
	public boolean checkPassword(int inputPw) {
		if(this.passwd == inputPw) {
			return true;
		}else {
			return false;
		}
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void deposit(int amount) {
		if(amount > 0) {
			this.balance += amount;
			history.add("存款" + amount + "元");
			System.out.println("您存入了新台幣 " + amount + " 元！");
		}else {
			System.out.println("❌ 無存款金額");
		}
	}
	
	public void withdraw(int amount) {
		if(amount <= this.balance) {
			balance -= amount;
			history.add("提款" + amount + "元");
			System.out.println("成功取出新台幣 " + amount + " 元！");
		}else {
			System.out.println("❌ 餘額不足！交易失敗。");
		}
	}
	
	public void showHistory() {
		System.out.println("==== 交易明細 ====");
		for(String record : this.history) {
			System.out.println(record);
		}
		System.out.println("==================");
	}
	
	public void transfer(Account target, int amount) {
		if(amount > 0 && amount <= this.balance) {
			
			this.balance -= amount;
			target.balance += amount;
			
			this.history.add("轉帳給 " + target.name + " 金額: " + amount + " 元");
			target.history.add("收到 " + this.name + " 轉帳: " + amount + " 元");
			System.out.println("✅ 轉帳成功！您已轉出 " + amount + " 元");
			
		}else {
			System.out.println("❌ 轉帳失敗：金額錯誤或餘額不足");
		}
	}
}
