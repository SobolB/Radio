package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void test1() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);

        radio.prev();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Radio volume = new Radio();

        volume.setCurrentVolume(9);

        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        Radio volume = new Radio();

        volume.setCurrentVolume(7);

        volume.reduceVolume();

        int expected = 6;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
