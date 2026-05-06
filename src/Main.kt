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

fun createSpace(space: MutableList<String>) {
    for (i in 1..12) {
        space.add(" ")
    }
}

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

fun scanChains(space: List<String>, playerSymbol: String): Pair<Int, List<Int>> {

    var points = 0
    var streak = 0
    var startIndex = -1

    val positionsToRemove = mutableListOf<Int>()

    for (i in space.indices) {

        if (space[i] == playerSymbol) {

            if (streak == 0) {
                startIndex = i
            }

            streak++

        } else {

            if (streak >= 3) {
                points += streak

                for (j in startIndex until startIndex + streak) {
                    positionsToRemove.add(j)
                }
            }

            streak = 0
            startIndex = -1
        }
    }

    if (streak >= 3) {
        points += streak

        for (j in startIndex until startIndex + streak) {
            positionsToRemove.add(j)
        }
    }

    return Pair(points, positionsToRemove)
}

fun ExplodeCounter(space: MutableList<String>, positions: List<Int>) {
    val uniquePositions = positions.distinct()
    for (index in uniquePositions) {
        space[index] = " "
    }
}

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

fun ShowScores(xScore: Int, oScore: Int) {
    println("╔═════════╦═════════╗")
    println("║    X    ║    O    ║")
    println("║   $xScore/10  ║   $oScore/10  ║")
    println("╚═════════╩═════════╝")
}

fun boardpadding() {
    println()
    println()
}  // made this function as i constantly needed a double line space and didnt want to qrite as much

fun bigspace() {
    for (i in 1..30) {
        println("")
    } // made this is a loop as 30 "println("")" in a row would take up uneeded space
} // this function was made so I dont need to make the for loop 2 times as it has been used twice in the code

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
