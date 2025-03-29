package org.hangman;

import org.hangman.languages.Language;
import org.hangman.utils.DifficultLevel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DifficultySelector {

    public List<Integer> setWordLengthBoundariesForDifficultyLevel(Scanner scanner, Language language) {
        printDifficultyLevelMenu(language);
        List<Integer> list = new ArrayList<>();

        while (true) {
            String line = scanner.nextLine();
            if (processDifficultyChoice(line, list)) {
                break;
            }
            System.out.println(language.getDifficultyInputHint());
        }
        return list;
    }

    private static void printDifficultyLevelMenu(Language language) {
        System.out.println("--------------------------------------------------");
        System.out.println(language.getChooseDifficultyLevelMessage() + language.getDifficultyLevelsMessage());
    }

    private boolean processDifficultyChoice(String line, List<Integer> list) {
        String upperLine = line.toUpperCase();

        return switch (upperLine) {
            case "E" -> addWordLengthBoundaries(DifficultLevel.EASY, list);
            case "M" -> addWordLengthBoundaries(DifficultLevel.MEDIUM, list);
            case "H" -> addWordLengthBoundaries(DifficultLevel.HARD, list);
            default -> false;
        };
    }


    private boolean addWordLengthBoundaries(DifficultLevel difficultLevel, List<Integer> list) {
        list.add(difficultLevel.getMinWordLength());
        list.add(difficultLevel.getMaxWordLength());
        return true;
    }
}
