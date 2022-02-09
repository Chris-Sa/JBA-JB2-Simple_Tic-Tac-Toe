import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int current = scanner.nextInt();
        int next = scanner.nextInt();

        boolean asc = true;
        boolean desc = true;

        // System.out.println(current);
        // System.out.println(next);

        while (next != 0) {
            if (current > next) {
                // System.out.println("current greater than next");
                asc = false;
            }

            if (current < next) {
                // System.out.println("current less than next");
                desc = false;
            }
            current = next;
            next = scanner.nextInt();

//            System.out.println(current);
//            System.out.println(next);
//            System.out.println("asc: " + asc);
//            System.out.println("desc: " + desc);
        }
        if (asc || desc) {
            System.out.println("true");
        } else  {
            System.out.println("false");
        }
    }
}