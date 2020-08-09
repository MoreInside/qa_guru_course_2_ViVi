package homeWork_1_Tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MailruSearchTests {
    @Test
    void selenideSearchTest() {
        // Открыть mail.ru
        open("https://mail.ru");
        $("h1 div");

        // Ввести Selenide в поиск
       // $(byName("q")).setValue("Selenide").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
       // $("html").shouldHave(text("ru.selenide.org"));
    }
}
