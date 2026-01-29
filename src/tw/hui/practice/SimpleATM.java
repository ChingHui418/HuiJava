package tw.hui.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleATM {
	
	public static void showMenu(int nowBalance) {
		System.out.println("---------------------");
		System.out.println("目前餘額：" + nowBalance);
		System.out.println("請選擇: 1.存款 2.提款 3.查詢交易紀錄 4.離開");
		System.out.print("請輸入選項：");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int balance = 100000;
		int passwd = 12345678;
		System.out.println("請輸入密碼：");
		int inputPw = scanner.nextInt();
		
		if(inputPw == passwd) {
			System.out.println("登入成功！");
			ArrayList<String> history = new ArrayList<>();
			
			while(true) {
				showMenu(balance);
				int choice = scanner.nextInt();
				if(choice ==1) {
					System.out.print("請輸入存款金額：");
					int amount = scanner.nextInt();
					balance += amount;
					history.add("存款" + amount + "元");
					System.out.println("成功存入新台幣 " + amount + " 元！");
				}else if(choice == 2){
					System.out.print("請輸入提款金額：");
					int amount = scanner.nextInt();
					if(amount > balance) {
						System.out.println("❌ 餘額不足！交易失敗。");
					}else {
						balance -= amount;
						history.add("提款" + amount + "元");
						System.out.println("成功取出新台幣 " + amount + " 元！");
					}
				}else if(choice == 3){
					System.out.println("==== 交易明細 ====");
					for(String record : history) {
						System.out.println(record);
					}
					System.out.println("==================");
				}else if(choice == 4) {
					System.out.println("系統結束，謝謝光臨 SimpleATM！");
					break;
				}else {
					System.out.println("無效選項，請重新輸入數字。");
				}
			}
		}else {
			System.out.println("密碼錯誤，卡片被吃掉了！(系統登出)");
		}
		scanner.close();
	}
}
