package com.codecool.testing;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        terminal.clear();
        terminal.moveCursor(10, 1);
        terminal.printText("Hello World!");
        for(;;) {
        }
    }

}