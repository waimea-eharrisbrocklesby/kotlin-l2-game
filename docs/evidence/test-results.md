# Results of Testing

The test results show the actual outcome of the testing, following the [Test Plan](test-plan.md)

---

## Valid Move Placement

This test checks that a player can place a bomb on an empty space within the valid board range.

### Test Data Used

- Input position: 5
- Board state before move: position 5 contains `" "`
- Player: X

### Test Result

![Screencast+From+2026-05-07+10-09-55.gif](screenshots/Screencast%2BFrom%2B2026-05-07%2B10-09-55.gif)

The program successfully placed the player symbol at position 5. The board updated correctly and the turn completed without errors.

---

## Boundry Move Placement!

This test checks that a player can place a bomb on an empty space on the boundry of the board.

### Test Data Used

- Input position: 1 & 12
- Board state before move: position 1 & 12 contains `" "`
- Player

### Test Result

![Screencast+From+2026-05-07+12-18-21.gif](screenshots/Screencast%2BFrom%2B2026-05-07%2B12-18-21.gif)

The program successfully placed the player symbol at position 1 & 12. The board updated correctly and the turn completed without errors.

---

## Invalid Out of Range Input

This test checks that the program rejects numbers outside the board range.

### Test Data Used

- Input position: 0
- Input position: 13

### Test Result

![Screencast+From+2026-05-07+10-14-37(1).gif](screenshots/Screencast%2BFrom%2B2026-05-07%2B10-14-37%281%29.gif)

The program displayed an error message stating that the position was not on the board. The player was asked to enter another valid position.

---

## Invalid Occupied Space

This test checks that players cannot place a piece on a space that is already occupied.

### Test Data Used

- Input position: 6
- Board state before move: position 6 already contains `"X"`

### Test Result

![Screencast+From+2026-05-07+10-17-53.gif](screenshots/Screencast%2BFrom%2B2026-05-07%2B10-17-53.gif)

The program correctly rejected the move and displayed a message saying the space was already taken. The player was required to choose another position.

---

## Blocked Placement Rule (Defuse Prevention Rule)

This test checks that a player cannot place a piece between two opponent pieces.

### Test Data Used

Board state before move:
- Position 4 = O
- Position 5 = `" "`
- Position 6 = O

Player X attempted to place at position 5.

### Test Result

![Screencast+From+2026-05-07+10-22-44.gif](screenshots/Screencast%2BFrom%2B2026-05-07%2B10-22-44.gif)

The program prevented the placement and displayed a message explaining that the opponent was blocking that position.

---

## Defuse Rule Trigger

This test checks that a surrounded opponent piece is removed correctly.

### Test Data Used

Board state before defuse:
- Position 4 = X
- Position 5 = O
- Position 6 = X

### Test Result

![Screencast+From+2026-05-07+10-26-02.gif](screenshots/Screencast%2BFrom%2B2026-05-07%2B10-26-02.gif)

The program correctly removed the O piece at position 5 after the turn ended. The board updated correctly with the space reset to blank.

---

## Chain Reaction Explosion (3+ in a row)

This test checks that three consecutive pieces are removed and points are awarded correctly.

### Test Data Used

Board state before chain scan:
- Position 2 = X
- Position 3 = X
- Position 4 = X

### Test Result

![Screencast+From+2026-05-07+10-29-05.gif](screenshots/Screencast%2BFrom%2B2026-05-07%2B10-29-05.gif)

The program detected the chain of three X pieces and removed them from the board. Player X’s score increased by 3 points.

---

## Win Condition Test

This test checks that the game ends correctly when a player reaches 10 points.

### Test Data Used

- X score = 10

### Test Result

![Screencast+From+2026-05-07+10-32-05.gif](screenshots/Screencast%2BFrom%2B2026-05-07%2B10-32-05.gif)

The program displayed the correct win message for Player X and ended the game loop successfully.

---

## Empty Board Start up This test checks that the board is initialized correctly when the game starts.

### Test Data Used

- Function called: `createSpace(space)`

### Test Result

![Screencast+From+2026-05-07+10-37-38.gif](screenshots/Screencast%2BFrom%2B2026-05-07%2B10-37-38.gif)

The program correctly filled all 12 board positions with blank spaces and displayed the empty board layout properly.

---

## Rejected Move on Same Spot Twice

This test checks that the program does not allow a player to place a piece on an already occupied space.

### Test Data Used

- Input position: 4
- Board state before move: position 4 contains `"X"` or `"O"`

### Test Result

![Screencast+From+2026-05-07+13-14-37.gif](screenshots/Screencast%2BFrom%2B2026-05-07%2B13-14-37.gif)

The program correctly rejected the move and displayed an error message saying the space was already taken. The player was prompted to choose a different position and the board did not change.

---

## Score Starts at Zero

This test checks that both players start the game with a score of zero.

### Test Data Used

- Game start before any moves are made

### Test Result

![Screencast+From+2026-05-07+13-17-29.gif](screenshots/Screencast%2BFrom%2B2026-05-07%2B13-17-29.gif)

The program displayed both Player X and Player O scores as 0/10 at the start of the game. No points were incorrectly added before gameplay begins.

---

## Turn Alternation Test

This test checks that turns correctly switch between Player X and Player O.

### Test Data Used

- Player X makes a valid move
- Player O makes a valid move

### Test Result

![Screencast+From+2026-05-07+13-19-12.gif](screenshots/Screencast%2BFrom%2B2026-05-07%2B13-19-12.gif)

The program correctly alternated turns between Player X and Player O. Each player was only allowed to play once per turn cycle, and the game continued without skipping or repeating turns.

--- 

## Single Defuse Removal Test

This test checks that a single opponent piece is correctly removed when it is trapped between two of the player’s pieces.

### Test Data To Use

- Board state before move:
    - Position 3 = X
    - Position 4 = O
    - Position 5 = X
- Player makes a move that triggers `defuseAfterTurn`

### Test Result

![Screencast+From+2026-05-07+14-17-23.gif](screenshots/Screencast%2BFrom%2B2026-05-07%2B14-17-23.gif)

The program correctly detected the trapped O piece at position 4. It was removed and replaced with `" "`. The board updated correctly after the turn and no errors occurred. The defuse rule worked as expected.