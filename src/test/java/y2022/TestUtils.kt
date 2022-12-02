package y2022

import java.io.File

fun readInput(name: String) = File("src/test/resources/2022", "$name.txt").readLines()