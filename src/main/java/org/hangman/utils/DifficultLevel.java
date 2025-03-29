package org.hangman.utils;

public enum DifficultLevel {

    EASY("E", DigitsConstants.EASY_LEVEL_MIN_WORD_LENGTH.getValue(), DigitsConstants.EASY_LEVEL_MAX_WORD_LENGTH.getValue()),
    MEDIUM("M", DigitsConstants.MEDIUM_LEVEL_MIN_WORD_LENGTH.getValue(), DigitsConstants.MEDIUM_LEVEL_MAX_WORD_LENGTH.getValue()),
    HARD("H", DigitsConstants.HARD_LEVEL_MIN_WORD_LENGTH.getValue(), DigitsConstants.HARD_LEVEL_MAX_WORD_LENGTH.getValue());

    private final String name;
    private final int maxWordLength;
    private final int minWordLength;

    public String getName() {
        return name;
    }

    public int getMaxWordLength() {
        return maxWordLength;
    }

    public int getMinWordLength() {
        return minWordLength;
    }

    DifficultLevel(String name, int minWordLength, int maxWordLength) {
        this.name = name;
        this.maxWordLength = maxWordLength;
        this.minWordLength = minWordLength;
    }
}
