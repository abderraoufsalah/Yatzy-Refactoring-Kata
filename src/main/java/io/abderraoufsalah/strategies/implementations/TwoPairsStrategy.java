package io.abderraoufsalah.strategies.implementations;

import java.util.List;

import io.abderraoufsalah.models.DiceRoll;
import io.abderraoufsalah.strategies.ScoringStrategy;

public class TwoPairsStrategy implements ScoringStrategy {

    @Override
    public int computeScore(DiceRoll roll) {
        List<Integer> pairs = roll.findNOfAKind(2);
        if (pairs.size() < 2) {
            return 0;
        }
        return pairs.stream()
                .map(e -> e * 2)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
