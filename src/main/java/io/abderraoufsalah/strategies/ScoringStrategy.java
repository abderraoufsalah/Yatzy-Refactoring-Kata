package io.abderraoufsalah.strategies;

import io.abderraoufsalah.enums.YatzyCategory;
import io.abderraoufsalah.models.DiceRoll;
import io.abderraoufsalah.strategies.implementations.*;

import static java.util.Arrays.asList;

public interface ScoringStrategy {

    static ScoringStrategy create(YatzyCategory category) {
        return switch (category) {
            case CHANCE -> new ChanceStrategy();
            case YATZY -> new YatzyStrategy();
            case ONES -> new NumberStrategy(1);
            case TWOS -> new NumberStrategy(2);
            case THREES -> new NumberStrategy(3);
            case FOURS -> new NumberStrategy(4);
            case FIVES -> new NumberStrategy(5);
            case SIXES -> new NumberStrategy(6);
            case PAIR -> new NOfAKindStrategy(2);
            case TWO_PAIRS -> new TwoPairsStrategy();
            case THREE_OF_A_KIND -> new NOfAKindStrategy(3);
            case FOUR_OF_A_KIND -> new NOfAKindStrategy(4);
            case SMALL_STRAIGHT -> new StraightStrategy(asList(1, 2, 3, 4, 5));
            case LARGE_STRAIGHT -> new StraightStrategy(asList(2, 3, 4, 5, 6));
            case FULL_HOUSE -> new FullHouseStrategy();
        };
    }

    int computeScore(DiceRoll roll);
}
