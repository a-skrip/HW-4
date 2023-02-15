package ru.otus.homework.hw03;

public class AnswerOption {

    private int numberAnswer;
    private String answerOption;
    private boolean correctAnswer;


    public AnswerOption(int numberAnswer, String answerOption,
                        boolean correctAnswer) {
        this.numberAnswer = numberAnswer;
        this.answerOption = answerOption;
        this.correctAnswer = correctAnswer;
    }

    public int getNumberAnswer() {
        return numberAnswer;
    }
    public boolean getCorrectAnswer() {
        return correctAnswer;
    }

    public void printAnswer() {
        System.out.println(numberAnswer + ". " + answerOption);


    }
}

