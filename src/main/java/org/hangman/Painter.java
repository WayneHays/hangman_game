package org.hangman;

import java.util.List;

public class Painter {
    private final List<String> states;

    public Painter() {
        this.states = List.of(
                """
                          +---+
                          |   |
                              |
                              |
                              |
                              |
                        =========
                        """,
                """
                          +---+
                          |   |
                          O   |
                              |
                              |
                              |
                        =========
                        """,
                """
                          +---+
                          |   |
                          O   |
                          |   |
                              |
                              |
                        =========
                        """,
                """
                          +---+
                          |   |
                          O   |
                         /|   |
                              |
                              |
                        =========
                        """,
                """
                          +---+
                          |   |
                          O   |
                         /|\\  |
                              |
                              |
                        =========
                        """,
                """
                          +---+
                          |   |
                          O   |
                         /|\\  |
                         /    |
                              |
                        =========
                        """,
                """
                          +---+
                          |   |
                          O   |
                         /|\\  |
                         / \\  |
                              |
                        =========
                        """);
    }

    public String drawGallows(int mistakesCount) {
        return states.get(mistakesCount);
    }
}