package TelevisionTest;

import Television.Television;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    private Television sharp;

    @BeforeEach
    public void setUp(){
        sharp = new Television();
    }
    @Test
    public void testThatObjectExist(){
        assertNotNull(sharp);
    }

    @Test
    public void testThatTelevisionTurnsOn(){
        sharp.turnOn();
        assertTrue(sharp.isOn());
    }

    @Test
    public void testThatTelevisionCanBeTurnedOff(){
        sharp.turnOff();
        assertFalse(sharp.isOn());
    }

    @Test
    public void testThatTelevisionStationCanBeChanged(){
        sharp.turnOn();
        sharp.increaseTelevisionStation();
        assertEquals(1, sharp.getChannel());
    }

    @Test
    public void testThatTelevisionCanNotBeChangedWhenTelevisionIsOff(){
        sharp.increaseTelevisionStation();
        assertEquals(0, sharp.getChannel());
    }

    @Test
    public void testThatChannelStationCanBeSet(){
        sharp.turnOn();
        sharp.increaseTelevisionStation(5);
        assertEquals(5, sharp.getChannel());
    }
    @Test
    public void testThatTVStationRemainsAtTheSamePositionWhenTurnedOffAndTurnedOn(){
        sharp.turnOn();
        sharp.increaseTelevisionStation(4);
        sharp.turnOff();
        assertFalse(sharp.isOn());

        sharp.turnOn();
        assertTrue(sharp.isOn());
        assertEquals(4, sharp.getChannel());
    }

    @Test
    public void testThatTVChannelCanBeDecreased(){
        sharp.turnOn();
        sharp.increaseTelevisionStation(5);
        sharp.decreaseTelevisionStation();
        assertEquals(4, sharp.getChannel());
    }

    @Test
    public void testThatTvChannelCanNotBeDecreasedBelowZero(){
        sharp.turnOn();
        sharp.decreaseTelevisionStation();
        sharp.decreaseTelevisionStation();
        assertEquals(0, sharp.getChannel());
    }
    @Test
    public void testThatTvChannelCanNotBeIncreasedAbove100(){
        sharp.turnOn();
        for (int i = 0; i < 101; i++) {
            sharp.increaseTelevisionStation();
        }
        assertEquals(100, sharp.getChannel());
    }

    @Test
    public void testThatTvChannelCanNotBeSetMoreThan100(){
        sharp.turnOn();
        sharp.increaseTelevisionStation();
        sharp.increaseTelevisionStation();
        sharp.increaseTelevisionStation();

        sharp.increaseTelevisionStation(101);
        assertEquals(3, sharp.getChannel());
    }

    @Test
    public void testThatVolumeCanBeIncreasedWhenTvIsOnAndVolumeCannotBeIncreasedMoreThan50(){
        sharp.turnOn();
        sharp.increaseVolume();
        assertEquals(1, sharp.getVolume());

        for (int i = 0; i < 55; i++) {
            sharp.increaseVolume();
        }
        assertEquals(50, sharp.getVolume());
    }

    @Test
    public void testThatVolumeCanBeDecreaseWhenTvIsOnAndVolumeCannotBeDecreasedBelowZero(){
        sharp.turnOn();
        sharp.decreaseVolume();
        sharp.decreaseVolume();
        assertEquals(0, sharp.getVolume());

        for (int i = 0; i < 5; i++) {
            sharp.increaseVolume();
        }
        assertEquals(5, sharp.getVolume());
    }

    @Test
    public void testThatTvCanBeMutedAndVolumeReturnsToZeroAfterUnMuting(){
        sharp.turnOn();
        assertEquals(0, sharp.getVolume());

        for (int i = 0; i < 5; i++) {
            sharp.increaseVolume();
        }
        assertEquals(5, sharp.getVolume());
        sharp.muteVolume();
        assertEquals(0, sharp.getVolume());
        sharp.unMuteVolume();
        assertEquals(5, sharp.getVolume());
    }

}

