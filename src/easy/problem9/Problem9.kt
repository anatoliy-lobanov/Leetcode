package easy.problem9

/**
 * 9. Palindrome Number
 */
fun main() {
    val solution = Solution()

    // test1
    val test1 = solution.isPalindrome(x = 121)
    println("Test1 = $test1")

    // test2
    val test2 = solution.isPalindrome(x = -121)
    println("Test2 = $test2")

    // test3
    val test3 = solution.isPalindrome(x = 10)
    println("Test3 = $test3")
}

private class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x == 0) return true
        if (x < 0 || x % 10 == 0) return false

        val original = x.toString()
        val reversed = original.reversed()

        return original == reversed
    }
}