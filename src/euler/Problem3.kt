package euler

import kotlin.math.ceil
import kotlin.math.sqrt

fun getSqrt(n : Long) : Long = ceil(sqrt(n.toDouble())).toLong()

fun isPrime(n : Long) = (2..getSqrt(n)).filter { n % it == 0L }.count() == 0

fun getMaxPrimeFactor(n : Long) =  (1..getSqrt(n)).filter { n % it == 0L }.filter { isPrime(it) }.max()

fun main(args: Array<String>) = print(getMaxPrimeFactor(600851475143L))
