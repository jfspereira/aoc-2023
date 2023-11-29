package d1

import InputFileLocator.DayConstantEnum.DAY_1;
import InputFileLocator.Companion.getExample1
import InputFileLocator.Companion.getExample2
import println
import readInput

fun main() {
    fun part1() {
        val testInput = readInput(getExample1(DAY_1))


        testInput.println()
    }

    fun part2() {
        val testInput = readInput(getExample2(DAY_1))


        testInput.println()
    }

    println("Part 1 result: ${part1().println()}")
    println("Part 2 result: ${part2().println()}")
}