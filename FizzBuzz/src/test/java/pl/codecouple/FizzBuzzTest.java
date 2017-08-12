package pl.codecouple;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Krzysztof Chruściel.
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    //Should return 'Fizz' when number is divided by three

    @Test
    public void shouldReturnFizzWhenNumberIsDividedByThree() throws Exception {
        // When
        String result = fizzBuzz.check(3);
        // Then
        assertThat(result).contains("Fizz");
    }


    //Should return 'Buzz' when number is divided by five

    @Test
    public void shouldReturnBuzzWhenNumberIsDividedByFive() throws Exception {
        // When
        String result = fizzBuzz.check(5);
        // Then
        assertThat(result).contains("Buzz");
    }


    //Should return 'FizzBuzz' when number is divided by five

    @Test
    public void shouldReturnFizzBuzzWhenNumberIsDividedByFiveAndThree() throws Exception {
        // When
        String result = fizzBuzz.check(15);
        // Then
        assertThat(result).contains("FizzBuzz");
    }


    private class FizzBuzz {

        static final String FIZZ = "Fizz";
        static final String BUZZ = "Buzz";

        String check(int number) {
            String result = "";
            if(isDividedByThree(number)){
                result+= FIZZ;
            }
            if(isDividedByFive(number)){
                result+= BUZZ;
            }
            return result;
        }

        private boolean isDividedByFive(int number) {
            return number%5==0;
        }

        private boolean isDividedByThree(int number) {
            return number%3==0;
        }
    }

}
