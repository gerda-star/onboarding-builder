package onlineLearningPlatform.factorys;

import onlineLearningPlatform.Reader;
import onlineLearningPlatform.products.*;


public class MathematicsCourseFactory implements LearningMaterialFactory{
    Video video;
    Quiz quiz;
    Article article;



    public MathematicsCourseFactory() {
    }

    @Override
    public Video createVideo() {
        video = new TheoryOfProbabilityVideo();
        chooseAct(video);
        return video;
    }
    @Override
    public Article createArticle() {
        article = new PrimeNumbersArticle( "Впечатляющий заголовок");
        chooseAct(article);
        return article;
    }

    @Override
    public Quiz createQuiz() {
        quiz = new BasicMathQuiz();
        chooseAct(quiz);
        return quiz;
    }

    public void chooseAct(Video video) {
        System.out.println("Доступные действия c видео: загрузить, запустить, преобразовать в текст");
        String action = Reader.scan.nextLine().toLowerCase();
        switch (action) {
            case "загрузить":
                video.uploadVideo();
                break;
            case "запустить":
                video.playVideo();
                break;
            case "преобразовать в текст":
                video.convertVideoToText();
                break;
            default:
                System.out.println("- Такой возможносити пока нет -");
        }
    }
    public void chooseAct(Quiz quiz) {
        System.out.println("Доступные действия: создать, пройти, показать результаты");
        String action = Reader.scan.nextLine().toLowerCase();
        switch (action) {
            case "создать":
                quiz.createQuiz();
                break;
            case "пройти":
                quiz.runQuiz();
                break;
            case "показать результаты":
                quiz.showResults();
                break;
            default:
                System.out.println("- Такой возможносити пока нет -");
        }
    }

    public void chooseAct(Article article) {
        System.out.println("Доступные действия: опубликовать, открыть, краткий перессказ");
        String action = Reader.scan.nextLine().toLowerCase();
        switch (action) {
            case "опубликовать":
                article.publishArticle();
                break;
            case "открыть":
                article.openArticle();
                break;
            case "краткий перессказ":
                article.showBriefReport();
                break;
            default:
                System.out.println("- Такой возможносити пока нет -");
        }
    }

}



