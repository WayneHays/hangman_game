package org.hangman;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary = new Dictionary(new Random());
        Painter painter = new Painter();
        InputValidator inputValidator = new InputValidator();
        DifficultySelector difficultySelector = new DifficultySelector();

        GameManager gameManager = new GameManager(scanner, dictionary, painter, inputValidator, difficultySelector);
        dictionary.loadWordsFromFiles();
        gameManager.startGameOrNot();
    }
}
