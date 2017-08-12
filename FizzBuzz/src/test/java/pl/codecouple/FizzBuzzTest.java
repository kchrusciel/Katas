package pl.codecouple;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Krzysztof Chruściel.
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    //Should return 'Fizz' when number is divisible by three

    @Test
    public void shouldReturnFizzWhenNumberIsDivisibleByThree() throws Exception {
        // When
        String result = fizzBuzz.check(3);
        // Then
        assertThat(result).contains("Fizz");
    }


    //Should return 'Buzz' when number is divisible by five

    @Test
    public void shouldReturnBuzzWhenNumberIsDivisibleByFive() throws Exception {
        // When
        String result = fizzBuzz.check(5);
        // Then
        assertThat(result).contains("Buzz");
    }


    //Should return 'FizzBuzz' when number is divisible by five

    @Test
    public void shouldReturnFizzBuzzWhenNumberIsDivisibleByFiveAndThree() throws Exception {
        // When
        String result = fizzBuzz.check(15);
        // Then
        assertThat(result).contains("FizzBuzz");
    }

    //Should return number when number is not divisible by five and three

    @Test
    public void shouldReturnNumberWhenNumberIsNotDivisibleByFiveAndThree() throws Exception {
        // When
        String result = fizzBuzz.check(1);
        // Then
        assertThat(result).contains("1");
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
            return result.isEmpty() ? String.valueOf(number) : result;
        }

        private boolean isDividedByFive(int number) {
            return number%5==0;
        }

        private boolean isDividedByThree(int number) {
            return number%3==0;
        }
    }

}
