import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] newGrid = new int[cols][rows];
        int[][] grid = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newGrid[j][rows - i - 1] = grid[i][j];
            }
        }
        for (int n = 0; n < cols; n++) {
            for (int m = 0; m < rows; m++) {
                System.out.print(newGrid[n][m] + " ");
            }
            System.out.println();
        }
    }
}