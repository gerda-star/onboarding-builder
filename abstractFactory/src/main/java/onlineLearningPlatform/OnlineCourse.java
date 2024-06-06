package onlineLearningPlatform;

import onlineLearningPlatform.factorys.LearningMaterialFactory;
import onlineLearningPlatform.factorys.MathematicsCourseFactory;
import onlineLearningPlatform.factorys.ProgrammingCourseFactory;

import java.util.Scanner;

public class OnlineCourse {
    LearningMaterialFactory factory;
    boolean isStop = false;
    Object product;

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
        System.out.println("********************"
                + "\nДобро пожаловать на онлайн-платформу!"
                + "\nВыбирай направление: математика, программирование"
                + "\nПокинуть платформу: введи 0");
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
                product = factory.createVideo();
                break;
            case "статья":
                System.out.println("==== Поработаем со статьями ====");
                product =factory.createArticle();
                break;
            case "тест":
                System.out.println("==== Поработаем с тестами ====");
                product =factory.createQuiz();
                break;
            default:
                System.out.println("- Такого продукта неть -");
                System.out.println("====== Пусть будет статья ======");
                factory.createQuiz();
        }
        if (product == null) {
            System.out.println("Работа в этом разделе пока недоступна");
        }
    }


}
