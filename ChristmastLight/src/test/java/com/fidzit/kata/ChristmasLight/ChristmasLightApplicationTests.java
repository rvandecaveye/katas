package com.fidzit.kata.ChristmasLight;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ChristmasLightApplicationTests {

    @Test
    void shouldTurnOnOneLight() {
        // arrange
        Light light = new Light();

        // act
        light.turnOn();

        // assert
        assertThat(light.getBrightness()).isEqualTo(1);
    }

    @Test
    void shouldTurnOffOneLight() {
        // arrange
        Light light = new Light();

        // act
        light.turnOn();
        light.turnOn();
        light.turnOff();

        // assert
        assertThat(light.getBrightness()).isEqualTo(1);
    }

    @Test
    void shouldNotTurnOffLessThan0() {
        // arrange
        Light light = new Light();

        // act
        light.turnOff();

        // assert
        assertThat(light.getBrightness()).isEqualTo(0);
    }

    @Test
    void shouldToggleOneLight() {
        // arrange
        Light light = new Light();

        // act
        light.toggle();

        // assert
        assertThat(light.getBrightness()).isEqualTo(2);
    }

    @Test
    void shouldTurnOnGridOf2Lights() {
        // arrange
        Grid oneLineOfLights = new Grid(2, 1);

        // act
        oneLineOfLights.turnOn(0, 0, 1, 0);

        // assert
        assertThat(oneLineOfLights.getLight(0, 0).getBrightness()).isEqualTo(1);
        assertThat(oneLineOfLights.getLight(0, 1).getBrightness()).isEqualTo(1);
    }

    @Test
    void shouldHaveBrightnessLevelOf1() {
        //arrange
        Grid lights = new Grid(1, 1);

        //act
        lights.turnOn(0, 0, 0, 0);

        //assert
        assertThat(lights.getBrightnessTotal()).isEqualTo(1);
    }

    @Test
    void shouldHaveBrightnessLevelOf2000000() {
        //arrange
        Grid lights = new Grid(1000, 1000);

        //act
        lights.toggle(0, 0, 999, 999);

        //assert
        assertThat(lights.getBrightnessTotal()).isEqualTo(2000000);
    }

}
