package autotests.tests;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import autotests.config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class WebTest {
    @Test
    public void webChromeLocaleFileTest() {
        //выбираем параметры для теста
        System.setProperty("environmentBrowser", "chrome");
        WebDriverConfig webDriverConfig = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

        assertThat(webDriverConfig.getBrowser()).isEqualTo("CHROME");
        assertThat(webDriverConfig.getBrowserVersion()).isEqualTo("96.0");
        assertThat(webDriverConfig.getBrowserSize()).isEqualTo("1920x1080");
    }

    @Test
    public void webSelenoidFileTest() {
        System.setProperty("environmentBrowser", "selenoid");
        WebDriverConfig webDriverConfig = ConfigFactory.create(WebDriverConfig.class,
                System.getProperties());

        //assertThat(webDriverConfig.getBrowser()).isEqualTo(FIREFOX);
        assertThat(webDriverConfig.getBrowser()).isEqualTo("CHROME");
        assertThat(webDriverConfig.getBrowserVersion()).isEqualTo("91.0");
        assertThat(webDriverConfig.getBrowserSize()).isEqualTo("1920x1080");
        assertThat(webDriverConfig.remoteDriverUrl()).isEqualTo(
                "https://user1:1234@selenoid.autotests.cloud/wd/hub/");

    }
}
