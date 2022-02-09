import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int [] numbers = new int [size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int greater = scanner.nextInt();

        // System.out.println(Arrays.toString(numbers));

        int total = 0;

        for (int num : numbers) {
            if (num > greater) {
                total += num;
            }
        }
        System.out.println(total);
    }
}