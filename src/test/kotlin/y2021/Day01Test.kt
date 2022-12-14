package y2021

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day01Test {

    @Test
    fun part1Simple() {
        val actualResult = Day01.part1(readInput("day1Simple"))
        assertEquals(7, actualResult)
    }

    @Test
    fun part1Real() {
        val actualResult = Day01.part1(readInput("day1Real"))
        assertEquals(1616, actualResult)
    }

    @Test
    fun part2Simple() {
        val actualResult = Day01.part2(readInput("day1Simple"))
        assertEquals(5, actualResult)
    }

    @Test
    fun part2Real() {
        val actualResult = Day01.part2(readInput("day1Real"))
        assertEquals(1645, actualResult)
    }
}