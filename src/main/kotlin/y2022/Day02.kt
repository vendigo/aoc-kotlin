package y2022

object Day02 {

    private val OUTCOMES = mapOf(
        "A X" to 1 + 3,
        "A Y" to 2 + 6,
        "A Z" to 3 + 0,

        "B X" to 1 + 0,
        "B Y" to 2 + 3,
        "B Z" to 3 + 6,

        "C X" to 1 + 6,
        "C Y" to 2 + 0,
        "C Z" to 3 + 3,
    )
    //rock paper scissors
    private val OUTCOMES2 = mapOf(
        "A X" to 3 + 0,
        "A Y" to 1 + 3,
        "A Z" to 2 + 6,

        "B X" to 1 + 0,
        "B Y" to 2 + 3,
        "B Z" to 3 + 6,

        "C X" to 2 + 0,
        "C Y" to 3 + 3,
        "C Z" to 1 + 6,
    )

    fun part1(input: List<String>): Int {
        return input.map { OUTCOMES[it]!! }
            .sumOf { it }
    }

    fun part2(input: List<String>): Int {
        return input.map { OUTCOMES2[it]!! }
            .sumOf { it }
    }


}