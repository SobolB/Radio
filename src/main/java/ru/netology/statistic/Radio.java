package ru.netology.statistic;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void next() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
        }
        if (currentStation > 9) {
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
}
