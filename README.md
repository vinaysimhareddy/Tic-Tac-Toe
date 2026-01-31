# Tic-Tac-Toe Game

A classic Tic-Tac-Toe game built in Java with a terminal-based interface. Two players compete on a 3×3 grid, taking turns to mark their symbols (X and O) until one player wins or the board is full.

---

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [How to Run](#how-to-run)
- [Game Rules](#game-rules)
- [Project Structure](#project-structure)
- [How to Play](#how-to-play)
- [Example Gameplay](#example-gameplay)

---

## 🎮 Overview

This is a simple console-based Tic-Tac-Toe implementation in Java. The game allows two human players to play against each other in turns. The game automatically detects wins and draws, providing a complete gaming experience.

---

## ✨ Features

- **Two-Player Gameplay**: Player X and Player O take turns
- **Input Validation**: The game prevents placing marks on already occupied spaces
- **Win Detection**: Automatically detects winning conditions (rows, columns, diagonals)
- **Draw Detection**: Identifies when the board is full with no winner
- **Simple Console Interface**: Easy-to-read board display with clear formatting
- **Turn Management**: Automatic turn switching between players

---

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) installed on your system
- A terminal or command prompt

### Steps

1. **Navigate to the project directory**:
   ```
   cd "d:\Projects\practice projects\Tic-Tac-Toe"
   ```

2. **Compile the Java file**:
   ```
   javac Main.java
   ```

3. **Run the game**:
   ```
   java Main
   ```

---

## 📖 Game Rules

1. The game is played on a 3×3 grid
2. Player X goes first, followed by Player O
3. Players take turns entering the row and column coordinates (0-2) where they want to place their mark
4. A player cannot place a mark on a space that is already occupied
5. The first player to get three of their marks in a row (horizontal, vertical, or diagonal) wins
6. If all 9 spaces are filled and no player has won, the game is a draw

---

## 📁 Project Structure

```
Tic-Tac-Toe/
├── Main.java          # Main game logic and implementation
└── README.md          # Project documentation
```

### Main.java Components

- **`main(String[] args)`**: Entry point of the game; initializes the board and manages game loop
- **`printboard(char[][] board)`**: Displays the current state of the board
- **`haveWon(char[][] board, char player)`**: Checks if the current player has won (rows, columns, diagonals)
- **`isBoardFull(char[][] board)`**: Checks if the board has no empty spaces
- **`board`**: 3×3 2D character array representing the game grid

---

## 🎯 How to Play

1. When prompted, enter two numbers separated by a space: **row** and **column**
2. Both row and column should be between **0 and 2**
   - Row 0 = Top row
   - Row 1 = Middle row
   - Row 2 = Bottom row
   - Column 0 = Left column
   - Column 1 = Middle column
   - Column 2 = Right column

3. The game will display the updated board after each move
4. Continue playing until someone wins or the board is full
5. The game will announce the winner or if it's a draw

---

## 📝 Example Gameplay

```
 |  |  
 |  |  
 |  |  
Player x Enter: 1 1

 |  |  
 | x |  
 |  |  
Player o Enter: 0 0

o |  |  
 | x |  
 |  |  
Player x Enter: 2 2

o |  |  
 | x |  
 |  | x
Player o Enter: 0 1

o | o |  
 | x |  
 |  | x
Player x Enter: 0 2

o | o | x
 | x |  
 |  | x
Player x has won:
```

---

## 💡 Tips

- Plan your moves strategically to block your opponent
- Control the center position (1,1) for better winning opportunities
- Watch out for diagonal threats

---

## 📄 License

This is a practice project for educational purposes.
