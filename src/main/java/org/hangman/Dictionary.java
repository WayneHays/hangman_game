package org.hangman;

import org.hangman.languages.Language;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Dictionary {
    private final List<String> words = new ArrayList<>();
    private final LanguageSelector languageSelector = new LanguageSelector();
    private final Scanner scanner = new Scanner(System.in);
    private final Random random;
    private Language language;

    public Dictionary(Random random) {
        this.random = random;
    }

    public void loadWordsFromFiles() {
        language = languageSelector.validateLanguageChoice(scanner);
        String resourceName = language.getLanguageName() + language.getPostfix();
        try (BufferedReader bufferedReader = createBufferedReader(resourceName)) {
            loadWordsFromReader(bufferedReader);
        } catch (IOException e) {
            System.out.println(language.getInputErrorMessage());
        }
    }

    private BufferedReader createBufferedReader(String resourceName) {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(resourceName);
        return new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
    }

    private void loadWordsFromReader(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            words.add(line);
        }
    }

    public String chooseRandomWord(int minWordLength, int maxWordLength) {
        List<String> list = words.stream()
                .map(String::trim)
                .filter(word -> !word.isEmpty())
                .filter(word -> word.length() > minWordLength && word.length() < maxWordLength)
                .toList();
        return list.get(random.nextInt(list.size()));
    }

    public Language getLanguage() {
        return language;
    }
}