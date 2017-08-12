package pl.codecouple;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Krzysztof Chruściel.
 */
public class BowlingGameTest {

    //Should return zero as a score when all rolls are missed

    @Test
    public void shouldReturnZeroWhenAllRollsAreMissed() throws Exception {
        // Given
        BowlingGame game = new BowlingGame();
        // When
        IntStream.range(0,20).forEach(roll->game.roll(0));
        int score = game.getScore();
        // Then
        assertThat(score).isEqualTo(0);
    }

    //Should return 20 as a score when you knock down one pin per roll


    @Test
    public void shouldReturnTwentyWhenKnockDownOnePinPerRoll() throws Exception {
        // Given
        BowlingGame game = new BowlingGame();
        // When
        IntStream.range(0,20).forEach(roll->game.roll(1));
        int score = game.getScore();
        // Then
        assertThat(score).isEqualTo(20);

    }

    private class BowlingGame {

        private int score = 0;

        int getScore() {
            return score;
        }

        void roll(int roll) {
            score+=roll;
        }
    }
}
