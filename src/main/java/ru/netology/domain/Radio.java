package ru.netology.domain;

public class Radio {
    private int currentNumberStation;
    private int currentVolume;
    private int minStation = 0;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int currentNumberStation) {
        this.maxStation = currentNumberStation - 1;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        if (currentNumberStation > maxStation) {
           return;
        }

        if (currentNumberStation < minStation) {
            return;
        }
        this.currentNumberStation = currentNumberStation;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setNextStation() {
        if (currentNumberStation == maxStation) {
            currentNumberStation = minStation;
            return;
        }
        currentNumberStation++;
    }

    public void setPrevStation() {
        if (currentNumberStation == minStation) {
            currentNumberStation = maxStation;
            return;
        }
        currentNumberStation--;
    }

    public void setPlusVolume() {
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        currentVolume++;
    }

    public void setMinusVolume() {
        if (currentVolume == minVolume) {
            currentVolume = minVolume;
            return;
        }
        currentVolume--;
    }
}
