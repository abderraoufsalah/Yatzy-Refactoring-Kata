package io.abderraoufsalah;

import java.util.List;
import java.util.Map;

import static java.util.Comparator.naturalOrder;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toList;

public class DiceRoll {

    private final List<Integer> roll;

    public DiceRoll(List<Integer> roll) {
        if (roll == null || roll.size() != 5 || roll.stream().anyMatch(e -> e < 1 || e > 6)) {
            throw new IllegalArgumentException();
        }
        this.roll = roll;
    }

    public int sum() {
        return roll.stream().mapToInt(Integer::intValue).sum();
    }

    public List<Integer> sort() {
        return roll.stream().sorted(naturalOrder()).collect(toList());
    }

    public Map<Integer, Integer> getAllFrequencies() {
        return roll.stream().collect(groupingBy(identity(), summingInt(e -> 1)));
    }

    public int getFrequencies(int number) {
        return getAllFrequencies().getOrDefault(number, 0);
    }

    public List<Integer> findNOfAKind(int number) {
        return getAllFrequencies().entrySet().stream()
                .filter(e -> e.getValue() >= number)
                .map(Map.Entry::getKey)
                .collect(toList());
    }
}
