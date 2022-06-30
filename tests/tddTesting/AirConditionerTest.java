package tddTesting;

import testsClass.AirConditioner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    @DisplayName("To Turn on My AC When I turn it On")

    public void myAcIsOnTurnONAC(){
        //given
        AirConditioner hisense = new AirConditioner();
        //when
        hisense.setOn(true);
        //Check
        assertTrue(hisense.isOn());
    }

    @Test
    @DisplayName("To Turn off My AC When I turn it Off")

    public void myAcIsOffTurnOffAc(){
        //given
        AirConditioner hisense = new AirConditioner();
        //when
        hisense.setOn(false);
        //Check
        assertTrue(hisense.isOn());
    }

    @Test
    @DisplayName( "When I increase Temperature, Temperature increases")
    public void increaseAcTemperature() {
        //given
        AirConditioner hisense = new AirConditioner();
        //When
        hisense.increaseTemperature(17);
        //Check
        assertEquals(18 , hisense.getTemperature());
    }

    @Test
    @DisplayName("When I decrease My Temperature, Temp. decreases")
    public void decreaseAcTemperature() {
        //given
        AirConditioner hisense = new AirConditioner();
        //When
        hisense.decreaseTemperature(19);
        //Check
        assertEquals(18, hisense.getTemperature());
    }

    @Test
    @DisplayName("When I increase my Temperature beyond 30, Temperature is still 30")

    public void AcTemperatureMax(){
        //given
        AirConditioner hisense = new AirConditioner();
        //when
        hisense.increaseTemperature(31);
        //check
        assertEquals(30 , hisense.getTemperature());

    }

    @Test
    @DisplayName("When I decrease my Temperature beyond 16, Temperature is still 16")

    public void AcTemperatureMin() {
        //given
        AirConditioner hisense = new AirConditioner();
        //when
        hisense.decreaseTemperature(15);
        //check
        assertEquals(16 , hisense.getTemperature());

    }
}

