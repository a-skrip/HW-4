package ru.otus.homework.hw02;

import java.util.Scanner;

public class HomeworkTemplate {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;
        String[] questions = {"В файл с каким расширением компилируется java-файл?",
                "С помощью какой команды git можно получить полную копию удаленного репозитория?",
                "Какой цикл применяется, когда не известно количество итераций?"};
        String[][] answerOptions = {{"cs", "java", "class", "exe"}, {"commit", "push", "clone", "copy"},
                {"while", "for", "loop"}};
        int[] correctAnswers = {2, 3, 1};
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < answerOptions[i].length; j++) {
                System.out.print(j + 1 + ". ");
                System.out.println(answerOptions[i][j]);
            }
            System.out.print("Ваш ответ: ");
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
