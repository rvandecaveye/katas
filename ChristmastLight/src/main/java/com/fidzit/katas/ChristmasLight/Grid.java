package com.fidzit.katas.ChristmasLight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Grid {
    private final List<List<Light>> lights;

    public Grid(int rowSize, int columnSize) {
        lights = new ArrayList<>();
        for (int columnIndex = 0; columnIndex < columnSize; columnIndex++) {
            List<Light> rowOfLights = new ArrayList<>();
            for (int rowIndex = 0; rowIndex < rowSize; rowIndex++) {
                rowOfLights.add(new Light());
            }
            lights.add(rowOfLights);
        }
    }

    public void turnOn(int startRowIdx, int startColumnIdx, int endRowIdx, int endColumnIdx) {
        int rowIndex = startRowIdx;
        int columnIndex = startColumnIdx;
        while (columnIndex <= endColumnIdx) {
            while (rowIndex <= endRowIdx) {
                getLight(columnIndex, rowIndex).turnOn();
                rowIndex++;
            }
            rowIndex = startRowIdx;
            columnIndex++;
        }
    }

    public Light getLight(int columnIndex, int rowIndex) {
        return lights.get(columnIndex).get(rowIndex);
    }

    public void turnOff(int startRowIdx, int startColumnIdx, int endRowIdx, int endColumnIdx) {
        int rowIndex = startRowIdx;
        int columnIndex = startColumnIdx;
        while (columnIndex <= endColumnIdx) {
            while (rowIndex <= endRowIdx) {
                getLight(columnIndex, rowIndex).turnOff();
                rowIndex++;
            }
            rowIndex = startRowIdx;
            columnIndex++;
        }
    }

    public void toggle(int startRowIdx, int startColumnIdx, int endRowIdx, int endColumnIdx) {
        int rowIndex = startRowIdx;
        int columnIndex = startColumnIdx;
        while (columnIndex <= endColumnIdx) {
            while (rowIndex <= endRowIdx) {
                getLight(columnIndex, rowIndex).toggle();
                rowIndex++;
            }
            rowIndex = startRowIdx;
            columnIndex++;
        }
    }

    public static void main(String[] args) {
        Grid grid = new Grid(1000, 1000);
        grid.turnOn(887, 9, 959, 629);
        grid.turnOn(454, 398, 844, 448);
        grid.turnOff(539, 243, 559, 965);
        grid.turnOff(370, 819, 676, 868);
        grid.turnOff(145, 40, 370, 997);
        grid.turnOff(301, 3, 808, 453);
        grid.turnOn(51, 678, 951, 908);
        grid.toggle(20, 196, 897, 994);
        grid.toggle(31, 394, 904, 860);
        System.out.println(grid.getBrightnessTotal());
    }

    public int getBrightnessTotal() {
        return lights.stream()
                .flatMap(Collection::stream)
                .mapToInt(Light::getBrightness)
                .sum();
    }
}
