package org.hangman.utils;

public enum DigitsConstants {
    COUNT_MISTAKES (6),
    EASY_LEVEL_MIN_WORD_LENGTH(0),
    EASY_LEVEL_MAX_WORD_LENGTH(5),
    MEDIUM_LEVEL_MIN_WORD_LENGTH(8),
    MEDIUM_LEVEL_MAX_WORD_LENGTH(10),
    HARD_LEVEL_MIN_WORD_LENGTH(12),
    HARD_LEVEL_MAX_WORD_LENGTH(15);

    private final int value;

    DigitsConstants(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
