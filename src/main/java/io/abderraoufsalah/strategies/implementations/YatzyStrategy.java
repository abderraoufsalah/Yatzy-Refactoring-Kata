package io.abderraoufsalah.strategies.implementations;

import io.abderraoufsalah.models.DiceRoll;
import io.abderraoufsalah.strategies.ScoringStrategy;

public class YatzyStrategy implements ScoringStrategy {

    @Override
    public int computeScore(DiceRoll roll) {
        return roll.getAllFrequencies().values().stream()
                .filter(e -> e == 5)
                .findFirst()
                .map(e -> 50)
                .orElse(0);
    }
}
