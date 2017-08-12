package pl.codecouple;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Krzysztof Chruściel.
 */
public class FizzBuzzTest {

    //Should return 'Fizz' when number is divided by three


    @Test
    public void shouldReturnFizzWhenNumberIsDividedByThree() throws Exception {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        // When
        String result = fizzBuzz.check(3);
        // Then
        assertThat(result).contains("Fizz");
    }

    private class FizzBuzz {

        String check(int number) {
            return "Fizz";
        }
    }
}
