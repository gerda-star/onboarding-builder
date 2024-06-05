package onlineLearningPlatform;

import onlineLearningPlatform.factorys.LearningMaterialFactory;
import onlineLearningPlatform.factorys.MathematicsCourseFactory;
import onlineLearningPlatform.factorys.ProgrammingCourseFactory;

import java.util.Scanner;

public class OnlineCourse {
    LearningMaterialFactory factory;
    boolean isStop = false;

    public OnlineCourse() {
       act();
    }

    public void act() {
        while (!isStop) {
            factory = chooseFactory();
            chooseProduct();
        }

    }

    public LearningMaterialFactory chooseFactory() {
        System.out.println("***********"
                + "\n***********"
                + "\n***********"
                + "\nДобро пожаловать на онлайн-платформу!"
                + "\nЧто бы закончить введи 0"
                + "\nВыбирай направление: математика, программирование");
        String choice = Reader.scan.nextLine().toLowerCase();

        switch (choice) {
            case "математика":
                System.out.println("==== Выбрана математика ====");
                factory = new MathematicsCourseFactory();
                break;
            case "программирование":
                System.out.println("==== Выбрано программирование ====");
                factory = new ProgrammingCourseFactory();
                break;
            case "0":
                System.out.println("==== Пока-пока ====");
                System.exit(0);
            default:
                System.out.println("- Направление пока недоступно, мы над этим работаем -");
                System.out.println("====== Пока предлагаем подтянуть математику ======");
                factory = new MathematicsCourseFactory();
        }
        return factory;
    }

    public void chooseProduct() {
        System.out.println("***********"
                + "\nВыбираем продукт:");
        for (String product : factory.availableProducts) {
            System.out.println("- " + product);
        }
        String choice = Reader.scan.nextLine().toLowerCase();
        switch (choice) {
            case "видео":
                System.out.println("==== Поработаем с видео ====");
                factory.createVideo();
                return;
            case "статья":
                System.out.println("==== Поработаем со статьями ====");
                factory.createArticle();
                return;
            case "тест":
                System.out.println("==== Поработаем с тестами ====");
                factory.createQuiz();
                return;
            default:
                System.out.println("- Такого продукта неть -");
                System.out.println("====== Пусть будет статья ======");
                factory.createQuiz();
                return;
        }
    }


}
