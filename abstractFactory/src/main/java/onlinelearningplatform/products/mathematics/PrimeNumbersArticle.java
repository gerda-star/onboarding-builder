package onlinelearningplatform.products.mathematics;

import onlinelearningplatform.Reader;
import onlinelearningplatform.products.typeofcontent.Article;
import onlinelearningplatform.products.typeofcontent.IArticle;

public class PrimeNumbersArticle extends Article {

    public PrimeNumbersArticle() {
        super();
    }

    @Override
    public void publishArticle() {
        System.out.println("Успех!"
                +"\n Вы опубликовали статью о простых числах: " + super.title);
    }



}
