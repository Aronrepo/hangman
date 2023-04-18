package com.codecool.testing;

import java.util.Scanner;

public class Terminal {
    public void moveCursor(int row, int column) {
        terminalCommand(String.format("%d;%dH", row, column));
    }

    public void clear() {
        terminalCommand("2J");
    }

    public void printText(String text) {
        System.out.print(text);
    }

    public String prompt(String promptText) {
        printText(String.format("%s: ", promptText));
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private void terminalCommand(String commandText) {
        System.out.print(String.format("\033[%s", commandText));
    }
}
