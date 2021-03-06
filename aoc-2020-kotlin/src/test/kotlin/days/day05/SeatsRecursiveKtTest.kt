package days.day05

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Day 5: airplane seats (recursive)")
internal class SeatsRecursiveKtTest {
    @Test
    fun `examples`() {
        listOf(
            Pair("FBFBBFFRLR", 357),
            Pair("BFFFBBFRRR", 567),
            Pair("FFFBBBFRRR", 119),
            Pair("BBFFBBFRLL", 820)
        ).forEach { (input, expectedSeatId) ->
            assertThat(findSeatUsingRecursiveSplit(input)).isEqualTo(expectedSeatId)
        }
    }
}