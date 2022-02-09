import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scaner = new Scanner(System.in);
        int size = scaner.nextInt();
        int[] numbers = new int[size];
        int total = 0;

        for (int i = 0; i < size; i++) {

            numbers[i] = scaner.nextInt();
        }

        for (int number : numbers) {
            total += number;
        }
        System.out.println(total);
    }
}