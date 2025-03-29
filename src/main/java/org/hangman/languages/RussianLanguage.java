package org.hangman.languages;

public class RussianLanguage extends Language{

    @Override
    public String getStartGameMessage() {
        return "\n" + "Начало игры!";
    }

    @Override
    public String getLetterAlreadyInMessage() {
        return "Вы уже ввели эту букву!";
    }

    @Override
    public String getChooseLetterMessage() {
        return "Введите одну букву от А до Я!";
    }

    @Override
    public String getWantToPlayMoreMessage() {
        return "Хотите сыграть еще? Да/Нет";
    }

    @Override
    public String getWantToPlayMessage() {
        return "Начать игру? Да/Нет";
    }

    @Override
    public String getInputErrorMessage() {
        return "Ошибка чтения";
    }

    @Override
    public String getWinMessage() {
        return "Вы выиграли!";
    }

    @Override
    public String getLoseMessage() {
        return "Вы проиграли! Загаданное слово - ";
    }

    @Override
    public String getIncorrectInputMessage() {
        return "Неверный ввод. Введите Да/Нет";
    }

    @Override
    public String getExitMessage() {
        return "Нет";
    }

    @Override
    public String getContinueMessage() {
        return "Да";
    }

    @Override
    public String getDifficultyInputHint() {
        return "Введите E, M или H";
    }

    @Override
    public String getLanguageName() {
        return "russian";
    }

    @Override
    public String getDictionaryNotFoundMessage() {
        return "Словарь не найден";
    }

    @Override
    public String getWordMessage() {
        return "Слово: ";
    }

    @Override
    public String getWordMistakesMessage() {
        return "Ошибки(";
    }

    @Override
    public String getWordOfMessage() {
        return " из ";
    }

    @Override
    public String getWordLetterMessage() {
        return "Буква: ";
    }

    @Override
    public String getChooseDifficultyLevelMessage() {
        return "Выберите уровень сложноcти (введите на английском): ";
    }

    @Override
    public String getRegexForChecks() {
        return "[А-ЯЁа-яё]";
    }
}
