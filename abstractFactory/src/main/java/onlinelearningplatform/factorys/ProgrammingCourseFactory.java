package onlinelearningplatform.factorys;

import onlinelearningplatform.products.mathematics.PrimeNumbersArticle;
import onlinelearningplatform.products.programming.PythonInAnalyticsArticle;
import onlinelearningplatform.products.typeofcontent.IArticle;
import onlinelearningplatform.products.typeofcontent.Quiz;
import onlinelearningplatform.products.typeofcontent.Video;

public class ProgrammingCourseFactory implements LearningMaterialFactory {

    Video video;
    IArticle article;
    Quiz quiz;

    public ProgrammingCourseFactory() {
        System.out.println("Раздел не доступен, но однажды всё наладится");
    }

    @Override
    public Video createVideo() {
        return null;
    }

    @Override
    public IArticle createArticle() {
        article = new PythonInAnalyticsArticle();
        article.chooseAct();
        return article;
    }

    @Override
    public Quiz createQuiz() {
        return null;
    }

}
