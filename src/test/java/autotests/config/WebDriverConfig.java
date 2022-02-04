package autotests.config;

import org.aeonbits.owner.Config;

import java.net.URL;

//то делаем? - задаем конфигурацию, которую можно запускать из консоли для webDriver


@Config.Sources({"classpath:config/${environmentBrowser}.properties",})
//@Config.Sources("classpath:config/${environment}.properties")

//наследуем для конфигаДрайвера либу.
public interface WebDriverConfig extends Config {

    //добавляем конфигурации

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("95.0")
    String getBrowserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("remoteDriverUrl")
    String remoteDriverUrl();

//    @Key("remoteUrl")
//    URL getRemoteUrl();

//    @Key("baseUrl")
//    @DefaultValue("https://github.com")
//    String getBaseUrl();
//
//    @Key("remoteWebDriver")
//    String getRemoteWebDriver();

}
