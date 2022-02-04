[comment]: <> (![]&#40;src/images/logo_main.svg&#41;)

[comment]: <> (# UI web automation project for [kupithai.ru]&#40;https://kupithai.ru/&#41;)

[comment]: <> (## Technology Stack:)

[comment]: <> (| Java | Selenide | Gradle | Junit5 | Selenoid | Jenkins | IntelliJ IDEA | Allure Report | Allure Testops | Telegram |)

[comment]: <> (|:------:|:----:|:------:|:------:|:--------:|:--------:|:-------------:|:---------:|:---------:|:--------:|)

[comment]: <> (| ![Java]&#40;src/images/icons/Java.png&#41; | ![Selenide]&#40;src/images/icons/Selenide.png&#41; | ![Gradle]&#40;src/images/icons/Gradle.png&#41; | ![JUnit5]&#40;src/images/icons/JUnit5.png&#41; | ![Selenoid]&#40;src/images/icons/Selenoid.png&#41; | ![Jenkins]&#40;src/images/icons/Jenkins.png&#41; | ![Intelij_IDEA]&#40;src/images/icons/Intelij_IDEA.png&#41; | ![Allure Report]&#40;src/images/icons/Allure_Report.png&#41; | ![AllureTestOps]&#40;src/images/icons/AllureTestOps.png&#41; | ![Telegram]&#40;src/images/icons/Telegram.png&#41; |)


[comment]: <> (## Launch options)

[comment]: <> (####For run remote tests need fill remote.properties or to pass value:)

[comment]: <> (* browser &#40;default chrome&#41;)

[comment]: <> (* browserVersion &#40;default 89.0&#41;)

[comment]: <> (* browserSize &#40;default 1920x1080&#41;)

[comment]: <> (* browserMobileView &#40;mobile device name, for example iPhone X&#41;)

[comment]: <> (* remoteDriverUrl &#40;url address from selenoid or grid&#41;)

[comment]: <> (* videoStorage &#40;url address where you should get video&#41;)

[comment]: <> (* threads &#40;number of threads&#41;)

[comment]: <> (Run tests with filled remote.properties:)

[comment]: <> (```bash)

[comment]: <> (gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test)

[comment]: <> (```)

[comment]: <> (Run tests locally:)

[comment]: <> (```bash)

[comment]: <> (gradle clean test)

[comment]: <> (```)

[comment]: <> (Serve report:)

[comment]: <> (```bash)

[comment]: <> (allure serve build/allure-results)

[comment]: <> (```)

[comment]: <> (## Allure TestOps)

[comment]: <> (Click <a target="_blank" href="https://allure.autotests.cloud/project/968/dashboards">here</a> to see a list of automated test cases.)

[comment]: <> (Here are the test cases:)

[comment]: <> (![]&#40;src/images/screenshots/AllureTestops001.png&#41;)

[comment]: <> (Test launch overview:)

[comment]: <> (![]&#40;src/images/screenshots/AllureTestops002.png&#41;)


[comment]: <> (## Run tests - Jenkins job)

[comment]: <> (Jenkins is a tool from where you can run the tests.)

[comment]: <> (Click <a target="_blank" href="https://jenkins.autotests.cloud/job/009_Vitalii_Kupithai_UI_Automation/">here</a> to do that.)

[comment]: <> (![]&#40;src/images/screenshots/Jenkins001.png&#41;)


[comment]: <> (## Telegram report)

[comment]: <> (Each test builds sent report into telegram bot)

[comment]: <> (![]&#40;src/images/screenshots/TelegramReport001.png&#41;)