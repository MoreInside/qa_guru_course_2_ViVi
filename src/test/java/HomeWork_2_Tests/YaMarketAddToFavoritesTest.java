package HomeWork_2_Tests;


import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class YaMarketAddToFavoritesTest {

    static class yaMarketAddToFavoritesTest {
        @Test
        public void yaMarketFavoritesTest() {

            open("https://market.yandex.ru");

            $(byName("q")).setValue("ретро консоли").pressEnter();

            $(byPartialLinkText("Игровая приставка SUP Game Box")).click();

            switchTo().window(1);

            $(byClassName("_2DyHt9sctH")).click();
        }
    }
}