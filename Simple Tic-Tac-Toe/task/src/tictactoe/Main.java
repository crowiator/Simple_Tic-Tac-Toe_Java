package tictactoe;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // write your code here
        // write your code here
        Scanner scanner = new Scanner(System.in);
        char[][] grid = new char[4][4];
        int counterZnak = 0;



        //fill the empty grid with '_'
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                grid[i][j] = ' ';
            }
        }

        //print empty grid
        System.out.println("---------");
        for (int i = 1; i < 4; i++) {
            System.out.print("| ");
            for (int j = 1; j < 4; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");

        // game logic
        boolean contains = true;
        int player = 0;
        while (contains) {
            boolean cislo = true;
            System.out.println("Enter the coordinates");
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            if (((Object) m instanceof Integer) && ((Object) n instanceof Integer)) {
                if ((m > 0 && m < 4) && (n > 0 && n < 4)) {
                    for (int i = 1; i < 4; i++) {
                        for (int j = 1; j < 4; j++) {
                            if (i == m && j == n) {
                                if (grid[m][n] == 'X' || grid[m][n] == 'O') {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    contains = true;

                                } else if (player == 0) {
                                    grid[m][n] = 'X'; //hrac s X je 0
                                    System.out.println("---------");
                                    for (int k = 1; k < 4; k++) {
                                        System.out.print("| ");
                                        for (int l = 1; l < 4; l++) {
                                            System.out.print(grid[k][l] + " ");
                                        }
                                        System.out.print("|");
                                        System.out.println();
                                    }
                                    System.out.println("---------");
                                    contains = true;
                                    counterZnak+=1;
                                    player = 1;
                                } else if (player == 1) {
                                    grid[m][n] = 'O'; // hrac s O je 1
                                    System.out.println("---------");
                                    for (int k = 1; k < 4; k++) {
                                        System.out.print("| ");
                                        for (int l = 1; l < 4; l++) {
                                            System.out.print(grid[k][l] + " ");
                                        }
                                        System.out.print("|");
                                        System.out.println();
                                    }
                                    System.out.println("---------");
                                    counterZnak+=1;
                                    contains = true;
                                    player = 0;
                                }
                            }

                        }
                    }
                } else {
                    System.out.println("Coordinates should be from 1 to 3!");
                    contains = true;
                }

            } else {
                System.out.println("You should enter numbers!");
                contains = true;
            }


            if ((grid[1][1] == 'X' && grid[1][2] == 'X' && grid[1][3] == 'X') || (grid[2][1] == 'X' && grid[2][2] == 'X' && grid[2][3] == 'X') || (grid[3][1] == 'X' && grid[3][2] == 'X' && grid[3][3] == 'X') ||
                    (grid[1][1] == 'X' && grid[2][1] == 'X' && grid[3][1] == 'X') || (grid[1][2] == 'X' && grid[2][2] == 'X' && grid[3][2] == 'X') || (grid[1][3] == 'X' && grid[2][3] == 'X' && grid[3][3] == 'X') ||
                    (grid[1][1] == 'X' && grid[2][2] == 'X' && grid[3][3] == 'X') || (grid[3][1] == 'X' && grid[2][2] == 'X' && grid[1][3] == 'X')) {
                System.out.println("X wins");
                contains = false;
            } else if ((grid[1][1] == 'O' && grid[1][2] == 'O' && grid[1][3] == 'O') || (grid[2][1] == 'O' && grid[2][2] == 'O' && grid[2][3] == 'O') || (grid[3][1] == 'O' && grid[3][2] == 'O' && grid[3][3] == 'O') ||
                    (grid[1][1] == 'O' && grid[2][1] == 'O' && grid[3][1] == 'O') || (grid[1][2] == 'O' && grid[2][2] == 'O' && grid[3][2] == 'O') || (grid[1][3] == 'O' && grid[2][3] == 'O' && grid[3][3] == 'O') ||
                    (grid[1][1] == 'O' && grid[2][2] == 'O' && grid[3][3] == 'O') || (grid[3][1] == 'O' && grid[2][2] == 'O' && grid[1][3] == 'O')) {
                System.out.println("0 wins");
                contains = false;
            }  else if(counterZnak == 9){
                System.out.println("Draw");
                contains = false;
            }
            else {
                contains=true;
            }


        }



    }
}