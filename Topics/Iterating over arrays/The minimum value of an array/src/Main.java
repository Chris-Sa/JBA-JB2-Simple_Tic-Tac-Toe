import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] numbers = new int[size];

        int low = scanner.nextInt();
        int num;

        for (int i = 0; i < size -1; i++) {
            num = scanner.nextInt();
            if (num < low) {
                low = num;
            }
        }
        System.out.println(low);
    }
}