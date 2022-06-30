package tddTesting;

import testsClass.UniCornOilAndGasTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnicornOilAndGas {

    @Test

    void testThatObjectExists(){
        UniCornOilAndGasTest unicornOilAndGas = new UniCornOilAndGasTest(2 , "Yaba");
        assertNotNull(unicornOilAndGas);
    }

    @Test
    void testThatFuelCanBeBought(){
        UniCornOilAndGasTest unicornOilAndGas = new UniCornOilAndGasTest(2 , "Yaba");
        unicornOilAndGas.buyFuel();
        assertTrue(true);
    }

    @Test
    void testForPriceAfterDiscount(){
        UniCornOilAndGasTest unicornOilAndGas = new UniCornOilAndGasTest(2 , "Yaba");
        unicornOilAndGas.getDiscount(2);
        assertEquals(392 , unicornOilAndGas.getPrice());


    }

}