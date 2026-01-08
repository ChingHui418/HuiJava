package tw.hui.practice;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int answer = (int)(Math.random() * 100 + 1);
        int guess = -1;
        int count = 0;
        int min = 1;
        int max = 100;
        
        System.out.println("============================");
        System.out.println("   🎮 終極密碼遊戲 🎮");
        System.out.println("   猜出 1-100 之間的數字");
        System.out.println("============================");
        
        do {
            System.out.println("範圍 [" + min + " ~ " + max + "]");
            System.out.print("請輸入數字：");
            
            if(scanner.hasNextInt()) {
                guess = scanner.nextInt();
                count++;
            
                if(guess < min || guess > max) {
                    System.out.println("❌ 輸入無效，請輸入範圍內的數字！\n");
                } else if (guess > answer){
                    System.out.println("太大了！\n");
                    max = guess - 1;
                } else if (guess < answer) {
                    System.out.println("太小了！\n");
                    min = guess + 1;
                }
            } else {
                System.out.println("⚠️ 格式錯誤！請輸入『數字』。\n");
                scanner.next();
            }
        } while(guess != answer);
        
        System.out.println("🎊 恭喜答對了！答案：" + answer);
        System.out.println("你總共猜了 " + count + " 次！");
        
        scanner.close();
    }
}
