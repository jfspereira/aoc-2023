package d1

import InputFileLocator.Companion.getExample1
import InputFileLocator.Companion.getExample2
import InputFileLocator.DayConstantEnum.DAY_1
import readInput

fun main() {
    //Part 1
    fun String.concatFirstAndLastNumber() = "${this.first()}${this.last()}".toInt()

    fun part1() {
        val result = readInput(getExample1(DAY_1))
            .map { str -> str.filter { it.isDigit() } }
            .sumOf { it.concatFirstAndLastNumber() }
        println("Part 1 result: $result")
    }

    //Part 2
    val numberMap = mapOf(
        "one" to "1",
        "two" to "2",
        "three" to "3",
        "four" to "4",
        "five" to "5",
        "six" to "6",
        "seven" to "7",
        "eight" to "8",
        "nine" to "9",
    )

    fun String.parseNumber(): String{
         val line = this
         return buildString {
            for (index in line.indices) {
                if(line[index].isDigit()){
                    append(line[index])
                }else{
                    val sub = line.substring(startIndex = index)
                    for ((word, num) in numberMap) {
                        if (sub.startsWith(word)) {
                            append(num)
                            break
                        }
                    }
                }
            }
         }
    }

    fun part2() {
        val result = readInput(getExample2(DAY_1))
            .sumOf { it.parseNumber().concatFirstAndLastNumber() }
        println("Part 2 result: $result")
    }


    part1()
    part2()
}