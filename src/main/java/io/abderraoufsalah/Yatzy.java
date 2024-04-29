package io.abderraoufsalah;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static java.util.Comparator.naturalOrder;
import static java.util.Map.Entry;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toList;

public class Yatzy {

    public static int chance(List<Integer> roll) {
        return sum(roll);
    }

    public static int yatzy(List<Integer> roll) {
        return counts(roll).values().stream()
                .filter(e -> e == 5)
                .findFirst()
                .map(e -> 50)
                .orElse(0);
    }

    public static int ones(List<Integer> roll) {
        return getDieCount(roll, 1);
    }

    public static int twos(List<Integer> roll) {
        return getDieCount(roll, 2) * 2;
    }

    public static int threes(List<Integer> roll) {
        return getDieCount(roll, 3) * 3;
    }

    public static int fours(List<Integer> roll) {
        return getDieCount(roll, 4) * 4;
    }

    public static int fives(List<Integer> roll) {
        return getDieCount(roll, 5) * 5;
    }

    public static int sixes(List<Integer> roll) {
        return getDieCount(roll, 6) * 6;
    }

    public static int pair(List<Integer> roll) {
        return findNOfAKind(roll, 2).stream()
                .max(naturalOrder())
                .map(e -> e * 2)
                .orElse(0);
    }

    public static int twoPairs(List<Integer> roll) {
        List<Integer> pairs = findNOfAKind(roll, 2);
        return pairs.size() < 2 ? 0 : pairs.stream()
                .map(e -> e * 2)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static int threeOfAKind(List<Integer> roll) {
        return findNOfAKind(roll, 3).stream()
                .max(naturalOrder())
                .map(e -> e * 3)
                .orElse(0);
    }

    public static int fourOfAKind(List<Integer> roll) {
        return findNOfAKind(roll, 4).stream()
                .max(naturalOrder())
                .map(e -> e * 4)
                .orElse(0);
    }

    public static int smallStraight(List<Integer> roll) {
        return sort(roll).equals(asList(1, 2, 3, 4, 5)) ? 15 : 0;
    }

    public static int largeStraight(List<Integer> roll) {
        return sort(roll).equals(asList(2, 3, 4, 5, 6)) ? 20 : 0;
    }

    public static int fullHouse(List<Integer> roll) {
        boolean isNotTwoOfAKind = findNOfAKind(roll, 2).isEmpty();
        boolean isNotThreeOfAKind = findNOfAKind(roll, 3).isEmpty();
        if (counts(roll).size() < 2 || isNotTwoOfAKind || isNotThreeOfAKind) {
            return 0;
        }
        return sum(roll);
    }

    private static int getDieCount(List<Integer> roll, int number) {
        return counts(roll).getOrDefault(number, 0);
    }

    private static List<Integer> findNOfAKind(List<Integer> roll, int number) {
        return counts(roll).entrySet().stream()
                .filter(e -> e.getValue() >= number)
                .map(Entry::getKey)
                .collect(toList());
    }

    private static Map<Integer, Integer> counts(List<Integer> roll) {
        return roll.stream().collect(groupingBy(identity(), summingInt(e -> 1)));
    }

    private static int sum(List<Integer> roll) {
        return roll.stream().mapToInt(Integer::intValue).sum();
    }

    private static List<Integer> sort(List<Integer> roll) {
        return roll.stream().sorted(naturalOrder()).collect(toList());
    }
}


