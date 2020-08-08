package HomeWork_2_Tests;


        import com.codeborne.selenide.Condition;
        import com.codeborne.selenide.Configuration;
        import com.codeborne.selenide.SelenideElement;
        import org.junit.jupiter.api.BeforeAll;
        import org.junit.jupiter.api.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;

        import java.util.List;

        import static com.codeborne.selenide.CollectionCondition.exactTexts;
        import static com.codeborne.selenide.Selectors.byText;
        import static com.codeborne.selenide.Selectors.byTitle;
        import static com.codeborne.selenide.Selenide.*;
        import static com.codeborne.selenide.Condition.*;

public class WomenAddToCartTest {

    @BeforeAll
    public void setup() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        open("http://automationpractice.com");
    }

    @Test
    public void womenAddToCartTest() {
        SelenideElement product = element(By.linkText("Faded Short Sleeve T-shirts"));

        product.scrollTo();
        actions().moveToElement(product).perform();
        $x("(//a[@class='quick-view'])[1]").click();
        switchTo().frame($(".fancybox-iframe"));
        $("#quantity_wanted").setValue("2");
        $("#group_1").selectOption("M");
        $("#add_to_cart").click();
        $(byText("Proceed to checkout")).click();
        $("#summary_products_quantity").shouldHave(text("2 Products"));
    }
}



