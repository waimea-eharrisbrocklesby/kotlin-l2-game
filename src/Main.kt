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

// ✅ FIXED
fun ShowScores(xScore: Int, oScore: Int) {
    println("╔═════════╦═════════╗")
    println("║    X    ║    O    ║")
    println("║   $xScore/10  ║   $oScore/10  ║")
    println("╚═════════╩═════════╝")
}

fun boardpadding() {
    println()
    println()
}

fun bigspace() {
    for (i in 1..40) {
        println("")
    }
}

fun main() {
    val space = mutableListOf<String>()
    var xScore = 0
    var oScore = 0

    createSpace(space)

    title()
    boardpadding()

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
                // you win crazy anamation
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
                // you win crazy anamation
            }

            }
        }

        'N' -> {
            println("That's Okay, Come back another time!")
        }
    }
}
