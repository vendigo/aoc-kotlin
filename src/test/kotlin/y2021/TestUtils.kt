package y2021

import java.io.File

fun readInput(name: String) = File("src/test/resources/2021", "$name.txt").readLines()