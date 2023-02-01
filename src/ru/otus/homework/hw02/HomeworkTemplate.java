package ru.otus.homework.hw02;

import java.util.Scanner;

public class HomeworkTemplate {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;
        String[] questions = {"В файл с каким расширением компилируется java-файл?",
                "С помощью какой команды git можно получить полную копию удаленного репозитория?",
                "Какой цикл применяется, когда не известно количествO итераций?"};
        String[][] answerOptions = {{"cs", "java", "class", "exe"}, {"commit", "push", "clone", "copy"},
                {"while", "for", "loop"}};
        int[] correctAnswers = {2, 3, 1};
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            int numAnswer = 1;
            System.out.println(questions[i]);
            for (String answ : answerOptions[i]) {
                System.out.println(numAnswer++ + ". " + answ);
            }
            System.out.print("Ваш ответ: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Введите число");
                scanner.next();
            }
            int result = scanner.nextInt();
            if (result == correctAnswers[i]) {
                System.out.println("правильно");
                correctCount++;
            } else {
                System.out.println("НепраВильно");
                wrongCount++;
            }
            System.out.println();
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
