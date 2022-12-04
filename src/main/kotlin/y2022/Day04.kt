package y2022

object Day04 {

    private val PAIR_TEMPLATE = "(\\d+)-(\\d+),(\\d+)-(\\d+)".toRegex()

    fun part1(input: List<String>): Int {
        return input.count { fullyContains(it) }
    }

    fun part2(input: List<String>): Int {
        return input.count { overlaps(it) }
    }

    private fun overlaps(pair: String): Boolean {
        val (i1, i2) = readIntervals(pair)
        return i1.intersect(i2).isNotEmpty()
    }

    private fun fullyContains(pair: String): Boolean {
        val (i1, i2) = readIntervals(pair)
        return i1.containsAll(i2) || i2.containsAll(i1)
    }

    private fun readIntervals(pair: String): Pair<Set<Int>, Set<Int>> {
        val (b1, e1, b2, e2) = PAIR_TEMPLATE.find(pair)!!.groupValues
            .drop(1)
            .map { it.toInt() }
        val i1 = (b1..e1).toCollection(mutableSetOf())
        val i2 = (b2..e2).toCollection(mutableSetOf())
        return Pair(i1, i2)
    }
}