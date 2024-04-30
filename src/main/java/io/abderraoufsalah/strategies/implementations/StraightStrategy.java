package io.abderraoufsalah.strategies.implementations;

import java.util.List;

import io.abderraoufsalah.models.DiceRoll;
import io.abderraoufsalah.strategies.ScoringStrategy;

public class StraightStrategy implements ScoringStrategy {

    private final List<Integer> straight;

    public StraightStrategy(List<Integer> straight) {
        this.straight = straight;
    }

    @Override
    public int computeScore(DiceRoll roll) {
        if (!roll.sort().equals(straight)) {
            return 0;
        }
        return roll.sum();
    }
}
