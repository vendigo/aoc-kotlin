package y2022

object Day01 {

    fun part1(input: List<String>): Int {
        val sums = countSums(input)
        return sums.maxOf { it }
    }

    fun part2(input: List<String>): Int {
        val sums = countSums(input)
        val sortedSums = sums.sortedDescending()
        return sortedSums[0] + sortedSums[1] + sortedSums[2]
    }

    fun countSums(input: List<String>): List<Int> {
        val sums = mutableListOf<Int>()
        var currentSum = 0

        for (v in input) {
            if (v.isEmpty()) {
                sums += currentSum
                currentSum = 0
                continue
            }
            currentSum += v.toInt()
        }
        sums += currentSum

        return sums
    }
}