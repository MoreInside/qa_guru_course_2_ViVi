package homeWork_1_Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MailruSearchTests {
    @Test
    @DisplayName("MailRuSearchTest")
    void selenideSearchTest() {
        // Открыть mail.ru
        open("https://mail.ru");

         //Ввести Selenide в поиск
       $(byName("q")).setValue("Selenide").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
       $("html").shouldHave(text("ru.selenide.org"));
    }
}
