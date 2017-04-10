package habrahabr;

import org.junit.Test;

/**
 * Created by kutsenko on 09.04.17.
 */
public class Tests  extends TestBase {

    @Test
    public void test1() {
        mainPage.open();
        mainPage.choseMenuBtn("Публикации"); //Публикации;Пользователи;Хабы;Компании;Песочница
    }
}
