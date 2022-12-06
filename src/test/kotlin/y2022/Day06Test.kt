package y2022

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day06Test {

    @Test
    fun part1Simple() {
        val actualResult = Day06.part1(readInput("day06Simple"))
        assertEquals(11, actualResult)
    }

    @Test
    fun part1Real() {
        val actualResult = Day06.part1(readInput("day06Real"))
        assertEquals(1655, actualResult)
    }

    @Test
    fun part2Simple() {
        val actualResult = Day06.part2(readInput("day06Simple"))
        assertEquals(26, actualResult)
    }

    @Test
    fun part2Real() {
        val actualResult = Day06.part2(readInput("day06Real"))
        assertEquals(2665, actualResult)
    }
}