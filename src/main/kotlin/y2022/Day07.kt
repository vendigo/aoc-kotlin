package y2022

object Day07 {

    private var folderSizes = mutableListOf<Long>()

    fun part1(input: List<String>): Long {
        val fileTree = buildFileTree(input)
        countFileSizes(fileTree)
        return folderSizes.filter { it < 100000 }
            .sum()
    }

    fun part2(input: List<String>): Long {
        val fileTree = buildFileTree(input)
        countFileSizes(fileTree)
        val needToFreeUp = fileTree.fileSize!! - 40000000
        return folderSizes.filter { it >= needToFreeUp }
            .min()
    }

    private fun countFileSizes(node: Node) {
        var folderSize = 0L
        for (child in node.children) {
            if (child.fileSize == null) {
                countFileSizes(child)
            }
            folderSize += child.fileSize!!
        }
        folderSizes += folderSize
        node.fileSize = folderSize
    }

    private fun buildFileTree(input: List<String>): Node {
        val commands = input.drop(1)
        val root = Node(Type.FOLDER, "root")
        var node = root

        for (command in commands) {
            if (command.startsWith("$ cd")) {
                val cdTo = command.substring(5)
                if (cdTo == "..") {
                    node = node.parent!!
                    continue
                }
                node = node.children.first { it.name == cdTo }
                continue
            }
            if (!command.startsWith("$")) {
                if (command.startsWith("dir")) {
                    val folderName = command.substring(4)
                    node.children.add(Node(Type.FOLDER, folderName, null, node))
                    continue
                }
                val (fileSize, fileName) = command.split(" ")
                node.children.add(Node(Type.FILE, fileName, fileSize.toLong(), node))
            }
        }

        return root
    }

    data class Node(val type: Type, var name: String,
                    var fileSize: Long? = null,
                    var parent: Node? = null, var children: MutableList<Node> = mutableListOf()
    )

    enum class Type {
        FOLDER, FILE
    }
}