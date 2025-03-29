package org.hangman.languages;

public abstract class Language {

    public String getEndOfLine() {
        return "):";
    }

    public String getDifficultyLevelsMessage() {
        return " \n[E]asy | [M]edium | [H]ard";
    }

    public String getPostfix() {
        return ".txt";
    }

    public abstract String getStartGameMessage();

    public abstract String getLetterAlreadyInMessage();

    public abstract String getChooseLetterMessage();

    public abstract String getWantToPlayMoreMessage();

    public abstract String getWantToPlayMessage();

    public abstract String getInputErrorMessage();

    public abstract String getWinMessage();

    public abstract String getLoseMessage();

    public abstract String getIncorrectInputMessage();

    public abstract String getExitMessage();

    public abstract String getContinueMessage();

    public abstract String getDifficultyInputHint();

    public abstract String getLanguageName();

    public abstract String getWordMessage();

    public abstract String getWordMistakesMessage();

    public abstract String getWordOfMessage();

    public abstract String getRegexForChecks();

    public abstract String getWordLetterMessage();

    public abstract String getChooseDifficultyLevelMessage();
}
