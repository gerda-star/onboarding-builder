package onlineLearningPlatform.factorys;

import onlineLearningPlatform.products.Article;
import onlineLearningPlatform.products.Quiz;
import onlineLearningPlatform.products.Video;

public interface LearningMaterialFactory {
    Video createVideo();
    Article createArticle();
    Quiz createQuiz();

}
