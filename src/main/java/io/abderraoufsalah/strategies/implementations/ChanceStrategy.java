package io.abderraoufsalah.strategies.implementations;

import io.abderraoufsalah.models.DiceRoll;
import io.abderraoufsalah.strategies.ScoringStrategy;

public class ChanceStrategy implements ScoringStrategy {

    @Override
    public int computeScore(DiceRoll roll) {
        return roll.sum();
    }
}
