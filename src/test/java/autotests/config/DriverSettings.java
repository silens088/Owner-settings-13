package autotests.config;

//этот драйвер сеттингс мы перенесли в папку config - т.к красный путь Project.config.browser(); и import autotests.config.Project;

//package autotests.helpers;

//import autotests.config.Project;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class DriverSettings {

    //private static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    public static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public static void configure() {
        //методы из autotests/config/WebDriverConfig.java
        //Configuration.browser = Project.config.browser();
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.browserSize = config.getBrowserSize();
//        Configuration.baseUrl = App.config.webUrl();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-infobars");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--lang=en-en");

//        if (Project.isWebMobile()) { // for chrome only
//            Map<String, Object> mobileDevice = new HashMap<>();
//            mobileDevice.put("deviceName", Project.config.browserMobileView());
//            chromeOptions.setExperimentalOption("mobileEmulation", mobileDevice);
//        }

        //if (Project.isRemoteWebDriver()) { - было
        if (System.getProperty("environmentBrowser").equals("selenoid")) {
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", false);
            //Configuration.remote = Project.config.remoteDriverUrl();
            //Configuration.remote = config.remoteDriverUrl();
            //конфиг из autotests/config/WebDriverConfig.java
            Configuration.remote = config.remoteDriverUrl();
        }

        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        Configuration.browserCapabilities = capabilities;
        //add таймаут
        Configuration.timeout = 10000;
    }
}
