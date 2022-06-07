package com.fidzit.kata.ChristmasLight;

public class Light {

    private int brightness = 0;

    public void turnOn() {
        brightness++;
    }

    public void turnOff() {
        if (brightness > 0)
            brightness--;
    }

    public void toggle() {
        brightness += 2;
    }

    public int getBrightness() {
        return brightness;
    }

}
