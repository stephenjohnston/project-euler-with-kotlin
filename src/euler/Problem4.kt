package euler

fun isPalindrome(s : String) = s == s.reversed()

// Note that flatMap followed by map is a for-comprehension, will give us every possible combo of n1 x n2 
fun largestPalindrome() = (100..1000)
    .flatMap { it1 : Int -> (100..1000).map { it2 : Int -> it1 * it2 } } // every possible pairing
    .filter { isPalindrome(it.toString()) } // only include the palindromes
    .max() // take the max

fun main() = print(largestPalindrome())

