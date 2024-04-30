package io.abderraoufsalah.strategies.implementations;

import io.abderraoufsalah.models.DiceRoll;
import io.abderraoufsalah.strategies.ScoringStrategy;

public class NumberStrategy implements ScoringStrategy {

    private final int number;

    public NumberStrategy(int number) {
        this.number = number;
    }

    @Override
    public int computeScore(DiceRoll roll) {
        return roll.getFrequencies(number) * number;
    }
}
