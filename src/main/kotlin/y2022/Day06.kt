package y2022

object Day06 {

    fun part1(input: List<String>): Int {
        return lastNDifferentPosition(input.first(), 4)
    }

    fun part2(input: List<String>): Int {
        return lastNDifferentPosition(input.first(), 14)
    }

    private fun lastNDifferentPosition(input: String, n: Int): Int {
        val lastN = ArrayDeque<Char>()

        for ((i, c) in input.toCharArray().withIndex()) {
            if (lastN.size == n) {
                lastN.removeFirst()
            }
            lastN.addLast(c)
            if (lastN.isAllDifferent() && lastN.size == n) {
                return i + 1
            }
        }

        return 0
    }

    private fun ArrayDeque<Char>.isAllDifferent() = this.toSet().size == this.size
}