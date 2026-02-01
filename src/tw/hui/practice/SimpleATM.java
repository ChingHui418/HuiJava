package tw.hui.practice;

import java.util.Scanner;

public class SimpleATM {

    public static void showMenu(int nowBalance) {
        System.out.println("---------------------");
        System.out.println("目前餘額：" + nowBalance);
        System.out.println("請選擇: 1.存款 2.提款 3.查詢交易紀錄 4.轉帳 5.登出");
        System.out.print("請輸入選項：");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account user1 = new Account("User1", 60000, 12345678);
        Account user2 = new Account("User2", 60000, 12345678);
        Account user3 = new Account("User3", 60000, 12345678);
        Account user4 = new Account("User4", 60000, 12345678);

        while (true) {
            System.out.println("\n==============================");
            System.out.println("    歡迎來到 Simple ATM 系統");
            System.out.println("==============================");
            System.out.println("請選擇使用者: 1.User1 2.User2 3.User3 4.User4 (輸入 0 關機)");
            System.out.print("請輸入帳號: ");
            
            int id = scanner.nextInt();
            Account nowUser = null;

            // 判斷user的選擇
            if (id == 0) {
                System.out.println("系統關機，資料已清空！");
                break;
                
            } else if (id == 1) {
                nowUser = user1;
            } else if (id == 2) {
                nowUser = user2;
            } else if (id == 3) {
                nowUser = user3;
            } else if (id == 4) {
                nowUser = user4;
            } else {
                System.out.println("❌ 查無此帳號，請重新選擇。");
                continue;
            }

            // 密碼驗證
            System.out.print("請輸入密碼：");
            int inputPw = scanner.nextInt();

            if (nowUser.checkPassword(inputPw)) {
                System.out.println("✅ 登入成功！歡迎您使用~");

                while (true) {
                    showMenu(nowUser.getBalance());
                    int choice = scanner.nextInt();

                    if (choice == 1) {
                        System.out.print("請輸入存款金額：");
                        nowUser.deposit(scanner.nextInt());

                    } else if (choice == 2) {
                        System.out.print("請輸入提款金額：");
                        nowUser.withdraw(scanner.nextInt());

                    } else if (choice == 3) {
                        nowUser.showHistory();

                    } else if (choice == 4) {
                        // 轉帳
                        System.out.print("請輸入對方帳號 (1~4): ");
                        int targetId = scanner.nextInt();
                        Account theTarget = null;

                        if (targetId == 1) theTarget = user1;
                        else if (targetId == 2) theTarget = user2;
                        else if (targetId == 3) theTarget = user3;
                        else if (targetId == 4) theTarget = user4;
                        else {
                            System.out.println("❌ 查無此帳戶");
                            continue;
                        }

                        if (theTarget == nowUser) {
                            System.out.println("❌ 不能轉給自己！");
                            continue;
                        }

                        System.out.print("請輸入轉帳金額: ");
                        nowUser.transfer(theTarget, scanner.nextInt());

                    } else if (choice == 5) {
                        System.out.println(id + " 已登出。");
                        break;
                    } else {
                        System.out.println("無效輸入");
                    }
                }
            } else {
                System.out.println("❌ 密碼錯誤，請重新登入。");
            }
        }
        scanner.close();
    }
}