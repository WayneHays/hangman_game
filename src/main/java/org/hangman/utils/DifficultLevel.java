package org.hangman.utils;

public enum DifficultLevel {

    EASY(DigitsConstants.EASY_LEVEL_MIN_WORD_LENGTH.getValue(), DigitsConstants.EASY_LEVEL_MAX_WORD_LENGTH.getValue()),
    MEDIUM( DigitsConstants.MEDIUM_LEVEL_MIN_WORD_LENGTH.getValue(), DigitsConstants.MEDIUM_LEVEL_MAX_WORD_LENGTH.getValue()),
    HARD( DigitsConstants.HARD_LEVEL_MIN_WORD_LENGTH.getValue(), DigitsConstants.HARD_LEVEL_MAX_WORD_LENGTH.getValue());

    private final int maxWordLength;
    private final int minWordLength;

    public int getMaxWordLength() {
        return maxWordLength;
    }

    public int getMinWordLength() {
        return minWordLength;
    }

    DifficultLevel(int minWordLength, int maxWordLength) {
        this.maxWordLength = maxWordLength;
        this.minWordLength = minWordLength;
    }
}
