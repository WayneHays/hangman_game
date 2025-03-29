package org.hangman;

import org.hangman.utils.StringConstants;
import org.hangman.utils.DigitsConstants;

public class GameState {

    private String openedWord;
    private StringBuilder encryptedWord;
    private int mistakesCount;
    private final int minWordLength;
    private final int maxWordLength;
    private StringBuilder wrongLetters;
    private StringBuilder usedLetters;

    public GameState(int minWordLength, int maxWordLength) {
        this.mistakesCount = 0;
        this.wrongLetters = new StringBuilder();
        this.usedLetters = new StringBuilder();
        this.maxWordLength = maxWordLength;
        this.minWordLength = minWordLength;
    }

    public void reset(String word) {
        this.openedWord = word;
        this.encryptedWord = new StringBuilder(word.replaceAll(".", StringConstants.ENCRYPTOR.getValue()));
        this.mistakesCount = 0;
        this.wrongLetters.setLength(0);
        this.usedLetters.setLength(0);
    }

    public boolean isLetterInWord(String letter) {
        return openedWord.contains(letter);
    }

    public void openLetter(String letter) {
        for (int i = 0; i < openedWord.length(); i++) {
            if (openedWord.charAt(i) == letter.charAt(0)) {
                encryptedWord.setCharAt(i, letter.charAt(0));
            }
        }
    }

    public void addMistake(String letter) {
        mistakesCount++;
        wrongLetters.append(letter);
    }

    public boolean isGameEnded() {
        return mistakesCount == DigitsConstants.COUNT_MISTAKES.getValue()
                || !encryptedWord.toString().contains(StringConstants.ENCRYPTOR.getValue());
    }

    public boolean isGameLost() {
        return mistakesCount == DigitsConstants.COUNT_MISTAKES.getValue();
    }

    public String getOpenedWord() {
        return openedWord;
    }

    public StringBuilder getEncryptedWord() {
        return encryptedWord;
    }

    public int getMistakesCount() {
        return mistakesCount;
    }

    public StringBuilder getWrongLetters() {
        return wrongLetters;
    }

    public StringBuilder getUsedLetters() {
        return usedLetters;
    }

    public int getMaxWordLength() {
        return maxWordLength;
    }

    public int getMinWordLength() {
        return minWordLength;
    }
}