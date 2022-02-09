import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextLong();
        int factor = 1;
        long result = 1L;

        do {
            //System.out.println("result " + result);
            //System.out.println("factor " + factor);
            result = result * factor;
            ++factor;
            //System.out.println(result);
        } while (result <= number);
        System.out.println(factor - 1);
    }
}