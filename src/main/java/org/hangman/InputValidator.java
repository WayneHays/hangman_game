package org.hangman;

import org.hangman.languages.Language;
import java.util.Scanner;

public class InputValidator {

    public boolean validateStartInput(String input, Language language) {
        return language.getContinueMessage().equalsIgnoreCase(input)
                || language.getExitMessage().equalsIgnoreCase(input);
    }

    public String validateLetterInput(Scanner scanner, GameState gameState, Language language) {
        while (true) {
            String line = scanner.nextLine();

            if (isInvalidInput(line)) {
                System.out.println(language.getChooseLetterMessage());
                continue;
            }

            if (isLetterAlreadyUsed(line, gameState)) {
                System.out.println(language.getLetterAlreadyInMessage());
                continue;
            }

            if (isValidLetter(line, language)) {
                gameState.getUsedLetters().append(line);
                return line;
            }
            System.out.println(language.getChooseLetterMessage());
        }
    }

    private boolean isInvalidInput(String line) {
        return line == null || line.length() != 1;
    }

    private boolean isLetterAlreadyUsed(String line, GameState gameState) {
        return gameState.getUsedLetters().toString().contains(line);
    }

    private boolean isValidLetter(String line, Language language) {
        return line.matches(language.getRegexForChecks());
    }
}