package onlinelearningplatform.products.programming;

import onlinelearningplatform.Reader;
import onlinelearningplatform.products.typeofcontent.Quiz;

public class ProgrammerSkillsQuiz implements Quiz {
    private String topic;
    private int count;


    public ProgrammerSkillsQuiz() {
    }

    @Override
    public void createQuiz() {
        describeQuiz();
        addQuestions();
        System.out.println("Создан тест на навыки програмирования: " + topic);
        System.out.println("В тесте " + count + " вопросов");
    }

    @Override
    public void runQuiz() {
        System.out.println("Тут должен открыться тест");
        System.out.println("*** " + "Вопрос про это" + " ***");
        System.out.println("*** " + "Вопрос про то" + " ***");
        System.out.println("и юзер такой 'клик, клик - как я хорош, да я не джун, я прям сеньер ╰(*︶*)╯'");
    }

    @Override
    public void showResults() {
        System.out.println("Результаты теста по навыкам программирования: еще есть над чем работать!");
    }
    @Override
    public void describeQuiz() {
        System.out.println("Для какого направления в разработке будет тест?");
        this.topic = Reader.scan.nextLine();
    }
    @Override
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
