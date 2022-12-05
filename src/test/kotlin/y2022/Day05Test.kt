package y2022

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day05Test {

    @Test
    fun part1Simple() {
        val actualResult = Day05.part1(readInput("day05Simple"))
        assertEquals("CMZ", actualResult)
    }

    @Test
    fun part1Real() {
        val actualResult = Day05.part1(readInput("day05Real"))
        assertEquals("VGBBJCRMN", actualResult)
    }

    @Test
    fun part2Simple() {
        val actualResult = Day05.part2(readInput("day05Simple"))
        assertEquals("MCD", actualResult)
    }

    @Test
    fun part2Real() {
        val actualResult = Day05.part2(readInput("day05Real"))
        assertEquals("LBBVJBRMH", actualResult)
    }
}