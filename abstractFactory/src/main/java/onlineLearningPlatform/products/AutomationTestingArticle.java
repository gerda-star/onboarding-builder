package onlineLearningPlatform.products;

public class AutomationTestingArticle implements Article{

    private String title;

    public AutomationTestingArticle(String title) {
        this.title = title;
        System.out.println("Создано видео с полезными материалами для автоматизации тестирования");
    }

    @Override
    public void openArticle() {
        System.out.println("Тут открылась статья '" + title + "'");
    }

    @Override
    public void showBriefReport() {
        System.out.println("Тут будет краткий коспект статьи");
    }

    @Override
    public void translateToChinese() {
        System.out.println("这篇文章是中文的");

    }
}
