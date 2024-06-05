package onlineLearningPlatform.factorys;

import onlineLearningPlatform.products.BasicMathQuiz;
import onlineLearningPlatform.products.Quiz;

public class MathematicsCourseFactory implements LearningMaterialFactory{
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
        return new BasicMathQuiz();
    }
}
