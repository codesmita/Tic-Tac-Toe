# Tic-Tac-Toe
Creating a simple Tic Tac Toe game in Java involves implementing the game logic, user input handling, and basic console output. This version will be a two-player game played in the console.
# Project Outline
1.	*Board Representation:*
   - The board is represented as a 2D array of characters (char[][] board), where each cell can be empty (' ') or marked by either player ('X' or 'O').
     
2.	*Game Flow:*
   - The game starts with initializing the board (initializeBoard()).
   - Players take turns.
   - Players input their moves as row (1-3) and column (1-3).
   - Each move is validated (isValidMove(row, col)) to ensure the chosen cell is empty and within bounds.
   - After each move, the board is printed (printBoard()).

3.	*Winning Condition:*
    Winning conditions are checked after each move:
	 - Horizontal: Check if the entire row is filled with the current player's symbol.
	 - Vertical: Check if the entire column is filled with the current player's symbol.
   - Diagonal and Anti-diagonal: Check if either diagonal or anti-diagonal is filled with the current player's symbol.

4.	*End of Game:*
   - The game ends when a player wins (isWinningMove() returns true) or when the board is full (isBoardFull() returns true).
   - After the game ends, the final board state is displayed along with the result.

*Player input is handled using Scanner, reading integers for row and column inputs.*

*Running the Game:*
-	Compile the Java file (TicTacToe.java).
-	Run the compiled class (java TicTacToe).
-	Follow the prompts to play the game.



