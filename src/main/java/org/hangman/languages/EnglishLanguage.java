package org.hangman.languages;

public class EnglishLanguage extends Language {

    @Override
    public String getStartGameMessage() {
        return "Game is beginning!";
    }

    @Override
    public String getLetterAlreadyInMessage() {
        return "You have already entered this letter! Choose another one";
    }

    @Override
    public String getChooseLetterMessage() {
        return "Enter one letter from A to Z";
    }

    @Override
    public String getWantToPlayMoreMessage() {
        return "Do you want to play again? Yes|No";
    }

    @Override
    public String getWantToPlayMessage() {
        return "Start the game? Yes|No";
    }

    @Override
    public String getInputErrorMessage() {
        return "Input Error";
    }

    @Override
    public String getWinMessage() {
        return "You win!";
    }

    @Override
    public String getLoseMessage() {
        return "You lose! Hidden word - ";
    }

    @Override
    public String getIncorrectInputMessage() {
        return "Wrong input. Enter Yes|No";
    }

    @Override
    public String getExitMessage() {
        return "No";
    }

    @Override
    public String getContinueMessage() {
        return "Yes";
    }


    @Override
    public String getDifficultyInputHint() {
        return "Enter E,M or H";
    }

    @Override
    public String getLanguageName() {
        return "english";
    }

    @Override
    public String getDictionaryNotFoundMessage() {
        return "Dictionary not found";
    }

    @Override
    public String getWordMistakesMessage() {
        return "Mistakes(";
    }

    @Override
    public String getWordMessage() {
        return "Word: ";
    }

    @Override
    public String getWordOfMessage() {
        return " of ";
    }

    @Override
    public String getWordLetterMessage() {
        return "Letter: ";
    }

    @Override
    public String getChooseDifficultyLevelMessage() {
        return "Choose difficulty level: ";
    }

    @Override
    public String getRegexForChecks() {
        return "[A-Za-z]";
    }
}
