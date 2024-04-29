package io.abderraoufsalah;

import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;


class YatzyTest {

    @Test
    void chance() {
        assertEquals(14, Yatzy.chance(new DiceRoll(asList(1, 1, 3, 3, 6))));
        assertEquals(15, Yatzy.chance(new DiceRoll(asList(2, 3, 4, 5, 1))));
        assertEquals(16, Yatzy.chance(new DiceRoll(asList(3, 3, 4, 5, 1))));
        assertEquals(21, Yatzy.chance(new DiceRoll(asList(4, 5, 5, 6, 1))));
    }

    @Test
    void yatzy() {
        assertEquals(0, Yatzy.yatzy(new DiceRoll(asList(1, 1, 1, 2, 1))));
        assertEquals(0, Yatzy.yatzy(new DiceRoll(asList(6, 6, 6, 6, 3))));
        assertEquals(50, Yatzy.yatzy(new DiceRoll(asList(1, 1, 1, 1, 1))));
        assertEquals(50, Yatzy.yatzy(new DiceRoll(asList(4, 4, 4, 4, 4))));
        assertEquals(50, Yatzy.yatzy(new DiceRoll(asList(6, 6, 6, 6, 6))));
    }

    @Test
    void ones() {
        assertEquals(0, Yatzy.ones(new DiceRoll(asList(3, 3, 3, 4, 5))));
        assertEquals(0, Yatzy.ones(new DiceRoll(asList(6, 2, 2, 4, 5))));
        assertEquals(1, Yatzy.ones(new DiceRoll(asList(1, 2, 3, 4, 5))));
        assertEquals(1, Yatzy.ones(new DiceRoll(asList(2, 3, 2, 5, 1))));
        assertEquals(2, Yatzy.ones(new DiceRoll(asList(1, 1, 2, 4, 4))));
        assertEquals(2, Yatzy.ones(new DiceRoll(asList(1, 2, 1, 4, 5))));
        assertEquals(4, Yatzy.ones(new DiceRoll(asList(1, 2, 1, 1, 1))));
    }

    @Test
    void twos() {
        assertEquals(0, Yatzy.twos(new DiceRoll(asList(3, 3, 3, 4, 5))));
        assertEquals(2, Yatzy.twos(new DiceRoll(asList(1, 1, 2, 4, 4))));
        assertEquals(4, Yatzy.twos(new DiceRoll(asList(1, 2, 3, 2, 6))));
        assertEquals(4, Yatzy.twos(new DiceRoll(asList(2, 3, 2, 5, 1))));
        assertEquals(10, Yatzy.twos(new DiceRoll(asList(2, 2, 2, 2, 2))));
    }

    @Test
    void threes() {
        assertEquals(0, Yatzy.threes(new DiceRoll(asList(1, 1, 2, 4, 4))));
        assertEquals(3, Yatzy.threes(new DiceRoll(asList(2, 3, 2, 5, 1))));
        assertEquals(6, Yatzy.threes(new DiceRoll(asList(1, 2, 3, 2, 3))));
        assertEquals(9, Yatzy.threes(new DiceRoll(asList(3, 3, 3, 4, 5))));
        assertEquals(12, Yatzy.threes(new DiceRoll(asList(2, 3, 3, 3, 3))));
    }

    @Test
    void fours() {
        assertEquals(0, Yatzy.fours(new DiceRoll(asList(2, 3, 2, 5, 1))));
        assertEquals(4, Yatzy.fours(new DiceRoll(asList(3, 3, 3, 4, 5))));
        assertEquals(4, Yatzy.fours(new DiceRoll(asList(4, 5, 5, 5, 5))));
        assertEquals(8, Yatzy.fours(new DiceRoll(asList(1, 1, 2, 4, 4))));
        assertEquals(8, Yatzy.fours(new DiceRoll(asList(4, 4, 5, 5, 5))));
        assertEquals(12, Yatzy.fours(new DiceRoll(asList(4, 4, 4, 5, 5))));
    }

    @Test
    void fives() {
        assertEquals(0, Yatzy.fives(new DiceRoll(asList(1, 1, 2, 4, 4))));
        assertEquals(5, Yatzy.fives(new DiceRoll(asList(2, 3, 2, 5, 1))));
        assertEquals(5, Yatzy.fives(new DiceRoll(asList(3, 3, 3, 4, 5))));
        assertEquals(10, Yatzy.fives(new DiceRoll(asList(4, 4, 4, 5, 5))));
        assertEquals(15, Yatzy.fives(new DiceRoll(asList(4, 4, 5, 5, 5))));
        assertEquals(20, Yatzy.fives(new DiceRoll(asList(4, 5, 5, 5, 5))));
    }

    @Test
    void sixes() {
        assertEquals(0, Yatzy.sixes(new DiceRoll(asList(1, 1, 2, 4, 4))));
        assertEquals(0, Yatzy.sixes(new DiceRoll(asList(2, 3, 2, 5, 1))));
        assertEquals(0, Yatzy.sixes(new DiceRoll(asList(3, 3, 3, 4, 5))));
        assertEquals(0, Yatzy.sixes(new DiceRoll(asList(4, 4, 4, 5, 5))));
        assertEquals(6, Yatzy.sixes(new DiceRoll(asList(4, 4, 6, 5, 5))));
        assertEquals(18, Yatzy.sixes(new DiceRoll(asList(6, 5, 6, 6, 5))));
    }

    @Test
    void pair() {
        assertEquals(0, Yatzy.pair(new DiceRoll(asList(1, 2, 3, 4, 5))));
        assertEquals(6, Yatzy.pair(new DiceRoll(asList(3, 3, 3, 3, 1))));
        assertEquals(6, Yatzy.pair(new DiceRoll(asList(3, 3, 3, 4, 1))));
        assertEquals(6, Yatzy.pair(new DiceRoll(asList(3, 4, 3, 5, 6))));
        assertEquals(8, Yatzy.pair(new DiceRoll(asList(3, 3, 3, 4, 4))));
        assertEquals(10, Yatzy.pair(new DiceRoll(asList(5, 3, 3, 3, 5))));
        assertEquals(12, Yatzy.pair(new DiceRoll(asList(1, 1, 6, 2, 6))));
        assertEquals(12, Yatzy.pair(new DiceRoll(asList(5, 3, 6, 6, 5))));
    }

    @Test
    void twoPair() {
        assertEquals(0, Yatzy.twoPairs(new DiceRoll(asList(1, 1, 2, 3, 4))));
        assertEquals(0, Yatzy.twoPairs(new DiceRoll(asList(3, 3, 3, 3, 1))));
        assertEquals(6, Yatzy.twoPairs(new DiceRoll(asList(1, 1, 2, 2, 2))));
        assertEquals(8, Yatzy.twoPairs(new DiceRoll(asList(1, 1, 2, 3, 3))));
        assertEquals(16, Yatzy.twoPairs(new DiceRoll(asList(3, 3, 5, 4, 5))));
        assertEquals(16, Yatzy.twoPairs(new DiceRoll(asList(3, 3, 5, 5, 5))));
    }

    @Test
    void threeOfAKind() {
        assertEquals(0, Yatzy.threeOfAKind(new DiceRoll(asList(3, 3, 4, 5, 6))));
        assertEquals(9, Yatzy.threeOfAKind(new DiceRoll(asList(3, 3, 3, 3, 1))));
        assertEquals(9, Yatzy.threeOfAKind(new DiceRoll(asList(3, 3, 3, 3, 3))));
        assertEquals(9, Yatzy.threeOfAKind(new DiceRoll(asList(3, 3, 3, 3, 5))));
        assertEquals(9, Yatzy.threeOfAKind(new DiceRoll(asList(3, 3, 3, 4, 5))));
        assertEquals(15, Yatzy.threeOfAKind(new DiceRoll(asList(5, 3, 5, 4, 5))));
    }

    @Test
    void fourOfAKind() {
        assertEquals(0, Yatzy.fourOfAKind(new DiceRoll(asList(2, 2, 2, 5, 5))));
        assertEquals(8, Yatzy.fourOfAKind(new DiceRoll(asList(2, 2, 2, 2, 2))));
        assertEquals(8, Yatzy.fourOfAKind(new DiceRoll(asList(2, 2, 2, 2, 5))));
        assertEquals(12, Yatzy.fourOfAKind(new DiceRoll(asList(3, 3, 3, 3, 5))));
        assertEquals(20, Yatzy.fourOfAKind(new DiceRoll(asList(5, 5, 5, 4, 5))));
    }

    @Test
    void smallStraight() {
        assertEquals(0, Yatzy.smallStraight(new DiceRoll(asList(1, 2, 2, 4, 5))));
        assertEquals(15, Yatzy.smallStraight(new DiceRoll(asList(1, 2, 3, 4, 5))));
        assertEquals(15, Yatzy.smallStraight(new DiceRoll(asList(2, 3, 4, 5, 1))));
    }

    @Test
    void largeStraight() {
        assertEquals(0, Yatzy.largeStraight(new DiceRoll(asList(1, 2, 2, 4, 5))));
        assertEquals(20, Yatzy.largeStraight(new DiceRoll(asList(2, 3, 4, 5, 6))));
        assertEquals(20, Yatzy.largeStraight(new DiceRoll(asList(6, 2, 3, 4, 5))));
    }

    @Test
    void fullHouse() {
        assertEquals(0, Yatzy.fullHouse(new DiceRoll(asList(2, 2, 3, 3, 4))));
        assertEquals(0, Yatzy.fullHouse(new DiceRoll(asList(2, 3, 4, 5, 6))));
        assertEquals(0, Yatzy.fullHouse(new DiceRoll(asList(4, 4, 4, 4, 4))));
        assertEquals(8, Yatzy.fullHouse(new DiceRoll(asList(1, 1, 2, 2, 2))));
        assertEquals(18, Yatzy.fullHouse(new DiceRoll(asList(6, 2, 2, 2, 6))));
    }
}