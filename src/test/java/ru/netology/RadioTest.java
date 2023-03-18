package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RadioTest {
    @Test
    public void shouldIncreaseVolume() {          //увеличение громкости
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume1() {          //увеличение максимальной громкости
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {          //уменьшение громкости
        Radio radio = new Radio();

        radio.setCurrentVolume(30);
        radio.decreaseVolume();

        int expected = 29;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume1() {          //уменьшение минимальной громкости
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume() {      //максимальная громкость
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume() {        //минимальная громкость
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveMaxVolume() {         //свыше максимальной громкоси
        Radio radio = new Radio();

        radio.setCurrentVolume(110);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBelowMinVolume() {                  //ниже минимальной громкости
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberBorderVolume() {               //граничные значения громкости 9
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNumberBorderNegativeVolume() {            // граничные значения громкости 11
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNumberBorderVolume1() {               //граничные значения громкости 1
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNumberBorderNegativeVolume1() {            // граничные значения громкости -1
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMaxRadioStationNumber() {               //максимальный номер канала
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);


        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveMaxRadioStationNumber() {              //свыше максимального канала
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBelowMinRadioStationNumber() {           // ниже минимального канала
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationNumber() {              //увеличение канала
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(7);
        radio.increaseRadioStationNumber();

        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationNumber1() {              //увеличение  максимального канала
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);
        radio.increaseRadioStationNumber();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationNumber() {         //уменьшение канала
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(4);
        radio.decreaseRadioStationNumber();

        int expected = 3;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseRadioStationNumber1() {         //уменьшение минимального канала
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(0);
        radio.decreaseRadioStationNumber();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberBorderRadioStation() {                 // граничные каналы 8
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberBorderNegativeRadioStation() {           // граничные каналы 10
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberBorderRadioStation1() {                 // граничные каналы 1
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberBorderNegativeRadioStation1() {                 // граничные каналы -1
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newNumberRadioStation() {                 // новое радио с новыми условиями, текущая 15
        Radio radio = new Radio(20);

        radio.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void newBorderNumberRadioStation() {           // новое радио с новыми условиями, текущая 19
        Radio radio = new Radio(20);


        radio.setCurrentRadioStationNumber(19);

        int expected = 19;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newBorderNegativeNumberRadioStation() {         // новое радио с новыми условиями, текущая 21
        Radio radio = new Radio(20);


        radio.setCurrentRadioStationNumber(21);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


}





