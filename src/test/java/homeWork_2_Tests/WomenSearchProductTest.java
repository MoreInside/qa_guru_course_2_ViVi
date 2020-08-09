package homeWork_2_Tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class WomenSearchProductTest {

    @Test
    void searchProductTest() {
        open("http://automationpractice.com");
        
        $("#search_query_top").val("Blouse").pressEnter();
        
        $(".product_list").shouldHave(text("Blouse");
        $(byText("1 result has been found.")).shouldBe(visible);
    }
}




