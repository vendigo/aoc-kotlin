package y2022

object Day08 {

    fun part1(input: List<String>): Int {
        val field = readField(input)
        checkVisibility(field)

        return field.flatten()
            .count {it.visible}
    }

    fun part2(input: List<String>): Int {
        return 0
    }

    private fun readField(input: List<String>): Array<Array<Cell>> = Array(input.size) { rowIndex ->
        val row = input[rowIndex]
        Array(row.length) { columnIndex ->
            Cell(row[columnIndex].digitToInt())
        }
    }

    private fun checkVisibility(field: Array<Array<Cell>>) {
        val max = field.size - 1
        checkVisibility(field, 0..max, 0..max, true) {
            it.leftVisible = true
        }
        checkVisibility(field, max downTo 0, 0..max, true) {
            it.rightVisible = true
        }
        checkVisibility(field, 0..max, 0..max, false) {
            it.topVisible = true
        }
        checkVisibility(field, max downTo 0, 0..max, false) {
            it.botVisible = true
        }
    }

    private fun checkVisibility(
        field: Array<Array<Cell>>, iRange: IntProgression, jRange: IntProgression,
        firstX: Boolean, visibilitySetter: (Cell) -> Unit
    ) {
        for (j in jRange) {
            var maxHeight = -1

            for (i in iRange) {
                val cell = if (firstX) field[j][i] else field[i][j]
                if (cell.height > maxHeight) {
                    visibilitySetter(cell)
                    maxHeight = cell.height
                }
            }
        }
    }

    data class Cell(
        val height: Int,
        var leftVisible: Boolean = false,
        var topVisible: Boolean = false,
        var rightVisible: Boolean = false,
        var botVisible: Boolean = false
    ) {
        val visible get() = leftVisible || topVisible || rightVisible || botVisible
    }
}