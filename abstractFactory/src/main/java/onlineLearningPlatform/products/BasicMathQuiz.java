package onlineLearningPlatform.products;

import java.util.Scanner;

public class BasicMathQuiz implements Quiz {
    private String topic;
    private int count;

    public BasicMathQuiz() {
        describeQuize();
        addQuestions();
        System.out.println("Создан тест по азам математики на тему: " + topic);
        System.out.println("В тесте " + count + "вопросов");
    }

    @Override
    public void describeQuize() {
        Scanner in = new Scanner(System.in);
        System.out.println("Для какого раздела математики будет тест?");
        this.topic = in.nextLine();
        in.close();
    }

    @Override
    public void addQuestions() {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько добавим вопросов?");
        try {
        this.count = Integer.parseInt(in.nextLine().toLowerCase());
        } catch (NumberFormatException e) {
            System.out.println("Неожиаднное кол-во вопросов, пусть будет 10");
            this.count = 10;
        }
        in.close();

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
}



