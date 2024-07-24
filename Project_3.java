
import java.util.Scanner;

public class Project_3 
{
    private static final int SIZE = 3;
    private static final char EMPTY = ' ';
    private static char[][] board = new char[SIZE][SIZE];
    private static char currentPlayer = 'X';
    private static boolean isGameFinished = false;

    public static void main(String[] args) 
    {
        initializeBoard();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Tic Tac Toe!");

        while (!isGameFinished) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row[1-3] column[1-3]):");

            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;

                if (isWinningMove(row, col)) 
                {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    isGameFinished = true;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    isGameFinished = true;
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move! Please try again.");
            }
        }

        scanner.close();
    }

    private static void initializeBoard() 
    {
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                board[i][j] = EMPTY;
            }
        }
    }

    private static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < SIZE; i++) 
        {
            System.out.print("| ");
            for (int j = 0; j < SIZE; j++) 
            {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static boolean isValidMove(int row, int col)
    {
        return row >= 0 && row < SIZE &&
               col >= 0 && col < SIZE &&
               board[row][col] == EMPTY;
    }

    private static boolean isWinningMove(int row, int col) 
    {
       
        if (board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer)
        {
            return true;
        }
       
        if (board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer)
        {
            return true;
        }
       
        if (row == col && board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
        {
            return true;
        }
        
        if (row + col == SIZE - 1 && board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) 
        {
            return true;
        }
        return false;
    }

    private static boolean isBoardFull() 
    {
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++) 
            {
                if (board[i][j] == EMPTY) 
                {
                    return false;
                }
            }
        }
        return true;
    }
}