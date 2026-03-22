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

fun main() {
    val space = mutableListOf<String>()//play space difine thingy
    createSpace(space)

    println("╔══════════════════╗")
    println("║  Chain reaction! ║ ")
    println("╚══════════════════╝")
    println( )
    println( )

    println("Do You whish to play? [Y] [N]")
    print("Choice: ")
    val choice = readln().first().uppercaseChar()
    when (choice) {
        'Y' -> {
            println()
            println()
            printspace(space)

            println()
            println("Player (X) Start: ")
            print("where would you like to play: ")
            // rest of game
        }
        'N' -> {
            println("That's Okay, Come back another time!")
        }
    }

}


