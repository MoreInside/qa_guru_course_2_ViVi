package homeWork_2_Tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class LamodaSearchTests {

    @Test
    void switchToWomanTest() {
        open("https://lamoda.ru");
        
        $(byText("Женщинам")).click();
        
        $("body").shouldHave(text("Женщинам"));
        $(by("data-genders", "women").shouldHave(cssClass("menu_und__link_active"));
    }

    @Test
    void loginFormShouldBeOpenedTest() {
        open("https://lamoda.ru");
        
        $(".js-auth-button").click();
        
        $(".auth-social__title").shouldBe(visible);
    }

    @Test
    void registrationFormShouldBeOpenedTest() {
        open("https://lamoda.ru");
        
        $(".js-auth-button").click();
        $(".login-form__register").click();

        $(".register-form__inner").shouldBe(visible);
    }

    @Test
    void addToCartTest() {
        open("https://lamoda.ru");

        // ввести в поиске наименование товара
        $x("//input[@type='text']").val("BAL D'AFRIQUE EDP").pressEnter();
        //добавить товар в корзину
        //$(".products-list-item_labels").hover();
       // $(".products-list-item__extra-info").shouldBe(visible);
        //$(".products-list-item__extra-info").click();
        //перейти в корзину
        //$(byTitle("Перейти в корзину")).click();

    }
}


