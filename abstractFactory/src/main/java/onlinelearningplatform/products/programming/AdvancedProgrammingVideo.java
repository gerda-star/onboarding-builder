package onlinelearningplatform.products.programming;

import onlinelearningplatform.products.typeofcontent.Video;

public class AdvancedProgrammingVideo implements Video {

    public AdvancedProgrammingVideo() {
    }

    @Override
    public void uploadVideo() {
        System.out.println("Успех!"
                +"\n Вы звгрузили видео-рассуждение о продвинутом программирвоании");
    }

    @Override
    public void playVideo() {
        System.out.println("Пуск! Вы смотрите видео о продвинутом программировании и вдохновляетесь");
    }

    @Override
    public void convertVideoToText() {
        System.out.println("А сейчас ИИ обработает видео и покажет вам главные мысли спикера на этом видео");
    }


}
