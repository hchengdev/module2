import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    public void fizzTest() {
        int a = 3;
        String ex = "Fizz";
        String fb = FizzBuzz.fizzBuzz(a) ;
        assertEquals(ex, fb);
    }

    @Test
    public void buzzTest() {
        int a = 5;
        String ex = "Buzz";

        String fb = FizzBuzz.fizzBuzz(a) ;
        assertEquals(ex, fb);
    }

    @Test
    public void fizzBuzzTest() {
        int a = 15;
        String ex = "FizzBuzz";

        String fb = FizzBuzz.fizzBuzz(a) ;
        assertEquals(ex, fb);
    }
}