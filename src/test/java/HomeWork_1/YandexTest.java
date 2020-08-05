package HomeWork_1;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexTest {
    @Test
    void searchTest() {
       open("https://yandex.ru");
        $(byClassName("input__control")).setValue("Kung Fu Panda").pressEnter();
        $("html").shouldHave(text("Kung Fu Panda"));
    }
}