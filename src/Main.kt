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

fun boardpadding() {
    println()
    println()
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
            while (true) { //-----------------------------------------------------------------------------
                    boardpadding()
                    printspace(space)

                while (true) {
                    println()
                    println("Player (X) Turn")
                    print("where would you like to play: ")

                    val PositionInputx = readln()
                    val positionX = PositionInputx.toInt()

                    if (positionX in 1..12) { // makes sure number is on the board
                        val ListPosition = positionX - 1 // count starts from 0 this aligns it

                        if (space[ListPosition] == " ") {

                            val leftBlocked = if (ListPosition > 0) {
                                space[ListPosition - 1] == "O"  // checks for O on the left
                            } else {
                                false // no play space on the left
                            }

                            val rightBlocked = if (ListPosition < space.size - 1) {
                                space[ListPosition + 1] == "O"   // cheks if there is player on the left
                            } else {
                                false // no space on the right, so cannot be blocked
                            }

                            // if both left block and right block  then it dosnt allow move
                            if (leftBlocked && rightBlocked) {
                                println("You cannot place here O is blocking you")
                            } else {

                                // if NOT blocked place the X
                                space[ListPosition] = "X"
                                break
                            }

                        } else {
                            println("Someone has aleady played there, pick a new square")
                        }
                    } else {
                        println("That space is not on the board! pick a new one")
                    }
                }


                    //------------------------------------
                    //---------------O play -------------
                    //------------------------------------

                    boardpadding()
                    printspace(space)

                while (true) {
                    println()
                    println("Player (O) Turn")
                    print("where would you like to play: ")

                    val PositionInputO = readln()
                    val positionO = PositionInputO.toInt()

                    if (positionO in 1..12) { // makes sure number is on the board
                        val ListPosition = positionO - 1 // count starts from 0 this aligns it

                        if (space[ListPosition] == " ") {

                            val leftBlocked = if (ListPosition > 0) {
                                space[ListPosition - 1] == "X"  // checks for O on the left
                            } else {
                                false // no play space on the left
                            }

                            val rightBlocked = if (ListPosition < space.size - 1) {
                                space[ListPosition + 1] == "X"   // cheks if there is player on the left
                            } else {
                                false // no space on the right, so cannot be blocked
                            }

                            // if both left block and right block  then it dosnt allow move
                            if (leftBlocked && rightBlocked) {
                                println("You cannot place here X is blocking you")
                            } else {

                                // if NOT blocked, place the X
                                space[ListPosition] = "O"

                                //--------------------------
                                //kick player spot
                                //----------------

                                //-----------------------

                               break
                            }

                        } else {
                        println("Someone has aleady played there, pick a new square")
                        }

                    } else {
                        println("That space is not on the board! pick a new one")
                    }

                }
            }
        } // end of if you want to play

        'N' -> {
            println("That's Okay, Come back another time!")
        } // end of if you dont wanna play
    }

}


