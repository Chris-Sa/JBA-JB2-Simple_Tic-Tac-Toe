import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();

        text1 = text1.replaceAll(" ","");
        text2 = text2.replaceAll(" ","");
        if (text1.equals(text2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}