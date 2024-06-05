package onlineLearningPlatform.products;

import onlineLearningPlatform.Reader;

import java.util.Scanner;

public class BasicMathQuiz implements Quiz {
    private String topic;
    private int count;


    public BasicMathQuiz() {
        chooseAct();
    }

    @Override
    public void createQuize() {
        describeQuize();
        addQuestions();
        System.out.println("Создан тест по азам математики на тему: " + topic);
        System.out.println("В тесте " + count + " вопросов");
    }

    @Override
    public void runQuiz() {
        System.out.println("Тут должен открыться тест");
        System.out.println("*** " + topic + " ***");
        System.out.println("и юзер такой 'тык-тык-тык'");
    }

    @Override
    public void showResults() {
        System.out.println("Результаты теста по азам математики: Впечатляюще!");
    }

    public void describeQuize() {
        System.out.println("Для какого раздела математики будет тест?");
        this.topic = Reader.scan.nextLine();

    }

    public void addQuestions() {
        System.out.println("Сколько добавим вопросов?");
        try {
            this.count = Integer.parseInt(Reader.scan.nextLine().toLowerCase());
        } catch (NumberFormatException e) {
            System.out.println("Неожиаднное кол-во вопросов, пусть будет 10");
            this.count = 10;
        }
    }

    public void chooseAct() {
        System.out.println("Доступные действия: создать, пройти, показать результаты");
        String action = Reader.scan.nextLine().toLowerCase();
        switch (action) {
            case "создать":
                createQuize();
                return;
            case "пройти":
                runQuiz();
                return;
            case "показать результаты":
                showResults();
                return;
            default:
                System.out.println("- Такой возможносити пока нет -");
        }
        return;
    }


}



