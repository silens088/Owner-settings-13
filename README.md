![](src/images/logo_main.svg)

# UI web automation project for [kupithai.ru](https://kupithai.ru/)

## Technology Stack:

| Java | Selenide | Gradle | Junit5 | Selenoid | Jenkins | IntelliJ IDEA | Allure Report | Allure Testops | Telegram |
|:------:|:----:|:------:|:------:|:--------:|:--------:|:-------------:|:---------:|:---------:|:--------:|
| ![Java](src/images/icons/Java.png) | ![Selenide](src/images/icons/Selenide.png) | ![Gradle](src/images/icons/Gradle.png) | ![JUnit5](src/images/icons/JUnit5.png) | ![Selenoid](src/images/icons/Selenoid.png) | ![Jenkins](src/images/icons/Jenkins.png) | ![Intelij_IDEA](src/images/icons/Intelij_IDEA.png) | ![Allure Report](src/images/icons/Allure_Report.png) | ![AllureTestOps](src/images/icons/AllureTestOps.png) | ![Telegram](src/images/icons/Telegram.png) |



## Allure report


# Project in Allure TestOps with manual & automated tests
<a target="_blank" href="https://allure.autotests.cloud/project/%s">allure.autotests.cloud/project/%s</a> (ask admin@qa.guru for access)

# Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/%s">jenkins.autotests.cloud/job/%s</a>


## Launch options

####For run remote tests need fill remote.properties or to pass value:
* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)

Run tests with filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Run tests locally:
```bash
gradle clean test
```

Serve report:
```bash
allure serve build/allure-results
```

## Allure TestOps

Click <a target="_blank" href="https://allure.autotests.cloud/project/948/dashboards">here</a> to see a list of automated test cases.

Here are the test cases:

![](src/images/reports/AllureTestOps001.png)

Test launch overview:

![](src/images/reports/AllureTestOps002.png)



## Run tests - Jenkins job

Jenkins is a tool from where you can run the tests.
Click <a target="_blank" href="https://jenkins.autotests.cloud/job/009-Vitalii-ReqresApi/">here</a> to do that.

![](src/images/reports/Jenkins001.png)


### Allure report

Each test has request and response attached

![allure report](src/images/reports/AllureReport001.png)


### Telegram report

Each test builds sent report into telegram bot

![](src/images/reports/TelegramReport001.png)