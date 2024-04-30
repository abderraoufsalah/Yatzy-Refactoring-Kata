package io.abderraoufsalah;

import io.abderraoufsalah.models.DiceRoll;
import org.junit.jupiter.api.Test;

import static io.abderraoufsalah.enums.YatzyCategory.*;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;


class YatzyTest {

    @Test
    void chance() {
        assertEquals(14, Yatzy.score(new DiceRoll(asList(1, 1, 3, 3, 6)), CHANCE));
        assertEquals(15, Yatzy.score(new DiceRoll(asList(2, 3, 4, 5, 1)), CHANCE));
        assertEquals(16, Yatzy.score(new DiceRoll(asList(3, 3, 4, 5, 1)), CHANCE));
        assertEquals(21, Yatzy.score(new DiceRoll(asList(4, 5, 5, 6, 1)), CHANCE));
    }

    @Test
    void Yatzy() {
        assertEquals(0, Yatzy.score(new DiceRoll(asList(1, 1, 1, 2, 1)), YATZY));
        assertEquals(0, Yatzy.score(new DiceRoll(asList(6, 6, 6, 6, 3)), YATZY));
        assertEquals(50, Yatzy.score(new DiceRoll(asList(1, 1, 1, 1, 1)), YATZY));
        assertEquals(50, Yatzy.score(new DiceRoll(asList(4, 4, 4, 4, 4)), YATZY));
        assertEquals(50, Yatzy.score(new DiceRoll(asList(6, 6, 6, 6, 6)), YATZY));
    }

    @Test
    void ones() {
        assertEquals(0, Yatzy.score(new DiceRoll(asList(3, 3, 3, 4, 5)), ONES));
        assertEquals(0, Yatzy.score(new DiceRoll(asList(6, 2, 2, 4, 5)), ONES));
        assertEquals(1, Yatzy.score(new DiceRoll(asList(1, 2, 3, 4, 5)), ONES));
        assertEquals(1, Yatzy.score(new DiceRoll(asList(2, 3, 2, 5, 1)), ONES));
        assertEquals(2, Yatzy.score(new DiceRoll(asList(1, 1, 2, 4, 4)), ONES));
        assertEquals(2, Yatzy.score(new DiceRoll(asList(1, 2, 1, 4, 5)), ONES));
        assertEquals(4, Yatzy.score(new DiceRoll(asList(1, 2, 1, 1, 1)), ONES));
    }

    @Test
    void twos() {
        assertEquals(0, Yatzy.score(new DiceRoll(asList(3, 3, 3, 4, 5)), TWOS));
        assertEquals(2, Yatzy.score(new DiceRoll(asList(1, 1, 2, 4, 4)), TWOS));
        assertEquals(4, Yatzy.score(new DiceRoll(asList(1, 2, 3, 2, 6)), TWOS));
        assertEquals(4, Yatzy.score(new DiceRoll(asList(2, 3, 2, 5, 1)), TWOS));
        assertEquals(10, Yatzy.score(new DiceRoll(asList(2, 2, 2, 2, 2)), TWOS));
    }

    @Test
    void threes() {
        assertEquals(0, Yatzy.score(new DiceRoll(asList(1, 1, 2, 4, 4)), THREES));
        assertEquals(3, Yatzy.score(new DiceRoll(asList(2, 3, 2, 5, 1)), THREES));
        assertEquals(6, Yatzy.score(new DiceRoll(asList(1, 2, 3, 2, 3)), THREES));
        assertEquals(9, Yatzy.score(new DiceRoll(asList(3, 3, 3, 4, 5)), THREES));
        assertEquals(12, Yatzy.score(new DiceRoll(asList(2, 3, 3, 3, 3)), THREES));
    }

    @Test
    void fours() {
        assertEquals(0, Yatzy.score(new DiceRoll(asList(2, 3, 2, 5, 1)), FOURS));
        assertEquals(4, Yatzy.score(new DiceRoll(asList(3, 3, 3, 4, 5)), FOURS));
        assertEquals(4, Yatzy.score(new DiceRoll(asList(4, 5, 5, 5, 5)), FOURS));
        assertEquals(8, Yatzy.score(new DiceRoll(asList(1, 1, 2, 4, 4)), FOURS));
        assertEquals(8, Yatzy.score(new DiceRoll(asList(4, 4, 5, 5, 5)), FOURS));
        assertEquals(12, Yatzy.score(new DiceRoll(asList(4, 4, 4, 5, 5)), FOURS));
    }

    @Test
    void fives() {
        assertEquals(0, Yatzy.score(new DiceRoll(asList(1, 1, 2, 4, 4)), FIVES));
        assertEquals(5, Yatzy.score(new DiceRoll(asList(2, 3, 2, 5, 1)), FIVES));
        assertEquals(5, Yatzy.score(new DiceRoll(asList(3, 3, 3, 4, 5)), FIVES));
        assertEquals(10, Yatzy.score(new DiceRoll(asList(4, 4, 4, 5, 5)), FIVES));
        assertEquals(15, Yatzy.score(new DiceRoll(asList(4, 4, 5, 5, 5)), FIVES));
        assertEquals(20, Yatzy.score(new DiceRoll(asList(4, 5, 5, 5, 5)), FIVES));
    }

    @Test
    void sixes() {
        assertEquals(0, Yatzy.score(new DiceRoll(asList(1, 1, 2, 4, 4)), SIXES));
        assertEquals(0, Yatzy.score(new DiceRoll(asList(2, 3, 2, 5, 1)), SIXES));
        assertEquals(0, Yatzy.score(new DiceRoll(asList(3, 3, 3, 4, 5)), SIXES));
        assertEquals(0, Yatzy.score(new DiceRoll(asList(4, 4, 4, 5, 5)), SIXES));
        assertEquals(6, Yatzy.score(new DiceRoll(asList(4, 4, 6, 5, 5)), SIXES));
        assertEquals(18, Yatzy.score(new DiceRoll(asList(6, 5, 6, 6, 5)), SIXES));
    }

    @Test
    void pair() {
        assertEquals(0, Yatzy.score(new DiceRoll(asList(1, 2, 3, 4, 5)), PAIR));
        assertEquals(6, Yatzy.score(new DiceRoll(asList(3, 3, 3, 3, 1)), PAIR));
        assertEquals(6, Yatzy.score(new DiceRoll(asList(3, 3, 3, 4, 1)), PAIR));
        assertEquals(6, Yatzy.score(new DiceRoll(asList(3, 4, 3, 5, 6)), PAIR));
        assertEquals(8, Yatzy.score(new DiceRoll(asList(3, 3, 3, 4, 4)), PAIR));
        assertEquals(10, Yatzy.score(new DiceRoll(asList(5, 3, 3, 3, 5)), PAIR));
        assertEquals(12, Yatzy.score(new DiceRoll(asList(1, 1, 6, 2, 6)), PAIR));
        assertEquals(12, Yatzy.score(new DiceRoll(asList(5, 3, 6, 6, 5)), PAIR));
    }

    @Test
    void twoPair() {
        assertEquals(0, Yatzy.score(new DiceRoll(asList(1, 1, 2, 3, 4)), TWO_PAIRS));
        assertEquals(0, Yatzy.score(new DiceRoll(asList(3, 3, 3, 3, 1)), TWO_PAIRS));
        assertEquals(6, Yatzy.score(new DiceRoll(asList(1, 1, 2, 2, 2)), TWO_PAIRS));
        assertEquals(8, Yatzy.score(new DiceRoll(asList(1, 1, 2, 3, 3)), TWO_PAIRS));
        assertEquals(16, Yatzy.score(new DiceRoll(asList(3, 3, 5, 4, 5)), TWO_PAIRS));
        assertEquals(16, Yatzy.score(new DiceRoll(asList(3, 3, 5, 5, 5)), TWO_PAIRS));
    }

    @Test
    void threeOfAKind() {
        assertEquals(0, Yatzy.score(new DiceRoll(asList(3, 3, 4, 5, 6)), THREE_OF_A_KIND));
        assertEquals(9, Yatzy.score(new DiceRoll(asList(3, 3, 3, 3, 1)), THREE_OF_A_KIND));
        assertEquals(9, Yatzy.score(new DiceRoll(asList(3, 3, 3, 3, 3)), THREE_OF_A_KIND));
        assertEquals(9, Yatzy.score(new DiceRoll(asList(3, 3, 3, 3, 5)), THREE_OF_A_KIND));
        assertEquals(9, Yatzy.score(new DiceRoll(asList(3, 3, 3, 4, 5)), THREE_OF_A_KIND));
        assertEquals(15, Yatzy.score(new DiceRoll(asList(5, 3, 5, 4, 5)), THREE_OF_A_KIND));
    }

    @Test
    void fourOfAKind() {
        assertEquals(0, Yatzy.score(new DiceRoll(asList(2, 2, 2, 5, 5)), FOUR_OF_A_KIND));
        assertEquals(8, Yatzy.score(new DiceRoll(asList(2, 2, 2, 2, 2)), FOUR_OF_A_KIND));
        assertEquals(8, Yatzy.score(new DiceRoll(asList(2, 2, 2, 2, 5)), FOUR_OF_A_KIND));
        assertEquals(12, Yatzy.score(new DiceRoll(asList(3, 3, 3, 3, 5)), FOUR_OF_A_KIND));
        assertEquals(20, Yatzy.score(new DiceRoll(asList(5, 5, 5, 4, 5)), FOUR_OF_A_KIND));
    }

    @Test
    void smallStraight() {
        assertEquals(0, Yatzy.score(new DiceRoll(asList(1, 2, 2, 4, 5)), SMALL_STRAIGHT));
        assertEquals(15, Yatzy.score(new DiceRoll(asList(1, 2, 3, 4, 5)), SMALL_STRAIGHT));
        assertEquals(15, Yatzy.score(new DiceRoll(asList(2, 3, 4, 5, 1)), SMALL_STRAIGHT));
    }

    @Test
    void largeStraight() {
        assertEquals(0, Yatzy.score(new DiceRoll(asList(1, 2, 2, 4, 5)), LARGE_STRAIGHT));
        assertEquals(20, Yatzy.score(new DiceRoll(asList(2, 3, 4, 5, 6)), LARGE_STRAIGHT));
        assertEquals(20, Yatzy.score(new DiceRoll(asList(6, 2, 3, 4, 5)), LARGE_STRAIGHT));
    }

    @Test
    void fullHouse() {
        assertEquals(0, Yatzy.score(new DiceRoll(asList(2, 2, 3, 3, 4)), FULL_HOUSE));
        assertEquals(0, Yatzy.score(new DiceRoll(asList(2, 3, 4, 5, 6)), FULL_HOUSE));
        assertEquals(0, Yatzy.score(new DiceRoll(asList(4, 4, 4, 4, 4)), FULL_HOUSE));
        assertEquals(8, Yatzy.score(new DiceRoll(asList(1, 1, 2, 2, 2)), FULL_HOUSE));
        assertEquals(18, Yatzy.score(new DiceRoll(asList(6, 2, 2, 2, 6)), FULL_HOUSE));
    }
}