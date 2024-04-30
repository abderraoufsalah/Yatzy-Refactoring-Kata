package io.abderraoufsalah.strategies.implementations;

import io.abderraoufsalah.models.DiceRoll;
import io.abderraoufsalah.strategies.ScoringStrategy;

public class FullHouseStrategy implements ScoringStrategy {

    @Override
    public int computeScore(DiceRoll roll) {
        boolean isNotTwoOfAKind = roll.findNOfAKind(2).isEmpty();
        boolean isNotThreeOfAKind = roll.findNOfAKind(3).isEmpty();
        if (roll.getAllFrequencies().size() < 2 || isNotTwoOfAKind || isNotThreeOfAKind) {
            return 0;
        }
        return roll.sum();
    }
}
