# Plan for Testing the Program

The test plan lays out the actions and data I will use to test the functionality of my program.

Terminology:
- **VALID** data values are those that the program expects
- **BOUNDARY** data values are at the limits of the valid range
- **INVALID** data values are those that the program should reject

---

## Valid Move Placement

Player places a bomb on an empty square within the board range.

### Test Data To Use
Input position: 5  
Board state: position 5 is empty `" "`  
Reason: Tests normal valid gameplay move.

### Expected Test Result
The player’s symbol is placed at position 5. The board updates correctly and the turn ends with no errors.

---

## Boundry Move Placement!

Player places a bomb on an empty square on the boundry of the board.

### Test Data To Use
Input position: 1 & 12  
Board state: position 1 & 12 is empty `" "`  
Reason: Tests normal valid gameplay move on the boundry of the baord.

### Expected Test Result
The player’s symbol is placed at position 1 & 12. The board updates correctly and the turn ends with no errors.

---

## Invalid Out of Range Input

Player enters a number outside the board range.

### Test Data To Use
Input position: 0 & 13  
Reason: Tests boundary validation for board limits (1 to 12 only).

### Expected Test Result
Program prints an error message stating the space is not on the board. Player must re-enter a valid position.

---

## Invalid Occupied Space

Player tries to place on a space already taken.

### Test Data To Use
Input position: 6  
Board state: position 6 already contains `"X"` or `"O"`  
Reason: Tests invalid move rejection.

### Expected Test Result
Program prints a message saying the space is already taken. Player must choose another position.

---

## Blocked Placement Rule (Defuse Prevention Rule)

Player tries to place a piece between two opponent pieces.

### Test Data To Use
Board state:
- Position 4 = O
- Position 5 = empty
- Position 6 = O  
  Player X tries position 5  
  Reason: Tests placement restriction rule.

### Expected Test Result
Program prevents placement and prints a message saying the opponent is blocking that position.

---

## Defuse Rule Trigger

Opponent piece gets surrounded by two of the player’s pieces.

### Test Data To Use
Board state before move:
- Position 4 = X
- Position 5 = O
- Position 6 = X  
  Reason: Tests automatic removal logic.

### Expected Test Result
The O at position 5 is removed (set to blank space). Board updates correctly after `defuseAfterTurn` runs.

---

## Chain Reaction Explosion (3+ in a row)

Player creates a chain of 3 or more consecutive pieces.

### Test Data To Use
Board state after moves:
- Position 2 = X
- Position 3 = X
- Position 4 = X  
  Reason: Tests `scanChains` logic.

### Expected Test Result
All 3 X pieces are removed from the board. Player X score increases by 3.

---

## Win Condition Test

Player reaches 10 points.

### Test Data To Use
xScore or oScore = 10  
Reason: Tests game termination logic.

### Expected Test Result
Program prints a win message for the correct player and exits the game loop.

---

## Empty Board Initialization

Game starts fresh.

### Test Data To Use
Call `createSpace(space)`  
Reason: Ensures board setup works correctly.

### Expected Test Result
All 12 positions contain `" "` and the board prints empty grid correctly.

--- 

## Rejected Move on Same Spot Twice

### Test Data To Use
Input position: 4  
Board state: position 4 already contains `"X"` or `"O"`

### Expected Test Result
Program prints an error message saying the space is already taken and prompts the player to choose another position. The board does not change.

---

## Score Starts at Zero

### Test Data To Use
Start of game before any moves are made.

### Expected Test Result
Both players’ scores are displayed as 0/10. No points are awarded at the start of the game.

---

## Turn Alternation Test

### Test Data To Use
Player X makes a valid move, then Player O makes a valid move.

### Expected Test Result
The game correctly alternates turns between X and O. Each player only plays once per turn cycle, and no turns are skipped or duplicated.

--- 

## Single Defuse Removal Test

This test checks that a single opponent piece is correctly removed when it is trapped between two of the player’s pieces.

### Test Data To Use
- Board state before move:
  - Position 3 = X
  - Position 4 = O
  - Position 5 = X
- Player makes a move that triggers `defuseAfterTurn`

### Expected Test Result
The program correctly detects the trapped O piece at position 4. It is removed and replaced with `" "`. The board updates correctly after the turn with no errors.

--- 

