package ru.netology;

public class Radio {
    private int minRadioStationNumber = 0;
    private int maxRadioStationNumber = 9;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentRadioStationNumber;
    private int currentVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber  > maxRadioStationNumber) {
            return;
        }

        if (currentRadioStationNumber < minRadioStationNumber) {
            return;
        }
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }

    public void increaseRadioStationNumber() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = minRadioStationNumber;
        }
    }

    public void decreaseRadioStationNumber() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber--;

        } else {
            currentRadioStationNumber = maxRadioStationNumber;
        }
    }
}





