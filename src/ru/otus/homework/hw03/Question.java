package ru.otus.homework.hw03;

public class Question {
    private int questNumber;
    private String quest;
    AnswerOption[] answerOptions;

    public Question(int questNumber, String quest, AnswerOption[] answer) {
        this.questNumber = questNumber;
        this.quest = quest;
        this.answerOptions = answer;
    }



    public void printQuest() {
        System.out.println(questNumber + ". " + quest);
        System.out.println();
    for (AnswerOption elem : answerOptions) {
            elem.printAnswer();
        }
    }

    public boolean correctAnswer(int answerNumber) {
        for (AnswerOption elem : answerOptions) {
            if (answerNumber == elem.getNumberAnswer()) {
                return elem.getCorrectAnswer();

            }
        }

        return false;
    }
    public boolean checkForCorrectness (int sss) {
        if (sss <= answerOptions.length  && sss > 0) {
             return true;
        } else {
            return false;
        }
    }
}



