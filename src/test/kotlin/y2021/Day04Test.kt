package y2021

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day04Test {

    @Test
    fun part1Simple() {
        val actualResult = Day04.part1(readInput("day4Simple"))
        assertEquals(4512, actualResult)
    }

    @Test
    fun part1Real() {
        val actualResult = Day04.part1(readInput("day4Real"))
        assertEquals(39984, actualResult)
    }

    @Test
    fun part2Simple() {
        val actualResult = Day04.part2(readInput("day4Simple"))
        assertEquals(1924, actualResult)
    }

    @Test
    fun part2Real() {
        val actualResult = Day04.part2(readInput("day4Real"))
        assertEquals(8468, actualResult)
    }
}