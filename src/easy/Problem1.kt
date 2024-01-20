package easy

fun main() {
    val solution = Solution()

    // test1
    val test1 = solution.twoSum(
        nums = intArrayOf(2, 7, 11, 15),
        target = 9
    )
    println("Test1 result = [${test1[0]}, ${test1[1]}]")

    // test2
    val test2 = solution.twoSum(
        nums = intArrayOf(3, 2, 4),
        target = 6
    )
    println("Test2 result = [${test2[0]}, ${test2[1]}]")

    // test2
    val test3 = solution.twoSum(
        nums = intArrayOf(3, 3),
        target = 6
    )
    println("Test3 result = [${test3[0]}, ${test3[1]}]")
}

private class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var indexOne = 0
        var indexTwo = 1
        var resultFound = false

        while (indexOne < nums.size - 1 && !resultFound) {
            while (indexTwo < nums.size && !resultFound) {
                if (nums[indexOne] + nums[indexTwo] == target) {
                    resultFound = true
                }

                if (resultFound) {
                    break
                } else {
                    indexTwo++
                }
            }

            if (resultFound) {
                break
            } else {
                indexOne++
                indexTwo = indexOne + 1
            }

        }

        return intArrayOf(indexOne, indexTwo)
    }
}