package tw.hui.practice;

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
		
		Account user = new Account(100000, 12345678);
		System.out.println("請輸入密碼：");
		int inputPw = scanner.nextInt();
		
		if(user.checkPassword(inputPw)) {
			System.out.println("登入成功！");
			
			while(true) {
				showMenu(user.getBalance());
				
				int choice = scanner.nextInt();
				
				if(choice == 1) {
                    System.out.print("請輸入存款金額：");
                    int amount = scanner.nextInt();
                    user.deposit(amount); 
                    
                } else if (choice == 2) {
                    System.out.print("請輸入提款金額：");
                    int amount = scanner.nextInt();
                    user.withdraw(amount);
                    
                } else if (choice == 3) {
                    user.showHistory();
                    
                } else if (choice == 4) {
                    System.out.println("系統結束，謝謝光臨 SimpleATM！");
                    break;
                } else {
                    System.out.println("無效輸入");
                }
            }
		}else {
			System.out.println("密碼錯誤，卡片被吃掉了！(系統登出)");
		}
		scanner.close();
	}
}
