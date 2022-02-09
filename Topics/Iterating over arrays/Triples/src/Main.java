import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int num1;
        int num2;
        int num3;
        int triples = 0;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < size - 2; i++) {
            num1 = numbers[i];
            num2 = numbers[i + 1];
            num3 = numbers[i + 2];

            // System.out.println("i: " + i);
            // System.out.println(num1 + " " + num2 + " " + num3);

            if ((num1 == num2 - 1) && (num1 == num3 - 2)) {
                // System.out.println("Triple");
                triples++;
            }
        }
        System.out.println(triples);
    }
}