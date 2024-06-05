package onlineLearningPlatform.factorys;

public interface LearningMaterialFactory {
    Video createVideo();
    Article createArticle();
    Quiz createQuiz();

}
