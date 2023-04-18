package com.codecool.testing;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        clear();
        moveCursor(1, 1);
        System.out.println("Hello World!");
        for(;;) {

        }

    }

    private static void moveCursor(int x, int y) {
        System.out.print(String.format("\033[%d:%dH", x, y));
    }

    private static void clear() {
        System.out.print("\033[2J");
    }
}