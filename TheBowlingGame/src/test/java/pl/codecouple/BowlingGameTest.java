package pl.codecouple;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Krzysztof Chruściel.
 */
public class BowlingGameTest {

    //Should return zero as score when all rolls are missed

    @Test
    public void shouldReturnZeroWhenAllRollsAreMissed() throws Exception {
        // Given
        BowlingGame game = new BowlingGame();
        // When
        IntStream.range(0,20).forEach(game::roll);
        int score = game.getScore();
        // Then
        assertThat(score).isEqualTo(0);
    }

    private class BowlingGame {
        int getScore() {
            return 0;
        }

        void roll(int roll) {

        }
    }
}
