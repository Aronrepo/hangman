package com.codecool.testing;

public class Game {

    private Terminal terminal;
    private String playerName;

    public Game(Terminal terminal) {
        this.terminal = terminal;
    }
    public String readPlayerName() {
        terminal.moveCursor(5, 10);
        return terminal.prompt("Please input your name");
    }

    public void run() {
        for(;;) {

        }
    }

    public void start() {
        terminal.clear();
        terminal.moveCursor(1, 1);
        terminal.printText("Hello World!");
        playerName = readPlayerName();
    }
}
