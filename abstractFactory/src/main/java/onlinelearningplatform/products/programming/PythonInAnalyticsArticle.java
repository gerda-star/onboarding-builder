package onlinelearningplatform.products.programming;

import onlinelearningplatform.products.typeofcontent.Article;

public class PythonInAnalyticsArticle implements Article {
    String title;

    public PythonInAnalyticsArticle(String title) {
        this.title = title;
    }

    @Override
    public void publishArticle() {
        System.out.println("Успех!"
                +"\n Вы опубликовали статью о простых числах");
    }

    @Override
    public void openArticle() {
        System.out.println("Тут открылась статья '" + title + "'");
    }

    @Override
    public void showBriefReport() {
        System.out.println("Тут будет краткий коспект статьи");
    }
}
