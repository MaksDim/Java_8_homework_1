package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void prevStationAfter5() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(5);
        radio.setPrevStation();

        int expected = 4;
        int actual = radio.getCurrentNumberStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextStationAfter5() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(5);
        radio.setNextStation();

        int expected = 6;
        int actual = radio.getCurrentNumberStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextStationAfterMax() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(9);
        radio.setNextStation();

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevStationAfterMin() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(0);
        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        assertEquals(expected, actual);
    }

    @Test
    public void PlusVolumeAfterMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.setPlusVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void PlusVolumeAfter5() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.setPlusVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void MinusVolumeAfterMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.setMinusVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void MinusVolumeAfter5() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.setMinusVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void EnterStationAfterMax() {
        Radio radio = new Radio();


        radio.setCurrentNumberStation(11);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        assertEquals(expected, actual);
    }

    @Test
    public void EnterStationAfterMin() {
        Radio radio = new Radio();


        radio.setCurrentNumberStation(-5);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        assertEquals(expected, actual);
    }
}
