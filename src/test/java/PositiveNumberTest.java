
import org.example.PositiveNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PositiveNumberTest {git

    @Test
    void PositiveNumber_withNoArgument_SetTheValueToZero(){
        PositiveNumber positiveNumber = new PositiveNumber();
        assertEquals(0, positiveNumber.getNumber());
    }


    @ParameterizedTest
    @ValueSource(ints = { 1, 10, 100, 15 })
    void PositiveNumber_acceptsOneArgument(int x){
        PositiveNumber positiveNumber = new PositiveNumber(x);
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
        PositiveNumber positiveNumber = new PositiveNumber(10);
        positiveNumber.increaseByOne();
        assertEquals(11, positiveNumber.getNumber());
    }

    @Test
    void incrementingMaxNumber_throwsException(){
        PositiveNumber positiveNumber = new PositiveNumber(Integer. MAX_VALUE);
        assertThrows(IllegalStateException.class, positiveNumber::increaseByOne);

    }

    @Test
    void maxValue_areNotIncremented(){
        PositiveNumber positiveNumber = new PositiveNumber(Integer. MAX_VALUE);
        assertEquals(Integer. MAX_VALUE, positiveNumber.getNumber());
    }

    @Test
    void theNumber_inToString(){
        PositiveNumber positiveNumber = new PositiveNumber(10);
        assertEquals("The number is 10", positiveNumber.toString());
    }


}