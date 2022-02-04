package autotests.tests;

import autotests.config.DriverSettings;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    //добавили::
//в этот тест бейс мы зашиваем конфиги и по итогу должно выглядить так:
    @BeforeAll
    static void setUp() {
        DriverSettings.configure();
    }
// вызывающий метод WebDriverUtil.configure(); - в DriverSettings

    //было
//    @BeforeAll
//    static void setUp() {
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
//        DriverSettings.configure();
//    }
//
//    @AfterEach
//    public void addAttachments() {
//        String sessionId = DriverUtils.getSessionId();
//
//        AllureAttachments.addScreenshotAs("Last screenshot");
//        AllureAttachments.addPageSource();
////        AllureAttachments.attachNetwork(); // todo
//        AllureAttachments.addBrowserConsoleLogs();
//
//        Selenide.closeWebDriver();
//
//        if (Project.isVideoOn()) {
//            AllureAttachments.addVideo(sessionId);
//        }
//    }
}
