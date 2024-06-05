package onlineLearningPlatform.factorys;

import onlineLearningPlatform.products.Article;
import onlineLearningPlatform.products.BasicMathQuiz;
import onlineLearningPlatform.products.Quiz;
import onlineLearningPlatform.products.Video;

import java.util.Scanner;

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
