package HomeWork_2;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LamodaSearch_HW_2 {
    @Test
    void LamodaSearchTest() {
        // Открыть lamoda.ru
        open("https://lamoda.ru");

        $(byText("Женщинам")).click();

        $("body").shouldHave(text("Женщинам"));

    }
}