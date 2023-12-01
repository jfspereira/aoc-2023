package d1

import InputFileLocator.DayConstantEnum.DAY_1
import InputFileLocator.Companion.getExample1
import InputFileLocator.Companion.getExample2
import readInput

fun main() {
    fun part1() {
        val testInput = readInput(getExample1(DAY_1))


        println("Part 1 result: $testInput")
    }

    fun part2() {
        val testInput = readInput(getExample2(DAY_1))


        println("Part 2 result: $testInput")
    }

    part1()
    part2()
}