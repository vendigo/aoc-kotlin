package y2022

object Day03 {

    fun part1(input: List<String>): Int {
        return input.sumOf { processOneRucksack(it) }
    }

    fun part2(input: List<String>): Int {
        return input.windowed(3, 3)
            .sumOf { processThreeElves(it) }
    }

    private fun processOneRucksack(input: String): Int {
        val left = input.substring(0 until input.length / 2).toChars()
        val right = input.substring(input.length / 2).toChars()
        return left.intersect(right).first().toPriority()
    }

    private fun processThreeElves(input: List<String>): Int {
        val (first, second, third) = input.map { it.toChars() }
        return first.intersect(second)
            .intersect(third)
            .first()
            .toPriority()
    }

    private fun String.toChars(): Set<Char> = this.toCharArray().toSet()

    private fun Char.toPriority(): Int {
        if (this.isLowerCase()) {
            return this - 'a' + 1
        }
        return this - 'A' + 27
    }
}