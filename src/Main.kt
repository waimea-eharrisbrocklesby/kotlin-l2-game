import kotlin.io.println

/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   PROJECT NAME HERE
 * Project Author: PROJECT AUTHOR HERE
 * GitHub Repo:    https://github.com/waimea-eharrisbrocklesby/kotlin-l2-game
 * ---------------------------------------------------------------------
 * Notes:
 * PROJECT NOTES HERE
 * =====================================================================
 */

import kotlin.io.println

// Title screen
// | Prints title screen, used at the start and after evry players turn. |
fun title() {
    print("                         %@@@@@@        ".blue()); print("                                                              ".green()); println("   @@@@@@    @@@                   ".blue())
    print("                         @@    @@       ".blue()); print("                                                              ".green()); println("  @@    @@@@@@@                    ".blue())
    print("                      @@@@%    @@       ".blue()); print("                                                              ".green()); println("  @@                               ".blue())
    print("                      @@@@@@   @@%  @@  ".blue()); print("                                                              ".green()); println("  .@@@@@                           ".blue())
    print("                     @@@@@@@     @@@@   ".blue()); print("                                                              ".green()); println("  .@@@@@@                          ".blue())
    print("                     @@@@@@             ".blue()); print("                                                              ".green()); println("  %@@@@@@@+  .@@@@@@@+             ".blue())
    print("              -@@@@@@@@@@@@@        ".blue()); print("               @@@@@@  @@    @@    @@@    #@   @@    @            ".green()); println("    @@@@@@@@@@@@@@@@@@@@@@         ".blue())
    print("            @@@@@@@@@@@@@@@@@@@     ".blue()); print("              @@    =  @@    @@    @.@@   #@   @@@:  @            ".green()); println("     @@@@@@@@@@@@@@@@@@@@@@@.      ".blue())
    print("          @@@@@@@@@@@@@@@@@@@@@@@   ".blue()); print("              @@       @@@@@@@@   @@  @%  #@   @  @@ @            ".green()); println("     @@@@@@@@@@@@@@@@@@@@@@@@@     ".blue())
    print("        -@@@@@@@@@@@@@@@@@@@@@@@@@  ".blue()); print("              @@    @. @@    @@  @@@@@@@  #@   @   @@@            ".green()); println("    @@@@@@@@@@@@@@@@@@@@@@@@@@@    ".blue())
    print("       .@@@@@@@@@@@@@@@@@@@@@@@@@@@ ".blue()); print("               @@@@@@  @@    @@  @@    @@ #@   @    @@            ".green()); println("   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@   ".blue())
    print("       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@".blue()); print("                                                                  ".green()); println("  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  ".blue())
    print("      %@@@@@@@@@@@@@@@@@@@@@@@@@@@@@".blue()); print("                                                                  ".green()); println("  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@. ".blue())
    print("      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@".blue()); print("                                                                  ".green()); println(" .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ".blue())
    print("      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@".blue()); print("                                                                  ".green()); println(" .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ".blue())
    print("      .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@".blue()); print("                                                                  ".green()); println("  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  ".blue())
    print("       @@@@@@@@@@@@@@@@@@@@@@@@@@@@ ".blue()); print(" @@@@@@   @@@@@@   @@@     @@@@@@ @@@@@@@  @@  :@@@@@@   @@@   @@ ".green()); println("  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  ".blue())
    print("        @@@@@@@@@@@@@@@@@@@@@@@@@@@ ".blue()); print(" @@   @=  @       :@ @@   @@         @@    @@  @@    @@  @@@@  @@ ".green()); println("   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@   ".blue())
    print("         @@@@@@@@@@@@@@@@@@@@@@@@@  ".blue()); print(" @@@@@    @@@@@   @@  @@  @@         @@    @@ .@     @@  @@ @@ @@ ".green()); println("    @@@@@@@@@@@@@@@@@@@@@@@@@@@.   ".blue())
    print("          @@@@@@@@@@@@@@@@@@@@@@    ".blue()); print(" @@  @@   @      @@@@@@@  @@    @@   @@    @@  @@    @@  @@  @@@@ ".green()); println("     @@@@@@@@@@@@@@@@@@@@@@@@@     ".blue())
    print("            =@@@@@@@@@@@@@@@@@      ".blue()); print(" @@   @@  @@@@@@ @=    @@  +@@@@*    @@    @@   @@@@@.   @@   #@@ ".green()); println("       @@@@@@@@@@@@@@@@@@@@@.      ".blue())
    print("                @@@@@@@@@@%         ".blue()); print("                                                                  ".green()); println("         @@@@@@@@@@@@@@@@@         ".blue())
    print("                                    ".blue()); print("                                                                  ".green()); println("             +@@@@@@@*             ".blue())
}

//Print Rules
// | Prints Rules with colors, used at the start of the game |
fun Rules() {

    println("Game Setup".blue())
    println("- A row of 12 squares, numbered 1 to 12 from left to right".green())
    println("- The board starts empty".green())
    println("- Both players have a supply of 'bombs' (counters) in their own colour".green())
    println("- Decide who goes first".green())
    println("")
    println("Gameplay".blue())
    println("- Players take turns - You may not skip your turn".green())
    println("- On your turn you must place one of your bombs on an empty square, but ...".green())
    println("- You cannot place your bomb directly between two opponent bombs since it would immediately be 'defused' (see the defuse rule below)".green())
    println("- After placing, the following rules apply (in order):".green())
    println("- Defuse rule:  if any opponent bomb now has one of your bombs on each side, it is 'defused' and removed from the board (note: two bombs can be defused in one go)".green())
    println("- Chain reaction rule: if your bomb creates an unbroken chain of 3 or more of your own bombs, the entire chain 'explodes' - all bombs in the chain are removed and you score points equal to the length of the chain".green())
    println("")
    println("Win Condition".blue())
    println("- The first player to reach 10 points wins".green())
}

//Playble space list
// | Creates list with 12 playable spaces and fills them with `" "` (blank) |
fun createSpace(space: MutableList<String>) {
    for (i in 1..12) {
        space.add(" ")
    }
}


//Style game board
// | creates the game board with style, used every turn. |
fun printspace(space: List<String>) {
    println("   1     2     3     4     5     6     7     8     9     10    11    12".blue())
    println("╔═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╦═════╗".green())
    print("║ ".green())
    for (space in space) {
        print(space.padEnd(3))
        print(" ║ ".green())
    }
    println()
    println("╚═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╩═════╝".green())
        // ive made the styled part of the board as just a print line as it is more effient then having it generate, although it does remove adaptive styling with board size.
}


// scoring scanner
// | scans the board for 3 counters in a row or more |
// | gives points and saves positions to delete later |
fun scanChains(space: List<String>, playerSymbol: String): Pair<Int, List<Int>> {

    var points = 0
    val positionsToRemove = mutableListOf<Int>()
    var i = 0

    while (i < 12) {
        if (space[i] == playerSymbol) {  // found player counter
            var chainLength = 1
            var next = i + 1

            // seeinh how long chain is
            while (next < 12 && space[next] == playerSymbol) {
                chainLength++
                next++
            }

            // if chain is 3 or more
            if (chainLength >= 3) {
                points += chainLength

                // save all positions so we can remove later
                for (j in i until i + chainLength) {
                    positionsToRemove.add(j)
                }
            }

            // skip past chain
            i += chainLength
        } else {
            i++
        }
    }

    return Pair(points, positionsToRemove)
}

// exploading couters
// | gets counter that where saved earlier from the scan chains function and replaces them with `" "` (blank space) as |
// | if they have exploaded. this is used after evry turn.                                                             |
fun ExplodeCounter(space: MutableList<String>, positions: List<Int>) {
    val uniquePositions = positions.distinct()
    for (index in uniquePositions) {
        space[index] = " "
    }
}

// defusing players
// | scans the board for a player with its opponent on the spaces of either side of it then deletes it. |
// | This is used after every turn.                                                                        |
fun defuseAfterTurn(space: MutableList<String>) {

    for (i in 0..11) {

        if (space[i] != " ") {

            // check that not at edged
            if (i > 0 && i < 11) {

                val current = space[i]
                val left = space[i - 1]
                val right = space[i + 1]

                // if x is trapped by O
                if (current == "X") {
                    if (left == "O" && right == "O") {
                        space[i] = " "
                    }
                }

                // O is traped by X
                if (current == "O") {
                    if (left == "X" && right == "X") {
                        space[i] = " "
                    }
                }

            }
        }
    }
}

// Show scores
// | prints a styled score board with veriable scores, this is used after every turn |
fun ShowScores(xScore: Int, oScore: Int) {
    println("╔═════════╦═════════╗")
    println("║    X    ║    O    ║")
    println("║   $xScore/10  ║   $oScore/10  ║")
    println("╚═════════╩═════════╝")
}

// board padding
// | adds a small board padding, used multiple times after evry turn. |
fun boardpadding() {
    println()
    println()
}  // made this function as i constantly needed a double line space and didnt want to qrite as much

// Big spacer
// | adds a really big space, used between every turn, this is used as it adds a big space between each turn so it  |
// | apears that the board is the same one just with a change made to it, (makes smother game play)                 |
fun bigspace() {
    for (i in 1..30) {
        println("")
    } // made this is a loop as 30 "println("")" in a row would take up uneeded space
} // this function was made so I dont need to make the for loop 2 times as it has been used twice in the code

// Main
// | runs the main code and calls to all the other functions |
fun main() {
    val space = mutableListOf<String>()
    var xScore = 0
    var oScore = 0

    createSpace(space)

    title()
    boardpadding()

    Rules()

    println("Do You whish to play? [Y] [N]")
    print("Choice: ")
    val choice = readln().first().uppercaseChar()

    when (choice) {
        'Y' -> {
            while (true) {
                bigspace()
                title()
                boardpadding()
                ShowScores(xScore, oScore)
                boardpadding()
                printspace(space)

                while (true) {
                    println()
                    println("Player (X) Turn")
                    print("where would you like to play: ")

                    val positionX = readln().toInt()

                    if (positionX in 1..12) {
                        val ListPosition = positionX - 1

                        if (space[ListPosition] == " ") {

                            val leftBlocked = if (ListPosition > 0) {
                                space[ListPosition - 1] == "O"
                            } else false

                            val rightBlocked = if (ListPosition < space.size - 1) {
                                space[ListPosition + 1] == "O"
                            } else false

                            if (leftBlocked && rightBlocked) {
                                println("You cannot place here O is blocking you")
                            } else {

                                space[ListPosition] = "X"

                                defuseAfterTurn(space)

                                val resultX = scanChains(space, "X")
                                xScore += resultX.first
                                ExplodeCounter(space, resultX.second)

                                break
                            }

                        } else {
                            println("Someone has aleady played there, pick a new square")
                        }
                    } else {
                        println("That space is not on the board! pick a new one")
                    }
                }

            if (xScore >= 10){
                println("wow player X wins ceazy")
                break
                // wanted to make a cool you win page but ran out of time
            }
                bigspace()
                title()
                boardpadding()
                ShowScores(xScore, oScore)
                boardpadding()
                printspace(space)

                while (true) {
                    println()
                    println("Player (O) Turn")
                    print("where would you like to play: ")

                    val positionO = readln().toInt()

                    if (positionO in 1..12) {
                        val ListPosition = positionO - 1

                        if (space[ListPosition] == " ") {

                            val leftBlocked = if (ListPosition > 0) {
                                space[ListPosition - 1] == "X"
                            } else false

                            val rightBlocked = if (ListPosition < space.size - 1) {
                                space[ListPosition + 1] == "X"
                            } else false

                            if (leftBlocked && rightBlocked) {
                                println("You cannot place here X is blocking you")
                            } else {

                                space[ListPosition] = "O"

                                defuseAfterTurn(space)

                                val resultO = scanChains(space, "O")
                                oScore += resultO.first
                                ExplodeCounter(space, resultO.second)

                                break
                            }

                        } else {
                            println("Someone has aleady played there, pick a new square")
                        }

                    } else {
                        println("That space is not on the board! pick a new one")
                    }
                }

            if (oScore >= 10){
                println("wow player O wins ceazy")
                break
                // wanted to make a cool you win page but ran out of time
            }

            }
        } // The reason i have repeated code for each players turn is beacuse mainly i ran out of time, but i started this way as its easier to make blocks of code as they dont need to adapt to each, i understand its more inaficent but it made dovelepment esier, if i where to come back to this i would correct this and make 1 block work for each player.

        'N' -> {
            println("That's Okay, Come back another time!")
        }
    }
}
