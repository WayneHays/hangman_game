package org.hangman;

import org.hangman.languages.Language;
import org.hangman.utils.DigitsConstants;
import java.util.List;
import java.util.Scanner;

public class GameManager {

    private final Scanner scanner;
    private final Dictionary dictionary;
    private final Painter painter;
    private final InputValidator inputValidator;
    private final DifficultySelector difficultySelector;
    private Language language;
    private GameState gameState;

    public GameManager(Scanner scanner, Dictionary dictionary, Painter painter, InputValidator inputValidator, DifficultySelector difficultySelector) {
        this.scanner = scanner;
        this.dictionary = dictionary;
        this.painter = painter;
        this.inputValidator = inputValidator;
        this.difficultySelector = difficultySelector;
    }

    public void startGameLoop() {
        initializeLanguage();
        while (true) {
            String input = scanner.nextLine();
            if (shouldExitGame(input)) {
                return;
            }
            if (isValidateStartInput(input)) {
                initializeGameSettings();
                playGameRound();
            } else {
                System.out.println(language.getIncorrectInputMessage());
            }
        }
    }

    private void initializeLanguage() {
        language = dictionary.getLanguage();
        System.out.println(language.getWantToPlayMessage());
    }

    private boolean shouldExitGame(String input) {
        return language.getExitMessage().equalsIgnoreCase(input);
    }

    private boolean isValidateStartInput(String input) {
        return inputValidator.validateStartInput(input, language);
    }

    private void initializeGameSettings() {
        List<Integer> list = difficultySelector.setWordLengthBoundariesForDifficultyLevel(scanner, language);
        int minWordLength = list.getFirst();
        int maxWordLength = list.getLast();
        gameState = new GameState(minWordLength, maxWordLength);
    }

    private void playGameRound() {
        initializeRound();
        runGameLoop();
        finishRound();
    }

    private void initializeRound() {
        String word = dictionary.chooseRandomWord(gameState.getMinWordLength(), gameState.getMaxWordLength());
        gameState.reset(word);
        System.out.println(language.getStartGameMessage());
    }

    private void runGameLoop() {
        while (!gameState.isGameEnded()) {
            printGameInfo();
            processInputCycle();
        }
    }

    private void finishRound() {
        System.out.println(painter.drawGallows(gameState.getMistakesCount()));
        checkGameCondition();
        System.out.println(language.getWantToPlayMoreMessage());
    }

    private void checkGameCondition() {
        if (gameState.isGameLost()) {
            System.out.println(language.getLoseMessage() + gameState.getOpenedWord());
        } else {
            System.out.println(language.getWinMessage());
        }
    }

    private void processInputCycle() {
        String letter = inputValidator.validateLetterInput(scanner, gameState, language);
        if (gameState.isLetterInWord(letter)) {
            gameState.openLetter(letter);
        } else {
            gameState.addMistake(letter);
        }
    }

    private void printGameInfo() {
        System.out.println(painter.drawGallows(gameState.getMistakesCount()));
        System.out.println(language.getWordMessage() + gameState.getEncryptedWord());
        System.out.println(language.getWordMistakesMessage() + gameState.getMistakesCount() + language.getWordOfMessage()
                + DigitsConstants.COUNT_MISTAKES.getValue() + language.getEndOfLine() + gameState.getWrongLetters());
        System.out.print(language.getWordLetterMessage());
    }
}