package onlineLearningPlatform.factorys;

import onlineLearningPlatform.Reader;
import onlineLearningPlatform.products.Article;
import onlineLearningPlatform.products.Quiz;
import onlineLearningPlatform.products.Video;

public class ProgrammingCourseFactory implements LearningMaterialFactory {

    Video video;
    Article article;
    Quiz quiz;

    public ProgrammingCourseFactory() {
        System.out.println("Раздел не доступен, но однажды всё наладится");
    }

    @Override
    public Video createVideo() {
        return null;
    }

    @Override
    public Article createArticle() {
        return null;
    }

    @Override
    public Quiz createQuiz() {
        return null;
    }

}
