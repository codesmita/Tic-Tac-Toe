# Tic-Tac-Toe
This version of Tic Tac Toe is developed using Java, which implements the game logic, user input handling, and basic console output. The game is designed to be a classically played two-player game on the console.
# Project Overview
1. *Board Representation:*
   - The board state is represented in a 2d character array (char[][] board) with every cell either empty (' ') or marked with the player's symbol ('X' or 'O').
     
2. *Game Flow:*
   - The game starts from the initialization of the board (initializeBoard()).
   - Each player takes their turn.
   - The player makes a move by entering row(1-3) and column(1-3) coordinates.
   - The move is validated (isValidMove(row, col)) to ensure that the cell chosen is empty and within bounds.
   - After every turn, the board is printed (printBoard()).

3. *Winning Condition:*
   Winning conditions have to be checked after every move:
	 - Horizontal: If all row cells are filled by the current player's symbol.
	 - Vertical: If all column cells are filled by the current player's symbol.
   - Diagonal and Anti-diagonal: If either diagonal or anti-diagonal is filled by the current player's symbol.
4.	*End of Game:*
   - The game stops when either a player wins (isWinningMove() returns true) or the board fills up (isBoardFull() returns true).
   - At the end of the game, the final board state, with the result printed, is displayed.

*User input is taken mainly through Scanner, where integers are used to represent row and column inputs.*

*Running the Game:*
-	Compile the TicTacToe.java file.
-	Run the compiled class (java TicTacToe).
-	Follow the instructions to play the game. 
	


