package pl.codecouple;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Krzysztof Chruściel.
 */
public class BowlingGameTest {

    BowlingGame game = new BowlingGame();

    //Should return zero as a score when all rolls are missed

    @Test
    public void shouldReturnZeroWhenAllRollsAreMissed() throws Exception {
        // When
        IntStream.range(0,20).forEach(roll->game.roll(0));
        int score = game.getScore();
        // Then
        assertThat(score).isEqualTo(0);
    }

    //Should return 20 as a score when you knock down one pin per roll

    @Test
    public void shouldReturnTwentyWhenKnockDownOnePinPerRoll() throws Exception {
        // When
        IntStream.range(0,20).forEach(roll->game.roll(1));
        int score = game.getScore();
        // Then
        assertThat(score).isEqualTo(20);

    }

    //Should return 16 as a score when you knock down spare in first frame followed by three

    @Test
    public void shouldReturnSixTeenWhenSpareIsKnockDown() throws Exception {
        // When
        game.roll(5);
        game.roll(5);
        game.roll(3);
        IntStream.range(0,17).forEach(roll->game.roll(0));
        int score = game.getScore();
        // Then
        assertThat(score).isEqualTo(16);
    }

    //Should return 24 as a score when you knock down strike in first frame followed by three and four

    @Test
    public void shouldReturnTwentyFourWhenStrikeIsKnockDown() throws Exception {
        // When
        game.roll(10);
        game.roll(3);
        game.roll(4);
        IntStream.range(0,17).forEach(roll->game.roll(0));
        int score = game.getScore();
        // Then
        assertThat(score).isEqualTo(24);
    }

    private class BowlingGame {

        int[] rolls = new int[21];
        int roll = 0;

        int getScore() {
            int score = 0;
            int index = 0;
            for(int frame = 0; frame<10; frame++){
                if(rolls[index] == 10) {
                    score = 10 + rolls[index+1] + rolls[index+2];
                    index++;
                }
                else if(rolls[index] + rolls[index+1] == 10){ //spare
                    score = 10 + rolls[index+2];
                    index+=2;
                } else{
                    score+=rolls[index] + rolls[index+1];
                    index+=2;
                }
            }
            return score;
        }

        void roll(int pins) {
            rolls[roll++] = pins;
        }
    }
}
