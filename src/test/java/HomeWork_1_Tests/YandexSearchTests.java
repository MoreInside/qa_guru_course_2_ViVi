package HomeWork_1_Tests;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexSearchTests {
    @Test
    void yandexSearchTest() {
        open("https://yandex.ru");

        $(".input__control").setValue("Kung Fu Panda").pressEnter();

        $("html").shouldHave(text("Kung Fu Panda"));
    }
}