package y2022

import java.util.*

object Day05 {

    private val COMMAND_PATTERN = "move (\\d+) from (\\d) to (\\d)".toRegex()

    fun part1(input: List<String>): String {
        val stacks = readStacks(input)
        moveCrates(input) { count, fromI, toI ->
            repeat(count) {
                val crate = stacks[fromI].removeLast()
                stacks[toI].addLast(crate)
            }
        }

        return stacks.map { it.last }.joinToString("")
    }

    fun part2(input: List<String>): String {
        val stacks = readStacks(input)
        val additionalStack = ArrayDeque<Char>()
        moveCrates(input) { count, fromI, toI ->
            repeat(count) {
                val crate = stacks[fromI].removeLast()
                additionalStack.addLast(crate)
            }
            repeat(count) {
                val crate = additionalStack.removeLast()
                stacks[toI].addLast(crate)
            }
        }

        return stacks.map { it.last }.joinToString("")
    }

    private fun readStacks(input: List<String>): Array<ArrayDeque<Char>> {
        val stackNumsLineIndex = input.indexOfFirst { it.startsWith(" 1") }
        val stackNum = input[stackNumsLineIndex]
            .split(" ")
            .count { it.isNotBlank() }

        val stacks = Array(stackNum) {
            ArrayDeque<Char>()
        }

        val crates = input.subList(0, stackNumsLineIndex).reversed()
        for (crate in crates) {
            for (i in 0 until stackNum) {
                val element = crate.getIndexed(crateIndex(i))
                if (element.isPresent) {
                    stacks[i].addLast(element.get())
                }
            }
        }

        return stacks
    }

    private fun moveCrates(input: List<String>, action: (count: Int, fromI: Int, toI: Int) -> Unit) {
        input.filter { it.startsWith("move") }
            .forEach { command ->
                val (count, fromI, toI) = COMMAND_PATTERN.find(command)!!.groupValues
                    .drop(1)
                    .map { it.toInt() }
                action(count, fromI - 1, toI - 1)
            }
    }

    private fun crateIndex(i: Int) = 1 + 4 * i

    private fun String.getIndexed(i: Int): Optional<Char> {
        if (i >= this.length || this[i].isWhitespace()) {
            return Optional.empty<Char>()
        }
        return Optional.of(this[i])
    }
}