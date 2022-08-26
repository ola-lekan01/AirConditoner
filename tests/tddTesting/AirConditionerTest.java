package tddTesting;

import testsClass.AirConditioner;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    private AirConditioner hisense;
    @BeforeEach
    public void useThisForEveryStartUp(){
        hisense = new AirConditioner();
    }
    @Test
    @DisplayName("To Turn on My AC When I turn it On")
    public void myAcIsOnTurnONAC() {
        assertFalse(hisense.isOn());
        //when
        hisense.turnOn();
        //Check
        assertTrue(hisense.isOn());
    }
    @Test
    @DisplayName("To Turn off My AC When I turn it Off")

    public void myAcIsOffTurnOffAc(){
        //when
        assertFalse(hisense.isOn());
        hisense.turnOn();
        assertTrue(hisense.isOn());
        //Check
        hisense.turnOff();
        assertFalse(hisense.isOn());
    }

    @Test
    public void testThatWhenMyAcIsTurnedOnMyTemperatureIsOn16(){
        hisense.turnOn();
        assertTrue(hisense.isOn());
        assertEquals(16, hisense.getTemperature());
    }

    @Test
    @DisplayName( "When I increase Temperature, Temperature increases")
    public void increaseAcTemperatureByOne() {
        hisense.turnOn();
        //When
        assertEquals(16, hisense.getTemperature());
        hisense.increaseTemperature();
        //Check
        assertEquals(17 , hisense.getTemperature());
    }

    @Test
    @DisplayName( "When I increase Temperature, Temperature increases")
    public void increaseAcTemperatureBy10() {
        hisense.turnOn();
        //When
        for (int i = 1; i < 10; i++) {
            hisense.increaseTemperature();
        }
        //Check
        assertEquals(25 , hisense.getTemperature());
    }

    @Test
    @DisplayName("When I decrease My Temperature, Temp. decreases")
    public void decreaseAcTemperature() {
        hisense.turnOn();
        //When
        for (int i = 1; i < 10; i++) {
            hisense.increaseTemperature();
        }
        assertEquals(25 , hisense.getTemperature());
        //When
        hisense.decreaseTemperature();
        hisense.decreaseTemperature();
        //Check
        assertEquals(23, hisense.getTemperature());
    }

    @Test
    public void testThatWhenITurnMyAcOffTemperatureStartsAtTheLastTemp(){
        hisense.turnOn();
        //When
        for (int i = 1; i < 10; i++) {
            hisense.increaseTemperature();
        }
        assertEquals(25 , hisense.getTemperature());
        //When
        hisense.turnOff();
        assertFalse(hisense.isOn());
        hisense.increaseTemperature();
        assertEquals(25, hisense.getTemperature());

        hisense.turnOn();
        assertTrue(hisense.isOn());
        assertEquals(25 , hisense.getTemperature());
    }

    @Test
    @DisplayName("When I increase my Temperature beyond 30, Temperature is still 30")

    public void AcTemperatureMax(){
        hisense.turnOn();
        assertTrue(hisense.isOn());
        //When
        for (int i = 1; i < 17; i++) {
            hisense.increaseTemperature();
        }
        //check
        assertEquals(30 , hisense.getTemperature());
    }

    @Test
    @DisplayName("When I decrease my Temperature beyond 16, Temperature is still 16")

    public void AcTemperatureMin() {
        hisense.turnOn();
        assertTrue(hisense.isOn());
        //when
        hisense.decreaseTemperature();
        hisense.decreaseTemperature();
        hisense.decreaseTemperature();
        //check
        assertEquals(16 , hisense.getTemperature());

    }
}

