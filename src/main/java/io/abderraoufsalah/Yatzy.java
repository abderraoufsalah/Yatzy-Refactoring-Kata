package io.abderraoufsalah;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Comparator.naturalOrder;

public class Yatzy {

    public static int chance(DiceRoll roll) {
        return roll.sum();
    }

    public static int yatzy(DiceRoll roll) {
        return roll.getAllFrequencies().values().stream()
                .filter(e -> e == 5)
                .findFirst()
                .map(e -> 50)
                .orElse(0);
    }

    public static int ones(DiceRoll roll) {
        return roll.getFrequencies(1);
    }

    public static int twos(DiceRoll roll) {
        return roll.getFrequencies(2) * 2;
    }

    public static int threes(DiceRoll roll) {
        return roll.getFrequencies(3) * 3;
    }

    public static int fours(DiceRoll roll) {
        return roll.getFrequencies(4) * 4;
    }

    public static int fives(DiceRoll roll) {
        return roll.getFrequencies(5) * 5;
    }

    public static int sixes(DiceRoll roll) {
        return roll.getFrequencies(6) * 6;
    }

    public static int pair(DiceRoll roll) {
        return roll.findNOfAKind(2).stream()
                .max(naturalOrder())
                .map(e -> e * 2)
                .orElse(0);
    }

    public static int twoPairs(DiceRoll roll) {
        List<Integer> pairs = roll.findNOfAKind(2);
        return pairs.size() < 2 ? 0 : pairs.stream()
                .map(e -> e * 2)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static int threeOfAKind(DiceRoll roll) {
        return roll.findNOfAKind(3).stream()
                .max(naturalOrder())
                .map(e -> e * 3)
                .orElse(0);
    }

    public static int fourOfAKind(DiceRoll roll) {
        return roll.findNOfAKind(4).stream()
                .max(naturalOrder())
                .map(e -> e * 4)
                .orElse(0);
    }

    public static int smallStraight(DiceRoll roll) {
        return roll.sort().equals(asList(1, 2, 3, 4, 5)) ? 15 : 0;
    }

    public static int largeStraight(DiceRoll roll) {
        return roll.sort().equals(asList(2, 3, 4, 5, 6)) ? 20 : 0;
    }

    public static int fullHouse(DiceRoll roll) {
        boolean isNotTwoOfAKind = roll.findNOfAKind(2).isEmpty();
        boolean isNotThreeOfAKind = roll.findNOfAKind(3).isEmpty();
        if (roll.getAllFrequencies().size() < 2 || isNotTwoOfAKind || isNotThreeOfAKind) {
            return 0;
        }
        return roll.sum();
    }
}


