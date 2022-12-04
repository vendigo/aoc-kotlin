package y2022

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day02Test {

    @Test
    fun part1Simple() {
        val actualResult = Day02.part1(readInput("day02Simple"))
        assertEquals(15, actualResult)
    }

    @Test
    fun part1Real() {
        val actualResult = Day02.part1(readInput("day02Real"))
        assertEquals(14375, actualResult)
    }

    @Test
    fun part2Simple() {
        val actualResult = Day02.part2(readInput("day02Simple"))
        assertEquals(12, actualResult)
    }

    @Test
    fun part2Real() {
        val actualResult = Day02.part2(readInput("day02Real"))
        assertEquals(10274, actualResult)
    }
}