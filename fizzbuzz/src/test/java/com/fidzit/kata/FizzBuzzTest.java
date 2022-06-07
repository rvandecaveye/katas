package com.fidzit.kata;

import org.junit.jupiter.api.Test;

import static com.fidzit.kata.FizzBuzz.build;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {

    @Test
    void shouldBuild1() {
        String ret = build(1);
        assertThat(ret).isEqualTo("1");
    }

    @Test
    void shouldBuild2() {
        String ret = build(2);
        assertThat(ret).isEqualTo("12");
    }

    @Test
    void shouldBuild3() {
        String ret = build(3);
        assertThat(ret).isEqualTo("12Fizz");
    }

    @Test
    void shouldBuild5() {
        String ret = build(5);
        assertThat(ret).isEqualTo("12Fizz4Buzz");
    }

    @Test
    void shouldBuild6() {
        String ret = build(6);
        assertThat(ret).isEqualTo("12Fizz4BuzzFizz");
    }

    @Test
    void shouldBuild15() {
        String ret = build(15);
        assertThat(ret).isEqualTo("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz");
    }
}
