package io.abderraoufsalah.strategies.implementations;

import io.abderraoufsalah.models.DiceRoll;
import io.abderraoufsalah.strategies.ScoringStrategy;

import static java.util.Comparator.naturalOrder;

public class NOfAKindStrategy implements ScoringStrategy {

    private final int number;

    public NOfAKindStrategy(int number) {
        this.number = number;
    }

    @Override
    public int computeScore(DiceRoll roll) {
        return roll.findNOfAKind(number).stream()
                .max(naturalOrder())
                .map(e -> e * number)
                .orElse(0);
    }
}
