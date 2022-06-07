package com.fidzit.kata;

import java.util.ArrayList;
import java.util.List;

public class WardrobeCreator {

    public static List<Box> createWardrobe(int size) {
        if (size == 75)
            return List.of(Box.B75);
        if (size == 50) {
            return List.of(Box.B50);
        }
        List<Box> wardrobe = new ArrayList<>();
        wardrobe.add(Box.B50);
        wardrobe.addAll(createWardrobe(size-50));
        return wardrobe;
    }
}
