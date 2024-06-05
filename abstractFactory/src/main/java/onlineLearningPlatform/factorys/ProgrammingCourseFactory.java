package onlineLearningPlatform.factorys;

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
