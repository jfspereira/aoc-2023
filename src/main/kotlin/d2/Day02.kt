package d2

import InputFileLocator.Companion.getExample1
import InputFileLocator.Companion.getExample2
import InputFileLocator.Companion.getPart1
import InputFileLocator.DayConstantEnum.DAY_2
import readInput

fun main() {
    //Part 1

    fun getGameSets(game: String) =
        game.split(";").map { colorNumber ->
            colorNumber.trim().split(",").map {
                val (numberStr, color) = it.trim().split(" ")
                val cubes = numberStr.toInt()
                color to cubes
            }
        }


    fun runGame(it: String) : Int{
        val (gameId, gInfo) = it.split(":")
        val (_, id) = gameId.split(" ")

        val gameSets = getGameSets(gInfo)

        val passed = gameSets.all { gameSet ->
            gameSet.all { (color, number) ->
                when (color) {
                    "blue" -> number <= 14
                    "green" -> number <= 13
                    "red" -> number <= 12
                    else -> false
                }
            }
        }
        return if (passed) id.toInt() else 0
    }

    fun part1() {
        val input = readInput(getPart1(DAY_2))
        val result = input.sumOf{runGame(it)}


        println("Part 1 result: $result")
    }

    fun gamePower(game: String): Int {
        val (_, gameInfo) = game.split(":")

        val sets = getGameSets(gameInfo)

        val maxCubes = mutableMapOf("red" to 0, "green" to 0, "blue" to 0)
        sets.forEach { set ->
            set.forEach { (color, cubes) ->
                maxCubes[color] = maxOf(maxCubes[color] ?: 0, cubes)
            }
        }

        return maxCubes.values.reduce { acc, i -> acc * i }
    }


    //Part 2
    fun part2() {
        val result = readInput(getPart1(DAY_2))
        println("Part 2 result: ${result.sumOf { gamePower(it) }}")
    }


    part1()
    part2()
}