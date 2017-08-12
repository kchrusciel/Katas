package pl.codecouple

import spock.lang.Specification

/**
 * Created by Krzysztof Chruściel.
 */
class FizzBuzzSpec extends Specification {

    def "Should return 'Fizz' when number is divided by three" (){
        given:
            def fizzBuzz = new FizzBuzz()
        when:
            def result = fizzBuzz.check(3)
        then:
            result == "Fizz"
    }

    class FizzBuzz{

        String check(int number) {
            "Fizz"
        }
    }

}
