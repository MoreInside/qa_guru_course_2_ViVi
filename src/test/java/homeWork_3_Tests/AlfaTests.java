package homeWork_3_Tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class AlfaTests {

    @Test
    void archivedDepositsViewTest() {
        open("http://alfabank.ru");

        $(byTitle("Вклады")).hover();
        $(byTitle("Депозиты")).click();
        $(byText("Архивные депозиты")).click();

        $("h3").shouldHave(text("Архивные депозиты"));
        $$(".product-cell__cell").shouldHave(size(3));
    }

    @Test
    void depositInsuranceViewTest() {
        open("https://alfabank.ru/");

        $(byTitle("Вклады")).click();
        $(".navigation li").sibling(4).click();

        $("h1").shouldHave(text("Страхование вкладов"));
    }
}
