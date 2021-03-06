package days.day12

import lib.Reader
import lib.time

fun main() {
    val input = Reader("day12.txt").strings()

    // validate input
    input
        .map { Pair(it.first(), it.drop(1).toInt()) }
        .filter { it.first == 'L' || it.first == 'R' }
        .filter { !listOf(90, 180, 270).contains(it.second) }
        .also { if (it.isEmpty()) println("All turns are multiples of 90 degrees") else println(":(") }

    fun part1() =
        input
            .map { Instruction1.from(it) }
            .doItPart1(State1(0, 0, 90)).manhattanDistance

    time("part 1") { part1() }

    fun part2(): Int {
        val initial = State(
            location = Vector(0, 0),
            waypoint = Vector(10, 1)
        )
        return doItPart2(input, initial).location.manhattanDistance
    }

    time("part 2") { part2() }
}

