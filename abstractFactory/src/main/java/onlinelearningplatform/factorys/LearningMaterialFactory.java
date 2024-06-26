package onlineLearningPlatform.factorys;

import onlineLearningPlatform.products.Article;
import onlineLearningPlatform.products.Quiz;
import onlineLearningPlatform.products.Video;

import java.util.List;
import java.util.Scanner;

public interface LearningMaterialFactory {

    public List<String> availableProducts = List.of("Видео", "Статья", "Тест");

    Video createVideo();
    Article createArticle();
    Quiz createQuiz();

}
