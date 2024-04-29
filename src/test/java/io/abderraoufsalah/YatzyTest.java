package io.abderraoufsalah;

import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;


class YatzyTest {

    @Test
    void chance() {
        assertEquals(14, Yatzy.chance(asList(1, 1, 3, 3, 6)));
        assertEquals(15, Yatzy.chance(asList(2, 3, 4, 5, 1)));
        assertEquals(16, Yatzy.chance(asList(3, 3, 4, 5, 1)));
        assertEquals(21, Yatzy.chance(asList(4, 5, 5, 6, 1)));
    }

    @Test
    void yatzy() {
        assertEquals(0, Yatzy.yatzy(asList(1, 1, 1, 2, 1)));
        assertEquals(0, Yatzy.yatzy(asList(6, 6, 6, 6, 3)));
        assertEquals(50, Yatzy.yatzy(asList(1, 1, 1, 1, 1)));
        assertEquals(50, Yatzy.yatzy(asList(4, 4, 4, 4, 4)));
        assertEquals(50, Yatzy.yatzy(asList(6, 6, 6, 6, 6)));
    }

    @Test
    void ones() {
        assertEquals(0, Yatzy.ones(asList(3, 3, 3, 4, 5)));
        assertEquals(0, Yatzy.ones(asList(6, 2, 2, 4, 5)));
        assertEquals(1, Yatzy.ones(asList(1, 2, 3, 4, 5)));
        assertEquals(1, Yatzy.ones(asList(2, 3, 2, 5, 1)));
        assertEquals(2, Yatzy.ones(asList(1, 1, 2, 4, 4)));
        assertEquals(2, Yatzy.ones(asList(1, 2, 1, 4, 5)));
        assertEquals(4, Yatzy.ones(asList(1, 2, 1, 1, 1)));
    }

    @Test
    void twos() {
        assertEquals(0, Yatzy.twos(asList(3, 3, 3, 4, 5)));
        assertEquals(2, Yatzy.twos(asList(1, 1, 2, 4, 4)));
        assertEquals(4, Yatzy.twos(asList(1, 2, 3, 2, 6)));
        assertEquals(4, Yatzy.twos(asList(2, 3, 2, 5, 1)));
        assertEquals(10, Yatzy.twos(asList(2, 2, 2, 2, 2)));
    }

    @Test
    void threes() {
        assertEquals(0, Yatzy.threes(asList(1, 1, 2, 4, 4)));
        assertEquals(3, Yatzy.threes(asList(2, 3, 2, 5, 1)));
        assertEquals(6, Yatzy.threes(asList(1, 2, 3, 2, 3)));
        assertEquals(9, Yatzy.threes(asList(3, 3, 3, 4, 5)));
        assertEquals(12, Yatzy.threes(asList(2, 3, 3, 3, 3)));
    }

    @Test
    void fours() {
        assertEquals(0, Yatzy.fours(asList(2, 3, 2, 5, 1)));
        assertEquals(4, Yatzy.fours(asList(3, 3, 3, 4, 5)));
        assertEquals(4, Yatzy.fours(asList(4, 5, 5, 5, 5)));
        assertEquals(8, Yatzy.fours(asList(1, 1, 2, 4, 4)));
        assertEquals(8, Yatzy.fours(asList(4, 4, 5, 5, 5)));
        assertEquals(12, Yatzy.fours(asList(4, 4, 4, 5, 5)));
    }

    @Test
    void fives() {
        assertEquals(0, Yatzy.fives(asList(1, 1, 2, 4, 4)));
        assertEquals(5, Yatzy.fives(asList(2, 3, 2, 5, 1)));
        assertEquals(5, Yatzy.fives(asList(3, 3, 3, 4, 5)));
        assertEquals(10, Yatzy.fives(asList(4, 4, 4, 5, 5)));
        assertEquals(15, Yatzy.fives(asList(4, 4, 5, 5, 5)));
        assertEquals(20, Yatzy.fives(asList(4, 5, 5, 5, 5)));
    }

    @Test
    void sixes() {
        assertEquals(0, Yatzy.sixes(asList(1, 1, 2, 4, 4)));
        assertEquals(0, Yatzy.sixes(asList(2, 3, 2, 5, 1)));
        assertEquals(0, Yatzy.sixes(asList(3, 3, 3, 4, 5)));
        assertEquals(0, Yatzy.sixes(asList(4, 4, 4, 5, 5)));
        assertEquals(6, Yatzy.sixes(asList(4, 4, 6, 5, 5)));
        assertEquals(18, Yatzy.sixes(asList(6, 5, 6, 6, 5)));
    }

    @Test
    void pair() {
        assertEquals(0, Yatzy.pair(asList(1, 2, 3, 4, 5)));
        assertEquals(6, Yatzy.pair(asList(3, 3, 3, 3, 1)));
        assertEquals(6, Yatzy.pair(asList(3, 3, 3, 4, 1)));
        assertEquals(6, Yatzy.pair(asList(3, 4, 3, 5, 6)));
        assertEquals(8, Yatzy.pair(asList(3, 3, 3, 4, 4)));
        assertEquals(10, Yatzy.pair(asList(5, 3, 3, 3, 5)));
        assertEquals(12, Yatzy.pair(asList(1, 1, 6, 2, 6)));
        assertEquals(12, Yatzy.pair(asList(5, 3, 6, 6, 5)));
    }

    @Test
    void twoPair() {
        assertEquals(0, Yatzy.twoPairs(asList(1, 1, 2, 3, 4)));
        assertEquals(0, Yatzy.twoPairs(asList(3, 3, 3, 3, 1)));
        assertEquals(6, Yatzy.twoPairs(asList(1, 1, 2, 2, 2)));
        assertEquals(8, Yatzy.twoPairs(asList(1, 1, 2, 3, 3)));
        assertEquals(16, Yatzy.twoPairs(asList(3, 3, 5, 4, 5)));
        assertEquals(16, Yatzy.twoPairs(asList(3, 3, 5, 5, 5)));
    }

    @Test
    void threeOfAKind() {
        assertEquals(0, Yatzy.threeOfAKind(asList(3, 3, 4, 5, 6)));
        assertEquals(9, Yatzy.threeOfAKind(asList(3, 3, 3, 3, 1)));
        assertEquals(9, Yatzy.threeOfAKind(asList(3, 3, 3, 3, 3)));
        assertEquals(9, Yatzy.threeOfAKind(asList(3, 3, 3, 3, 5)));
        assertEquals(9, Yatzy.threeOfAKind(asList(3, 3, 3, 4, 5)));
        assertEquals(15, Yatzy.threeOfAKind(asList(5, 3, 5, 4, 5)));
    }

    @Test
    void fourOfAKind() {
        assertEquals(0, Yatzy.fourOfAKind(asList(2, 2, 2, 5, 5)));
        assertEquals(8, Yatzy.fourOfAKind(asList(2, 2, 2, 2, 2)));
        assertEquals(8, Yatzy.fourOfAKind(asList(2, 2, 2, 2, 5)));
        assertEquals(12, Yatzy.fourOfAKind(asList(3, 3, 3, 3, 5)));
        assertEquals(20, Yatzy.fourOfAKind(asList(5, 5, 5, 4, 5)));
    }

    @Test
    void smallStraight() {
        assertEquals(0, Yatzy.smallStraight(asList(1, 2, 2, 4, 5)));
        assertEquals(15, Yatzy.smallStraight(asList(1, 2, 3, 4, 5)));
        assertEquals(15, Yatzy.smallStraight(asList(2, 3, 4, 5, 1)));
    }

    @Test
    void largeStraight() {
        assertEquals(0, Yatzy.largeStraight(asList(1, 2, 2, 4, 5)));
        assertEquals(20, Yatzy.largeStraight(asList(2, 3, 4, 5, 6)));
        assertEquals(20, Yatzy.largeStraight(asList(6, 2, 3, 4, 5)));
    }

    @Test
    void fullHouse() {
        assertEquals(0, Yatzy.fullHouse(asList(2, 2, 3, 3, 4)));
        assertEquals(0, Yatzy.fullHouse(asList(2, 3, 4, 5, 6)));
        assertEquals(0, Yatzy.fullHouse(asList(4, 4, 4, 4, 4)));
        assertEquals(8, Yatzy.fullHouse(asList(1, 1, 2, 2, 2)));
        assertEquals(18, Yatzy.fullHouse(asList(6, 2, 2, 2, 6)));
    }
}