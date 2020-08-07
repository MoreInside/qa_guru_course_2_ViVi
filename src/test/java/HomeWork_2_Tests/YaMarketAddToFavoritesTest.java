package HomeWork_2_Tests;


import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class YaMarketAddToFavoritesTest {

    class yaMarketAddToFavorites {
        @Test
        public void yaMarketFavorites() {

            open("https://market.yandex.ru");

            $(byName("text")).setValue("ретро консоли").pressEnter();

            $(byPartialLinkText("Игровая приставка SUP Game Box")).click();

            switchTo().window(1);

            $(byClassName("_2DyHt9sctH")).click();
        }
    }
}