# Tic-Tac-Toe
It is a simple Java implementation of Tic Tac Toe with game logic, handling user input, and simple console output. The game has to be a traditionally played two-player console game.
# Project Overview
1. *Board Representation:*
- The board state is maintained in a 2d array of characters (char[][] board) with each cell being empty (' ') or occupied by the player's symbol ('X' or 'O').

2. *Game Flow:*
   - The game starts from the initialization of the board (initializeBoard()).
   - The turn of the players.
- The move is taken by the player by providing row(1-3) and column(1-3) coordinates.
   - The move is validated (isValidMove(row, col)) to ensure the chosen cell is empty and on the board.
   - The board is displayed (printBoard()) after every turn.

3. *Winning Condition:*
   Winning conditions need to be validated after every move:
- Horizontal: All the cells of a row contain the current player's symbol.
  - Vertical: All the cells of a column contain the current player's symbol.
   - Diagonal and Anti-diagonal: The diagonal or anti-diagonal contains the current player's symbol.
4. *End of Game:*
  - Either if a player is winning (isWinningMove() == true) or if the board is full (isBoardFull() == true), the game is over.
- The final state of the board, with the result displayed, is displayed at the end of the game.

*User input is accepted primarily through the use of Scanner, where integers are used to represent row and column inputs.*
*Running the Game:*

-Compile the file TicTacToe.java.

-Run the compiled class (java TicTacToe).

-Play the game as per instructions.


