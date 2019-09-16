import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Kathy's Not-Quite-Blackjack.  I will be asking you for pairs of " +
                "numbers (cards).  If at any time you wish to stop playing, just enter zero (0) for both numbers.");

        int b = 0;
        int sum = 1;
        while (sum > 0) {
            sum = getSum(b);
            if (sum == 21) {
                System.out.println("The sum is: " + sum + "*");
            } else {
                System.out.println("The sum is: " + sum);
            }
        }

        System.out.println("Goodbye.  Thanks for playing Kathy's Not-Quite-Blackjack.");
    }
    public static int getSum(int b){
        Scanner key = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        String ask = "yes";
        while (ask.equalsIgnoreCase("yes")) {
            System.out.println("Please enter a number from 1 to 11 (your first card): ");
            num1 = key.nextInt();
            key.nextLine();
            if (num1 >= 0 && num1 <= 11) {
                ask = "no";
            } else {
                System.out.println("Invalid response.  Please try again.");
            }
        }
        ask = "yes";
        while (ask.equalsIgnoreCase("yes")) {
            System.out.println("Please enter a number from 1 to 11 (your second card): ");
            num2 = key.nextInt();
            key.nextLine();
            if (num2 >= 0 && num2 <= 11) {
                ask = "no";
            } else {
                System.out.println("Invalid response.  Please try again.");
            }
        }
        int sum = num1 + num2;
        return sum;
    }
}
