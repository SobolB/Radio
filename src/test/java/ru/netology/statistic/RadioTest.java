package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void test11() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test12() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test21() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);

        radio.prev();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test22() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test31() {
        Radio volume = new Radio();

        volume.setCurrentVolume(6);

        volume.increaseVolume();

        int expected = 7;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test32() {
        Radio volume = new Radio();

        volume.setCurrentVolume(10);

        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test41() {
        Radio volume = new Radio();

        volume.setCurrentVolume(7);

        volume.reduceVolume();

        int expected = 6;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test42() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);

        volume.reduceVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
