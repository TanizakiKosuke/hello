import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 90) + 10; // 10から99までのランダムな数を生成
        int guessCount = 0;
        final int MAX_GUESS_COUNT = 5;

        System.out.println("数当てゲームを開始します！");

        while (guessCount < MAX_GUESS_COUNT) {
            System.out.print("2桁の正の整数を予想して入力してください（残り" + (MAX_GUESS_COUNT - guessCount) + "回）: ");
            Scanner scanner = new Scanner(System.in);
            int userGuess = scanner.nextInt();
            guessCount++;

            if (userGuess == secretNumber) {
                System.out.println("当たり！正解は " + secretNumber + " でした。");
                return;
            } else {
                if (Math.abs(userGuess - secretNumber) >= 20) {
                    System.out.println("外れ！設定された数との差が20以上あります。");
                } else if (userGuess > secretNumber) {
                    System.out.println("外れ！設定された数より大きいです。");
                } else {
                    System.out.println("外れ！設定された数より小さいです。");
                }
            }
        }

        System.out.println("ゲームオーバー！正解は " + secretNumber + " でした。");
    }
}
