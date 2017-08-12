package pl.codecouple

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

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

    def "Should return 'FizzBuzz' when number is divided by five and three" (){
        when:
            def result = fizzBuzz.check(15)
        then:
            result == "FizzBuzz"
    }

    @Unroll
    def "Should return #excpectedValue when number is divided by #number" (){
        when:
            def result = fizzBuzz.check(number)
        then:
            result == excpectedValue
        where:
            number || excpectedValue
            1      || ""
            3      || "Fizz"
            5      || "Buzz"
            15     || "FizzBuzz"
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
