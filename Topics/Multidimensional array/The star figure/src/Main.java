import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        char[][] square = new char[size][size];

        int mid = (size - 1) / 2;
        char value;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    value = '*';
                } else if (i == mid || j == mid) {
                    value = '*';
                } else if (i + j == size - 1) {
                    value = '*';
                } else {
                    value = '.';
                }
                square[i][j] = value;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(square[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}