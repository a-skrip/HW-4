package ru.otus.homework.hw03;

import java.security.spec.PSSParameterSpec;
import java.util.Scanner;

public class StyleOfOOP {


    public static void main(String[] args) {
        int correctCount = 0;
        int wrongCount = 0;


        AnswerOption answer1 = new AnswerOption(1, "cs", false);
        AnswerOption answer2 = new AnswerOption(2, "java", true);
        AnswerOption answer3 = new AnswerOption(3, "class", false);
        AnswerOption answer4 = new AnswerOption(4, "exe", false);
        AnswerOption[] answerOption1 = {answer1, answer2, answer3, answer4};

        AnswerOption answe1 = new AnswerOption(1, "commit", false);
        AnswerOption answe2 = new AnswerOption(2, "push", false);
        AnswerOption answe3 = new AnswerOption(3, "clone", true);
        AnswerOption answe4 = new AnswerOption(4, "copy", false);
        AnswerOption[] answerOption2 = {answe1, answe2, answe3, answe4};

        AnswerOption answ1 = new AnswerOption(1, "while", true);
        AnswerOption answ2 = new AnswerOption(2, "for", false);
        AnswerOption answ3 = new AnswerOption(3, "loop", false);
        AnswerOption[] answerOption3 = {answ1, answ2, answ3};

        Question quest1 = new Question(1, "В файл с каким расширением компилируется java-файл?", answerOption1);
        Question quest2 = new Question(2, "С помощью какой команды git можно получить полную копию удаленного репозитория?", answerOption2);
        Question quest3 = new Question(3, "Какой цикл применяется, когда не известно количествO итераций?", answerOption3);
        Question[] questions = {quest1, quest2, quest3};

        for (Question question : questions) {
            question.printQuest();
            Scanner scanner = new Scanner(System.in);
            while (!scanner.hasNextInt()) {
                System.out.println("Введите число");
                scanner.next();
            }
            int userResponse = scanner.nextInt();
            if (!question.checkForCorrectness(userResponse)) {
                System.out.println("Введ номер не соответствующий номеру ответа");

            }
            if (question.correctAnswer(userResponse)) {
                correctCount++;
                System.out.println("правильно");
            } else {
                wrongCount++;
                System.out.println("NO_правильно");
            }
        }
        System.out.println("Правильных ответов - " + correctCount + " Неправильных ответов - " + wrongCount);
    }
}


