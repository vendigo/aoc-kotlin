package y2022

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day07Test {

    @Test
    fun part1Simple() {
        val actualResult = Day07.part1(readInput("day07Simple"))
        assertEquals(95437, actualResult)
    }

    @Test
    fun part1Real() {
        val actualResult = Day07.part1(readInput("day07Real"))
        assertEquals(2061777, actualResult)
    }

    @Test
    fun part2Simple() {
        val actualResult = Day07.part2(readInput("day07Simple"))
        assertEquals(24933642, actualResult)
    }

    @Test
    fun part2Real() {
        val actualResult = Day07.part2(readInput("day07Real"))
        assertEquals(4473403, actualResult)
    }
}