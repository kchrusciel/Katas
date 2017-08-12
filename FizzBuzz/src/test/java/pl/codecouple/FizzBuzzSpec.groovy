package pl.codecouple

import spock.lang.Shared
import spock.lang.Specification

/**
 * Created by Krzysztof Chruściel.
 */
class FizzBuzzSpec extends Specification {

    @Shared
    def fizzBuzz = new FizzBuzz()

    def "Should return 'Fizz' when number is divided by three" (){
        when:
            def result = fizzBuzz.check(3)
        then:
            result == "Fizz"
    }

    def "Should return 'Buzz' when number is divided by five" (){
        when:
            def result = fizzBuzz.check(5)
        then:
            result == "Buzz"
    }

    def "Should return 'FizzBuzz' when number is divided by five" (){
        when:
            def result = fizzBuzz.check(15)
        then:
            result == "FizzBuzz"
    }

    class FizzBuzz{

        String check(int number) {
            def result = ""
            if(isDividedByThree(number)){
                result+= "Fizz"
            }
            if(isDividedByFive(number)){
                result+="Buzz"
            }
            return result
        }

        private boolean isDividedByFive(int number) {
            number % 5 == 0
        }

        private boolean isDividedByThree(int number) {
            number % 3 == 0
        }
    }

}
