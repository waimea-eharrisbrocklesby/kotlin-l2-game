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

## Invalid Out of Range Input

Player enters a number outside the board range.

### Test Data To Use
Input position: 0 or 13  
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