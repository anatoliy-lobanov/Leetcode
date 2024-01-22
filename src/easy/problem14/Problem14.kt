package easy.problem14

/**
 * 14. Longest Common Prefix
 */
fun main() {
    val solution = Solution()

    // test1
    val test1 = solution.longestCommonPrefix(strs = arrayOf("flower", "flow", "flight"))
    println("Test1 = $test1")

    // test2
    val test2 = solution.longestCommonPrefix(strs = arrayOf("dog", "racecar", "car"))
    println("Test2 = $test2")

    // test3 (my)
    val test3 = solution.longestCommonPrefix(strs = arrayOf("toyoyo", "toy", "toyo"))
    println("Test3 = $test3")

    // test4 (my)
    val test4 = solution.longestCommonPrefix(strs = arrayOf("toyoyo", "", "toyo"))
    println("Test4 = $test4")
}

private class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val selector: (String) -> Int = { str -> str.length }
        strs.sortBy(selector)

        val firstStr = strs[0]

        var index = 1
        var longestCommonPrefix = ""
        var matchingHappened = true

        while (index < firstStr.length + 1 && matchingHappened) {
            val comparingPart = firstStr.substring(0, index)
            matchingHappened = strs.all { it.startsWith(comparingPart) }

            if (matchingHappened) {
                longestCommonPrefix = comparingPart
                index++
            } else {
                break
            }
        }

        return longestCommonPrefix
    }
}