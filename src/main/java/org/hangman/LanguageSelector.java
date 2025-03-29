package org.hangman;

import org.hangman.languages.EnglishLanguage;
import org.hangman.languages.Language;
import org.hangman.languages.RussianLanguage;
import org.hangman.utils.StringConstants;

import java.util.Scanner;

public class LanguageSelector {

    public Language validateLanguageChoice(Scanner scanner) {
        displayLanguageOptions();
        Language language;

        while (true) {
            String line = scanner.nextLine();

            if (StringConstants.RUSSIAN_LANGUAGE.getValue().equalsIgnoreCase(line)) {
                language = new RussianLanguage();
                break;

            } else if (StringConstants.ENGLISH_LANGUAGE.getValue().equalsIgnoreCase(line)) {
                language = new EnglishLanguage();
                break;

            } else System.out.println(StringConstants.INCORRECT_LANGUAGE_INPUT.getValue());
        }
        return language;
    }

    private static void displayLanguageOptions() {
        System.out.println(StringConstants.CHOOSE_LANGUAGE.getValue());
        System.out.println(StringConstants.RUSSIAN_LANGUAGE.getValue() + " | " + StringConstants.ENGLISH_LANGUAGE.getValue());
    }
}
