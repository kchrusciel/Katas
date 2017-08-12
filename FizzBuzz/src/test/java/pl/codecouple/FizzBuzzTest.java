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

    private class FizzBuzz {

        String check(int number) {
            if(number%3==0){
                return "Fizz";
            }
            return "Buzz";
        }
    }

}
