package y2022

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day04Test {

    @Test
    fun part1Simple() {
        val actualResult = Day04.part1(readInput("day04Simple"))
        assertEquals(2, actualResult)
    }

    @Test
    fun part1Real() {
        val actualResult = Day04.part1(readInput("day04Real"))
        assertEquals(471, actualResult)
    }

    @Test
    fun part2Simple() {
        val actualResult = Day04.part2(readInput("day04Simple"))
        assertEquals(4, actualResult)
    }

    @Test
    fun part2Real() {
        val actualResult = Day04.part2(readInput("day04Real"))
        assertEquals(888, actualResult)
    }
}