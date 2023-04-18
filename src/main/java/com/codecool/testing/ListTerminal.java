package com.codecool.testing;

import java.util.ArrayList;
import java.util.List;

public class ListTerminal implements Terminal {
    private List<String> printedMessages = new ArrayList<>();

    public boolean printedMessageStartingWith(String prefix) {
        for (String message: printedMessages
             ) {
            if (message.startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void moveCursor(int row, int column) {

    }

    @Override
    public void clear() {

    }

    @Override
    public void printText(String text) {
        printedMessages.add(text);

    }

    @Override
    public String prompt(String promptText) {
        return null;
    }
}
