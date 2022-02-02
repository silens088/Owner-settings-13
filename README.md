![](src/images/logo_main.svg)

# UI web automation project for [kupithai.ru](https://kupithai.ru/)

## Technology Stack:

| Java | Selenide | Gradle | Junit5 | Selenoid | Jenkins | IntelliJ IDEA | Allure Report | Allure Testops | Telegram |
|:------:|:----:|:------:|:------:|:--------:|:--------:|:-------------:|:---------:|:---------:|:--------:|
| ![Java](src/images/icons/Java.png) | ![Selenide](src/images/icons/Selenide.png) | ![Gradle](src/images/icons/Gradle.png) | ![JUnit5](src/images/icons/JUnit5.png) | ![Selenoid](src/images/icons/Selenoid.png) | ![Jenkins](src/images/icons/Jenkins.png) | ![Intelij_IDEA](src/images/icons/Intelij_IDEA.png) | ![Allure Report](src/images/icons/Allure_Report.png) | ![AllureTestOps](src/images/icons/AllureTestOps.png) | ![Telegram](src/images/icons/Telegram.png) |

## Launch options

[comment]: <> (## Используемые технологии и инструменты)

[comment]: <> (![Intelij_IDEA]&#40;src/images/icons/Intelij_IDEA.png&#41;)

[comment]: <> (![Java]&#40;src/images/icons/Java.png&#41;)

[comment]: <> (![Selenide]&#40;src/images/icons/Selenide.png&#41;)

[comment]: <> (![Selenoid]&#40;src/images/icons/Selenoid.png&#41;)

[comment]: <> (![Gradle]&#40;src/images/icons/Gradle.png&#41;)

[comment]: <> (![JUnit5]&#40;src/images/icons/JUnit5.png&#41;)

[comment]: <> (![Allure Report]&#40;src/images/icons/Allure_Report.png&#41;)

[comment]: <> (![AllureTestOps]&#40;src/images/icons/AllureTestOps.png&#41;)

[comment]: <> (![Github]&#40;src/images/icons/Github.png&#41;)

[comment]: <> (![Jenkins]&#40;src/images/icons/Jenkins.png&#41;)

[comment]: <> (![Rest-Assured]&#40;src/images/icons/Rest-Assured.png&#41;)

[comment]: <> (![Telegram]&#40;src/images/icons/Telegram.png&#41;)

[comment]: <> (![Jira]&#40;src/images/icons/Jira.png&#41;)

[comment]: <> (![Lombok]&#40;src/images/icons/Lombok.png&#41;)



## Allure report

Each test has request and response attached

![allure report](./images/AllureReport.png)

## Response body

![allure report](./images/ResponseBody.png)


---

---

# Project in Allure TestOps with manual & automated tests
<a target="_blank" href="https://allure.autotests.cloud/project/%s">allure.autotests.cloud/project/%s</a> (ask admin@qa.guru for access)

# Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/%s">jenkins.autotests.cloud/job/%s</a>


# USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:
```bash
allure serve build/allure-results
```


###### For further development there are some example tests in src/test/java/cloud.autotests/tests/demowebshop
* remove @Disabled("...") annotation to run tests
```bash
gradle clean demowebshop
```

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
