package blackjack.domain.score;

import blackjack.domain.card.Card;
import java.util.List;

public class AceScoreStrategy implements ScoreStrategy {

    @Override
    public boolean isSupportable(List<Card> cards) {
        return false;
    }

    @Override
    public int calculateScore(List<Card> cards) {
        return 0;
    }
}
