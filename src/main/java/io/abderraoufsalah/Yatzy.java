package io.abderraoufsalah;

import io.abderraoufsalah.enums.YatzyCategory;
import io.abderraoufsalah.models.DiceRoll;
import io.abderraoufsalah.strategies.ScoringStrategy;

public class Yatzy {

    public static int score(DiceRoll roll, YatzyCategory category) {
        return ScoringStrategy.create(category).computeScore(roll);
    }
}


