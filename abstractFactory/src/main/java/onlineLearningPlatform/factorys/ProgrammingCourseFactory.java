package onlineLearningPlatform.factorys;

import onlineLearningPlatform.products.Article;
import onlineLearningPlatform.products.Quiz;
import onlineLearningPlatform.products.Video;

public class ProgrammingCourseFactory implements LearningMaterialFactory {
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
