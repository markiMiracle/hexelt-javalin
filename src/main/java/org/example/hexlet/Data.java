package org.example.hexlet;



public class Data {
    private static final long ITEMS_COUNT = 30;

    private static long idCounter = ITEMS_COUNT;

    public static long getNextId() {
        long id = ++idCounter;
        return id;
    }
}
