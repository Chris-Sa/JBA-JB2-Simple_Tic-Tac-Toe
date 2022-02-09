package tictactoe;
import java.util.Scanner;

/**
 * Simple tic-tac-toe program completed as part of Java basics course on Jetbrains academy
 * single player no AI, player enters X, Y coordinates for each move, input validated, alternates player symbol each move.
 */

public class Main {
    public static void main(String[] args) {

        int Xs;
        int Os;
        int dashes = 0;
        int pos;
        String status = "";
        Scanner scanner = new Scanner(System.in);
        String border = "---------";
        String cells = "_________";
        // list of win conditions
        int[][] wins = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};

        // Start game loop
        boolean finished = false;
        boolean playerX = true;
        char playersymbol;

        while (!finished) {

            // set player
            if (playerX) {
                playersymbol = 'X';
            } else{
                playersymbol = 'O';
            }

            // create array of the three lines from input
            String[] lines = {cells.substring(0, 3),cells.substring(3, 6),cells.substring(6)};

            //Draw grid

            System.out.println(border);

            for (String line : lines) {
                System.out.print("| ");
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (c == '_') {
                        System.out.print("  ");
                    } else {
                        System.out.print(c + " ");

                    }
                }
                System.out.print("|");
                System.out.println();
            }
            System.out.println(border);

            // Get coordinates and check valid
            System.out.println("Enter the coordinates:");

            String y;
            String x;


            int X;
            int Y;
            boolean valid = false;

            while (!valid) {

                //get and check input
                String input = scanner.nextLine();
                String inputsplit[] = input.split(" ");

                if (inputsplit.length == 2) {
                    y = inputsplit[0];
                    x = inputsplit[1];

                    // translate cord to position
                    if ((x.matches("\\d")) && (y.matches("\\d"))) {
                        X = Integer.parseInt(x);
                        Y = Integer.parseInt(y);
                        valid = true;
                    } else {
                        System.out.println("You should enter numbers!");
                        valid = false;
                        continue;
                    }
                    // check in range
                    if ((X > 0 && X < 4) && (Y > 0 && Y < 4)) {
                        valid = true;
                        X -= 1;
                        Y -= 1;
                    } else {
                        System.out.println("Coordinates should be from 1 to 3!");
                        valid = false;
                        continue;
                    }
                    // check occupied

                } else {
                    System.out.println("You should enter numbers!");
                    valid = false;
                    continue;
                }
                pos = X + (Y * 3);
                if (cells.charAt(pos) != '_') {
                    System.out.println("This cell is occupied! Choose another one!");
                    valid = false;
                } else {
                    valid = true;
                    char[] cellchars = cells.toCharArray();
                    cellchars[pos] = playersymbol;
                    cells = String.valueOf(cellchars);
                    //System.out.println(cells);

                }
                if (valid) {
                    break;
                }
            }  // End of validation check

            // check winner

            for (int[] win : wins) {
                // System.out.println(cells);
                Xs = 0;
                Os = 0;
                //System.out.println(Arrays.toString(win));
                for (int i : win) {
                    if (cells.charAt(i) == 'X') {
                        Xs += 1;
                    } else if (cells.charAt(i) == 'O') {
                        Os += 1;
                    }
                    if (Xs == 3) {
                        status = "X wins";
                        finished = true;
                    } else if (Os == 3) {
                        status = "O wins";
                        finished = true;
                    }
                }
            }
            // check draw
            int count = 0;
            for (int i = 0; i < 9; i++) {
                if (cells.charAt(i) == '_') {
                    count++;
                }
            }
            //System.out.println("dashes: " + count);
            if ((count == 0) && (status == "")){
                status = "Draw";
                finished = true;
            }


            //switch player
            playerX = !playerX;
            //finished = true;
                } //end of game loop

        String[] lines = {cells.substring(0, 3),cells.substring(3, 6),cells.substring(6)};
        System.out.println(border);

        for (String line : lines) {
            System.out.print("| ");
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == '_') {
                    System.out.print("  ");
                } else {
                    System.out.print(c + " ");

                }
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println(border);
            System.out.println(status);
            }
}

