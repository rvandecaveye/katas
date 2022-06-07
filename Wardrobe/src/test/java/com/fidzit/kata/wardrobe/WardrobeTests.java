package com.fidzit.kata.wardrobe;

import com.fidzit.kata.Box;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.fidzit.kata.WardrobeCreator.createWardrobe;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class WardrobeTests {

    @Test
    void wardrobeForWallOf50Return1ElementOf50() {
        //arrange
        List<Box> expected = List.of(Box.B50);
        //act
        List<Box> actual = createWardrobe(50);
        //assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void wardrobeForWallOf100Return2ElementsOf50() {
        //arrange
        List<Box> expected = List.of(Box.B50, Box.B50);
        //act
        List<Box> actual = createWardrobe(100);
        //assert
        assertThat(actual).isEqualTo(expected);
    }


    @Test
    void wardrobeForWallOf75Return1ElementsOf75() {
        //arrange
        List<Box> expected = List.of(Box.B75);
        //act
        List<Box> actual = createWardrobe(75);
        //assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void wardrobeForWallOf150Return2ElementsOf75() {
        //arrange
        List<Box> expected = List.of(Box.B75,Box.B75);
        //act
        List<Box> actual = createWardrobe(150);
        //assert
        assertThat(actual).isEqualTo(expected);
    }

}