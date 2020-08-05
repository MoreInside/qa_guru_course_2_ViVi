package tests;

import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AlfaTest_HW_3 {
    @Test
    void ArchivedDepositsView(){
        open("http://alfabank.ru");
        $(byTitle("Вклады")).hover();
        $(byTitle("Депозиты")).click();
        $(byText("Архивные депозиты")).click();
        $("h3").shouldHave(text("Архивные депозиты"));
        $$(".product-cell__cell").shouldHave(size(3));
    }
    }
}