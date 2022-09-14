import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is BTC price today?");
        var btc = scanner.nextDouble();

        while (true) {
            System.out.println("How much $ do you have?");
            var usd = scanner.nextDouble();

            if (usd == 0)
                break;

            var result = usd / btc;
            System.out.println("You will get " + result + " BTC!");
            System.out.println("If you want to buy more BTC enter your ante.");
            System.out.println("For EXIT enter 0");
        }
    }
}
