package org.hangman.utils;

public enum StringConstants {

    ENCRYPTOR ("*"),
    RUSSIAN_LANGUAGE("ru"),
    ENGLISH_LANGUAGE("en"),
    INCORRECT_LANGUAGE_INPUT("Введите ru|en // Enter ru|en"),
    CHOOSE_LANGUAGE("Выберите язык | Choose language");

    private final String value;

    StringConstants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
