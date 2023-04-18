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
        terminalCommand(String.format("%d;%sd", x, y));
    }

    private static void clear() {
        terminalCommand("2J");
    }

    private static void terminalCommand(String commandText) {
        System.out.print(String.format("\33[%s", commandText));
    }
}