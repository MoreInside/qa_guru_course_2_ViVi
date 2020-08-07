package HomeWork_2_Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.className;

public class LamodaSearchTests {

    @BeforeEach
    void openSite() {
    open("https://lamoda.ru");
    }
    @Test
    void lamodaSearchTest() {
        open("https://lamoda.ru");
        $(byText("Женщинам")).click();
        $("body").shouldHave(text("Женщинам"));
    }

    @Test
    void lamodaLoginFormShouldBeOpenedTest() {
        open("https://lamoda.ru");
        $(byText("Войти")).click();
        $(".auth-social__title").shouldBe(visible);
    }

    @Test
    void lamodaRegistrationFormShouldBeOpenedTest() {
        open("https://lamoda.ru");
        $(byText("Войти")).click();
        $(".popup__content-wrapper").click();
        $(".login-form__register").shouldBe(visible);
    }

    @Test
    void lamodarAddToCartTest() {
        open("https://lamoda.ru");

        // ввести в поиске наименование товара
        $x("//input[@type='text']").val("Byredo").pressEnter();
        //добавить товар в корзину
        $(".product-label-UI10997").click();
        //добавить товар в корзину
        //$(byTitle("Добавить в корзину")).click();
        //перейти в корзину
        //$(byTitle("Перейти в корзину")).click();

        //$(className(".AN037AWDFA28R3839")).click();
    }


    }


