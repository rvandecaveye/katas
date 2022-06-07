package com.fidzit.kata;

public enum Box{
    B50(50),
    B75(75),
    B100(100),
    B120(120);
    private int size;
    Box(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}