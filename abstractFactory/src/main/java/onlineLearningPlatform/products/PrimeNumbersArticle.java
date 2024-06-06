package onlineLearningPlatform.products;

import onlineLearningPlatform.Reader;

public class PrimeNumbersArticle implements Article{
    String title;

    public PrimeNumbersArticle(String title) {
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
