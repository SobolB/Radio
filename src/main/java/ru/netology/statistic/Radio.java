package ru.netology.statistic;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int maxRadioStation;
    private int minRadioStation = 0;

    public Radio() {
        maxRadioStation = 9;
    }

    public Radio(int stationsCount) {
        maxRadioStation = stationsCount - 1;
    }

    public void next() {
        if (currentStation != maxRadioStation) {
            currentStation = currentStation + 1;
            return;
        }
        currentStation = minRadioStation;
    }

    public void prev() {
        if (currentStation != minRadioStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxRadioStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minRadioStation) {
            return;
        }
        if (currentStation > maxRadioStation) {
            return;
        }
        this.currentStation = currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }
}
