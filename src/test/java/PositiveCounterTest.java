import static org.junit.jupiter.api.Assertions.*;

import org.example.PositiveNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class PositiveCounterTest {

    @Test
    void PositiveNumber_withNoArgument_SetTheValueToZero(){
        PositiveCounter positiveNumber = new PositiveCounter();
        assertEquals(0, positiveNumber.getNumber());
    }


    @ParameterizedTest
    @ValueSource(ints = { 1, 10, 200, 15 })
    void PositiveNumber_acceptsOneArgument(int x){
        PositiveCounter positiveNumber = new PositiveCounter(x);
        assertEquals(x, positiveNumber.getNumber() );
    }

    @Test
    void negativeNumber_throwsException(){
        assertThrows(IllegalArgumentException.class, () -> {
            new PositiveNumber(-5);
        });
    }

    @Test
    void increasedByOneTheNumber(){
        PositiveCounter positiveNumber = new PositiveCounter(10);
        positiveNumber.increaseByOne();
        assertEquals(11, positiveNumber.getNumber());
    }

    @Test
    void incrementingMaxNumber_throwsException(){
        PositiveCounter positiveNumber = new PositiveCounter(Integer. MAX_VALUE);
        assertThrows(IllegalStateException.class, positiveNumber::increaseByOne);

    }

    @Test
    void maxValue_areNotIncremented(){
        PositiveCounter positiveNumber = new PositiveCounter(Integer. MAX_VALUE);
        assertEquals(Integer. MAX_VALUE, positiveNumber.getNumber());
    }

    @Test
    void theNumber_inToString(){
        PositiveCounter positiveNumber = new PositiveCounter(10);
        assertEquals("The number is 10", positiveNumber.toString());
    }


}