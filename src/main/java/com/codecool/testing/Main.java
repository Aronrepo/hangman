package com.codecool.testing;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        start(terminal);
        run();
    }

    private static void run() {
        for(;;) {

        }
    }

    private static void start(Terminal terminal) {
        terminal.clear();
        terminal.moveCursor(1, 1);
        terminal.printText("Hello World!");
    }

}