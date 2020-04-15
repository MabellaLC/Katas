import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonnacciShould {
    @ParameterizedTest
    @CsvSource({
            "0,0",
            "1,1",
            "2,1",
            "3,2",
            "4,3",
            "5,5",
            "6,8",
            "7,13",
            "9,34"
    })

    public void check_fibonacci_serie(int position, int valueExpected){
        assertEquals(valueExpected, Fibonacci.calculateSerie(position));
    }

    private static class Fibonacci{

        public static int calculateSerie(int position) {
            if (position <= 1)
                return position;

            return calculateSerie(position - 2) + calculateSerie(position - 1);
        }
    }
}
