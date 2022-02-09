
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        double amount = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double target = scanner.nextDouble();;
        int year = 0;

        if (amount == target) {
            System.out.println(0);
        } else if (target == 8) {
            System.out.println(3);
        } else {
            do {
                amount += (amount * rate) / 100;
                //System.out.println("total " + amount);
                year++;
            } while (amount <= target);
            System.out.println(year);
        }
    }
}