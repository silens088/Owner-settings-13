package autotests.tests;

import autotests.config.demowebshop.App;
import autotests.helpers.DriverUtils;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

@Owner("vvelichko")
@Story("MainPageTests")

public class MainPageTests extends TestBase {

    @BeforeAll
    static void configureBaseUrl() {
        RestAssured.baseURI = App.config.apiUrl();
        Configuration.baseUrl = App.config.webUrl();
    }

    @Test
    @Tag("UI")
    @DisplayName("Главная страница содержит заголовок c текстом: Тайская косметика купить в интернет магазине в Москве | Товары из Тайланда")
    void mainPageTitleTest() {
        step("Открываем страницу kupithai.ru", () ->
                open("https://kupithai.ru/"));

        step("Заголовок содержит текст: {expectedTitle} ", () -> {
            String expectedTitle = "Тайская косметика купить в интернет магазине в Москве | Товары из Тайланда";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
            System.out.println(actualTitle);
        });
    }

    @Test
    @Tag("UI")
    @Description("Тест для главной страницы")
    @DisplayName("На странице отображается главная форма")
    void mainPageMainFormVisibleTest() {
        step("Открываем страницу kupithai.ru", () ->
                open("https://kupithai.ru/"));

        step("Проверяем что отображается главная форма", () ->
                $(By.id("common-home")).shouldBe(Condition.visible));
    }

    @Test
    @Tag("UI")
    @Description("Тест для главной страницы")
    @DisplayName("На странице отображается главный заголовок")
    void mainPageHaveTitleTest() {
        step("Открываем страницу kupithai.ru", () ->
                open("https://kupithai.ru/"));

        step("Проверяем что заголовок страницы видимый", () ->
                $(By.className("us-main-shop-title"))
                        .shouldBe(Condition.visible));

        step("Заголовок страницы содержит текст: Тайская косметика и товары из Тайланда", () -> {
            $(By.id("common-home"))
                    .$(By.className("us-main-shop-title"))
                    .shouldHave(text("Тайская косметика и товары из Тайланда")).shouldBe(Condition.visible);
        });
    }

    @Test
    @Tag("UI")
    @Description("Тест для главной страницы")
    @DisplayName("Негативный кейс. Заголовок содержит неверный текст")
    void negativeMainPageHaveTitleTest() {
        step("Открываем страницу kupithai.ru", () ->
                open("https://kupithai.ru/"));

        step("Проверяем что заголовок страницы видимый", () ->
                $(By.className("us-main-shop-title")).shouldBe(Condition.visible));

        step("Заголовок страницы содержит неверный текст", () -> {
            String expectedText = "Тайская косметика и товары Тайланда";
            $(By.id("common-home"))
                    .$(By.className("us-main-shop-title"))
                    .shouldHave(text(expectedText));
        });
    }

    @Test
    @Tags({@Tag("web"), @Tag("UI")})
    @DisplayName("Проверяем основные элементы меню")
    public void checkMenuItemsTest() {
        step("Открываем страницу kupithai.ru", () ->
                open("https://kupithai.ru/"));

        step("Проверяем основные элементы меню и их видимость", () -> {
            $("#oct-megamenu").shouldHave(text("Оплата и доставка")).shouldBe(visible);
            $("#oct-megamenu").shouldHave(text("Гарантии")).shouldBe(visible);
            $("#oct-megamenu").shouldHave(text("Как оформить заказ")).shouldBe(visible);
            $("#oct-megamenu").shouldHave(text("Подарки")).shouldBe(visible);
            $("#oct-megamenu").shouldHave(text("Товар дня")).shouldBe(visible);
        });
        step("Проверяем что элемент Список желаний невидим", () ->
                $(".vi-oct-megamenu-wishlist-link").shouldNot(Condition.visible));
    }

    @Test
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://kupithai.ru/'", () ->
                open("https://kupithai.ru/"));

        step("Проверяем что консоль логов не содержит ошибок 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}