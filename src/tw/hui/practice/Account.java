package tw.hui.practice;

import java.util.ArrayList;

public class Account {
	
	private int balance;
	private int passwd;
	private ArrayList<String> history;
	
	public Account(int initBalance, int initPassword) {
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
			history.add("存款 " + amount + " 元");
			System.out.println("存款" + amount + "元");
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
}
