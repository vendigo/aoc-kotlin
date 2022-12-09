package y2022

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day08Test {

    @Test
    fun part1Simple() {
        val actualResult = Day08.part1(readInput("day08Simple"))
        assertEquals(21, actualResult)
    }

    @Test
    fun part1Real() {
        val actualResult = Day08.part1(readInput("day08Real"))
        assertEquals(1708, actualResult)
    }

    @Test
    fun part2Simple() {
        val actualResult = Day08.part2(readInput("day08Simple"))
        assertEquals(8, actualResult)
    }

    @Test
    fun part2Real() {
        val actualResult = Day08.part2(readInput("day08Real"))
        assertEquals(0, actualResult)
    }
}