package onlinelearningplatform.products.mathematics;

import onlinelearningplatform.Reader;
import onlinelearningplatform.products.typeofcontent.Quiz;


public class BasicMathQuiz implements Quiz {
    private String topic;
    private int count;


    public BasicMathQuiz() {
    }

    @Override
    public void createQuiz() {
        describeQuiz();
        addQuestions();
        System.out.println("Создан тест по азам математики на тему: " + topic);
        System.out.println("В тесте " + count + " вопросов");
    }

    @Override
    public void runQuiz() {
        System.out.println("Тут должен открыться тест");
        System.out.println("*** " + "a b c d" + " ***");
        System.out.println("и юзер такой 'тык-тык-тык'");
    }

    @Override
    public void showResults() {
        System.out.println("Результаты теста по азам математики: Впечатляюще!");
    }

    public void describeQuiz() {
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


}



