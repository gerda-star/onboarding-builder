package onlinelearningplatform.factorys;

import onlinelearningplatform.products.typeofcontent.Article;
import onlinelearningplatform.products.typeofcontent.Quiz;
import onlinelearningplatform.products.typeofcontent.Video;

import java.util.List;

public interface LearningMaterialFactory {

    public List<String> availableProducts = List.of("Видео", "Статья", "Тест");

    Video createVideo();

    Article createArticle();

    Quiz createQuiz();

}
