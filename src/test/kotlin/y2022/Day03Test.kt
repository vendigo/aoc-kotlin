package y2022

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day03Test {

    @Test
    fun part1Simple() {
        val actualResult = Day03.part1(readInput("day03Simple"))
        assertEquals(157, actualResult)
    }

    @Test
    fun part1Real() {
        val actualResult = Day03.part1(readInput("day03Real"))
        assertEquals(7903, actualResult)
    }

    @Test
    fun part2Simple() {
        val actualResult = Day03.part2(readInput("day03Simple"))
        assertEquals(70, actualResult)
    }

    @Test
    fun part2Real() {
        val actualResult = Day03.part2(readInput("day03Real"))
        assertEquals(2548, actualResult)
    }
}